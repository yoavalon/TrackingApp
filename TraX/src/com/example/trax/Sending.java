package com.example.trax;

import java.net.URI;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.location.Location;
import android.util.Log;

public class Sending implements Runnable{

	private String URL = null;
	
    public Sending(String URL){
		
		this.URL = URL;
    			
	}
	
    public void run(){
		  
		  HttpResponse response = null;
       try 														// Send URL to server
       {
      	 // Create http client object to send request to server     
	          HttpClient client = new DefaultHttpClient();
	       	         
	          // Create Request to server and get response
	          HttpGet httpget= new HttpGet();
	          httpget.setURI(new URI(URL));
	    
	          System.out.println("URL which was send: " + URL);
	          
	          response = client.execute(httpget);
	        
	          System.out.println("Success (Sending)");
       } 
       catch (Exception e)
       {
      	System.out.println("Failure (Sending)"); 
       }
	  }	  	
	
}
