package org.dzanab.openweather;

import java.io.IOException;
import org.dzanab.openweather.api.WeatherApi;

/**
 *
 * @author ubuntu
 */
public class App {

	public static void main(String[] args) throws IOException {
		WeatherApi weatherApi = new WeatherApi();
		System.out.println(weatherApi.getCurrentWeather("Sarajevo", "ba"));
		System.out.println(weatherApi.getCurrentWeather("London", "uk"));
	}
}
