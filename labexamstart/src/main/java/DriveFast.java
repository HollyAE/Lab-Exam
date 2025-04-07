
public class DriveFast implements DriveBehaviour{
	
	public int drive(RaceCar car) {
		if (car.weather == WeatherType.DRY) {
			return 20;
		} 
		else if (car.weather == WeatherType.MISTY) {
			return 5;
		} 
		else if (car.weather == WeatherType.WET) {
			return 8;
		} 
		else {
			//if the weatherType isn't one of the defined types
			return 0;
		}
	}

}
