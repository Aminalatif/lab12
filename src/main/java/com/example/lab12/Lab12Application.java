package com.example.lab12;
import com.example.lab12.observer.*;
import com.example.lab12.subject.WeatherStation;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab12Application {
		public static void main(String[] args) {
			WeatherStation station = new WeatherStation();

			Observer display = new DigitalDisplay();
			Observer stats = new StatisticsBoard();
			Observer mobile = new MobileAlertSystem();

			// Register initial observers
			station.registerObserver(display);
			station.registerObserver(stats);
			station.registerObserver(mobile);

			// Set new weather data
			station.setWeatherData(30.5f, 65.0f);

			// Add new observer dynamically
			Observer newsChannel = new NewsChannel();
			station.registerObserver(newsChannel);

			// New weather data triggers update to all including NewsChannel
			station.setWeatherData(28.3f, 70.2f);
		}}
