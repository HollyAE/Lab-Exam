Design Pattern Explanation

Observer Pattern:   
I used the observer pattern to allow RaceWeather to
update RaceCar about the weather throughout a race. I did this by
creating a Subject interface which RaceWeather implements, and an
Observer interface which RaceCar implements. RaceWeather implements the
three methods from the Subject interface: registerObserver (for adding
new observers to the list 'observers' in RaceWeather), removeObserver
(for removing an observer from 'observers'), and notifyObservers (calls
the update method on each observer in 'observers'). RaceCar implements
the one method in the Observer interface: update (for updating RaceCar's
weather field). These two interfaces could be used for future classes
which wish to send out/receive updates.

Strategy Pattern:   
I used the strategy pattern to ensure a racer's driving
behaviour could be altered at runtime. I did this by creating a
DriveBehaviour interface and then two classes DriveCautiously and
DriveFast which extend DriveBehaviour. The two classes both implement
the one method in DriveBehaviour: drive (changes the distance a driver
travels depending on the weather). The RaceCar class has a field of type
DriveBehaviour which can be set to either behaviour. The DriveBehaviour
interface allows future new driving behaviours to be added without the
need to alter the code in RaceCar.
