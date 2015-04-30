package org.dzanab.openweather;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.IOException;


public class SerializationMain {
	public static void main(String[] args) {
		String json = "{\"lon\":18.36,\"lat\":43.85}";
		
		 Gson gson = new GsonBuilder().create();
		
		Coord coord = gson.fromJson(json, Coord.class);
		
		System.out.println(coord);
 
	}}