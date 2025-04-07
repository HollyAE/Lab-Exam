
public class RaceCar implements Observer {
	
	protected int metersTravelled = 0;
	private String manufacturer;
	private String carName;
	protected WeatherType weather;
	protected DriveBehaviour driveBehaviour;

	
	
	
	public RaceCar(String manufacturer, String carName, DriveBehaviour driveBehaviour) {
		this.manufacturer = manufacturer;
		this.carName = carName;
		this.driveBehaviour = driveBehaviour;
	}
	
	
	
	public void update(WeatherType updatedWeather) {
		this.weather = updatedWeather;
	}
	
	

	public void driveCar() {
		int distance = driveBehaviour.drive(this);
		metersTravelled += distance;
	}
	
	
	
	public void changeDrivingBehaviour(DriveBehaviour newDriveBehaviour) {
		driveBehaviour = newDriveBehaviour;
	}

	
	
	public String getCarName() {
		return carName;
	}
	
	
	
	public String getCarMake() {
		return manufacturer;
	}
	
	
	
	public String getStatus() {
		return carName + " built by " + manufacturer + " has travelled " + metersTravelled +" meters";
	}
	

}
