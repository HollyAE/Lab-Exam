import java.util.ArrayList;

public class RaceWeather implements Subject{
	
	private WeatherType weather;
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	
	
	
	public RaceWeather(WeatherType weather) {
		this.weather = weather;
	}
	
	
	
	public void removeObserver(Observer observer) {
		int observerIndex = observers.indexOf(observer);
		if (observerIndex >= 0) {
			observers.remove(observerIndex);
		}
	}
	
	
	
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	
	
	public void notifyObservers() {
		for (Observer observer: observers) {
			observer.update(weather);
		}
	}
	
	

	public void changeWeather() {
		weather = weather.next();
		notifyObservers();
	}
	
	
	
	public WeatherType getWeather() {
		return weather;
	}
	
	
	
}
