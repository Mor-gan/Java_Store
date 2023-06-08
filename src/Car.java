public class Car {
    String color;
    int mpg;
    boolean isElectric;
    
    // constructor 1
    public Car(String carColor, int milesPerGallon) {
      color = carColor;
      mpg = milesPerGallon;
    
    }
    // constructor 2
    public Car(boolean electricCar, int milesPerGallon) {
      isElectric = electricCar;
      mpg = milesPerGallon;
    }
  
}