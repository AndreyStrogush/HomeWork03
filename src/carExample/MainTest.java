package carExample;

import java.time.LocalDate;

public class MainTest {
    public static void main(String[] args) {
        Car myCar = new Car(LocalDate.now(),"Diesel", 180, 6.2d, 7, 2, 0);
        myCar.setTheDefoltSetOfDoors();
        myCar.setTheDefoltSetOfWheels();

            CarRunner.runCar(myCar);
    }

}
