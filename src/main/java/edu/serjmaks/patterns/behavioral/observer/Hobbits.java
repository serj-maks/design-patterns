package edu.serjmaks.patterns.behavioral.observer;

public class Hobbits implements WeatherObserver {
    @Override
    public void update(WeatherType currentWeather) {
        System.out.println("The hobbits are facing weather now: " + currentWeather.getDescription());
    }
}
