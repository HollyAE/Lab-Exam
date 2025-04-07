import java.util.ArrayList;

public class Race {
	
	private RaceWeather raceWeather;
	private int raceTrackDistance;
	private ArrayList<RaceCar> racers = new ArrayList<RaceCar>();
	private final int numberOfStepsToChange = 5;
	
	
	
	
	public Race(WeatherType weather, int raceTrackDistance) {
		raceWeather = new RaceWeather(weather);
		this.raceTrackDistance = raceTrackDistance;
	}
	
	
	
	private String getOutcome() {
		ArrayList<RaceCar> winners = new ArrayList<RaceCar>();
		for (RaceCar racer: racers) {
			if (racer.metersTravelled >= raceTrackDistance) {
				winners.add(racer);
			}
		}
		if (winners.size() > 1) {
			return "TIE";
		} 
		else {
			RaceCar winner = winners.get(0);
			String winnerString = "WINNER: " + winner.getCarName() + ", " + winner.getCarMake();
			return winnerString;
		}
	}

	
	
	public void progressWeather() {
		raceWeather.changeWeather();
	}
	
	
	
	public void changeCarBehaviour(int position, DriveBehaviour newDrivingBehaviour) {
		// to implement
		RaceCar racer = racers.get(position);
		racer.changeDrivingBehaviour(newDrivingBehaviour);
	}

	
	
	public void raceStep() {
		for (RaceCar racer: racers) {
			racer.driveCar();
			System.out.println(racer.getStatus());
		}
	}

	
	
	public boolean isFinished() {
		for (RaceCar racer: racers) {
			if (racer.metersTravelled >= raceTrackDistance) {
				return true;
			}
		}
		return false;
	}

	
	
	private void makeFourCars() {
		RaceCar racer1 = new RaceCar("Fjord", "Car 1", new DriveCautiously());
		RaceCar racer2 = new RaceCar("Fjord", "Car 2", new DriveFast());
		RaceCar racer3 = new RaceCar("Furbi", "Car 3", new DriveCautiously());
		RaceCar racer4 = new RaceCar("Furbi", "Car 4", new DriveFast());
		racers.add(racer1);
		racers.add(racer2);
		racers.add(racer3);
		racers.add(racer4);
		for (RaceCar racer: racers) {
			raceWeather.registerObserver(racer);
		}
		raceWeather.notifyObservers();
	}

	
	
	public void raceCars(){
		int stepCount = 0;
		while(!isFinished()) {
			stepCount++;
			raceStep();
			if (stepCount%numberOfStepsToChange==0) {
				progressWeather();
			}
		}
	}
	

	
	
	public static void main(String[]args)    {
		Race race = new Race(WeatherType.DRY, 100);
		race.makeFourCars();
		race.raceCars();
		System.out.println(race.getOutcome());
	}
}
