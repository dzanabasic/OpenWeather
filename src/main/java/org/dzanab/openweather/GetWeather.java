package org.dzanab.openweather;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.dzanab.openweather.model.WeatherFull;

/**
 *
 * @author ubuntu
 */
public class GetWeather {

	public String getCurrentWeather(String city, String code) throws IOException{
		
		HttpClient client = HttpClientBuilder.create().build();
	
		
		HttpUriRequest httpUriRequest = new HttpGet("http://api.openweathermap.org/data/2.5/weather?q="+city+"."+code);
		final HttpResponse httpResponse = client.execute(httpUriRequest);

		final String result = EntityUtils.toString(httpResponse.getEntity());
		
	
	

String json = "{\"coord\":{\"lon\":18.36,\"lat\":43.85},\"sys\":{\"message\":1.0489,\"country\":\""+code+"\",\"sunrise\":1430365169,\"sunset\":1430416083},\"weather\":[{\"id\":802,\"main\":\"Clouds\",\"description\":\"scattered clouds\",\"icon\":\"03d\"}],\"base\":\"stations\",\"main\":{\"temp\":285.371,\"temp_min\":285.371,\"temp_max\":285.371,\"pressure\":915.35,\"sea_level\":1030.38,\"grnd_level\":915.35,\"humidity\":58},\"wind\":{\"speed\":1.21,\"deg\":218.002},\"clouds\":{\"all\":44},\"dt\":1430379449,\"id\":3191281,\"name\":\""+city+"\",\"cod\":200}";
		
		 Gson gson = new GsonBuilder().create();
		
		WeatherFull weatherfull = gson.fromJson(json, WeatherFull.class);
		
		System.out.println(weatherfull);
		return result;
	}}