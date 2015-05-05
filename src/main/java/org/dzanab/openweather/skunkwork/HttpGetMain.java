package org.dzanab.openweather.skunkwork;

import java.io.*;
import java.net.URI;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class HttpGetMain {

	public static void main(String[] args) throws IOException {
		// Create an instance of HttpClient.
		HttpClient client = HttpClientBuilder.create().build();
	
		
		HttpUriRequest httpUriRequest = new HttpGet("http://api.openweathermap.org/data/2.5/weather?q=Sarajevo,ba");
		final HttpResponse httpResponse = client.execute(httpUriRequest);

		final String result = EntityUtils.toString(httpResponse.getEntity());
		System.out.println(result);
	}
}
