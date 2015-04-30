package org.dzanab.openweather;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author ubuntu
 */
public class JavatoJson {
	public static void main(String[] args) {
		Coord coord1=new Coord();
	coord1.setLat(3.4);
	coord1.setLon(56);
	
	
	 Gson gson = new GsonBuilder().create();
	 
	String toJson=gson.toJson(coord1);
		System.out.println(toJson);
	
	}

}
