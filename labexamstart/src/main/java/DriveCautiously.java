
public class DriveCautiously implements DriveBehaviour {
	
	public int drive(RaceCar car) {
		if (car.weather == WeatherType.DRY || car.weather == WeatherType.MISTY || car.weather == WeatherType.WET) {
			return 10;
		} 
		else {
			//if the weatherType isn't one of the defined types
			return 0;
		}
	}

}
