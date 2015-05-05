package org.dzanab.openweather;

import java.io.IOException;

/**
 *
 * @author ubuntu
 */
public class App {
	public static void main(String[] args) throws IOException {
		GetWeather c= new GetWeather();
		System.out.println(c.getCurrentWeather("Sarajevo","ba"));
		System.out.println(c.getCurrentWeather("London","uk"));
	}
}
