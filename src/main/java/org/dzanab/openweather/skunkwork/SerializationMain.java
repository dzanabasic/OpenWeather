package org.dzanab.openweather.skunkwork;

import org.dzanab.openweather.model.WeatherFull;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.IOException;


public class SerializationMain {
	public static void main(String[] args) {
String json = "{\"coord\":{\"lon\":18.36,\"lat\":43.85},\"sys\":{\"message\":1.0489,\"country\":\"BA\",\"sunrise\":1430365169,\"sunset\":1430416083},\"weather\":[{\"id\":802,\"main\":\"Clouds\",\"description\":\"scattered clouds\",\"icon\":\"03d\"}],\"base\":\"stations\",\"main\":{\"temp\":285.371,\"temp_min\":285.371,\"temp_max\":285.371,\"pressure\":915.35,\"sea_level\":1030.38,\"grnd_level\":915.35,\"humidity\":58},\"wind\":{\"speed\":1.21,\"deg\":218.002},\"clouds\":{\"all\":44},\"dt\":1430379449,\"id\":3191281,\"name\":\"Sarajevo\",\"cod\":200}";
		
		 Gson gson = new GsonBuilder().create();
		
		WeatherFull weatherfull = gson.fromJson(json, WeatherFull.class);
		
		System.out.println(weatherfull);
 
	}}