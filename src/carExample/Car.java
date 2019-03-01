package carExample;

import java.util.ArrayList;
import java.util.List;

class Car {
    private final String productionDate;
    private String engineType;
    private int maxSpeed;
    private double timeToHundreetKPH;
    private int maxNumberOfPassengers;
    private int actualNumberOfPassengers;
    private int currentSpeed;
    private List<CarWheels> wheels = new ArrayList<>();
    private List<CarDoors> doors = new ArrayList<>();

    public Car(String productionDate) {
        this.productionDate = productionDate;
    }

    public Car(String productionDate, String engineType, int maxSpeed, double timeToHundreetKPH,
               int maxNumberOfPassengers, int actualNumberOfPassengers, int currentSpeed) {
        this.productionDate = productionDate;
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.timeToHundreetKPH = timeToHundreetKPH;
        this.maxNumberOfPassengers = maxNumberOfPassengers;
        this.actualNumberOfPassengers = actualNumberOfPassengers;
        this.currentSpeed = currentSpeed;
    }

    public void setCurrentSpeed(int speed) {
        this.currentSpeed = speed;
    }

    public void addPassenger() {
        if (actualNumberOfPassengers < maxNumberOfPassengers) {
            actualNumberOfPassengers++;
        } else {
            System.out.println("Car is already full");
        }
    }

    public void removePassenger() {
        if (actualNumberOfPassengers > 0) {
            actualNumberOfPassengers--;
        } else {
            System.out.println("Car is already empty");
        }
    }

    public void removeAllPassengers() {
        if (actualNumberOfPassengers > 0) {
            actualNumberOfPassengers = 0;
        } else {
            System.out.println("Car is already empty");
        }
    }

    public CarDoors getCarDoors(int i) {
        if (i <= doors.size()) {
            return doors.get(i);
        } else {
            System.out.println("Wrong index");
            return doors.get(doors.size());
        }
    }

    public CarWheels getCarWeels(int i) {
        if (i <= wheels.size()) {
            return wheels.get(i);
        } else {
            System.out.println("Wrong index");
            return wheels.get(wheels.size());
        }
    }

    public void removeAllWeels() {
        for (CarWheels weel : wheels) {
            weel = null;
        }
    }

    public void installNewWeels(int numberToInstall) {
        for (int i = 0; i < numberToInstall; i++) {
            wheels.add(new CarWheels(0.5));
        }
    }

    public void calculateActualMaxSpeed() {
        if (actualNumberOfPassengers == 0) {
            System.out.println("There is nobody in the car, speed is 0");
            return;
        }
        double worstWheel = 1;
        for (CarWheels wheel : wheels) {
            if (wheel.getWheelState() < worstWheel) {
                worstWheel = wheel.getWheelState();
            }
        }
        System.out.println("Actual maximum speed is " + maxSpeed * worstWheel + " kmph");
    }

    //set the default set of wheels
    public void setTheDefoltSetOfWheels() {
        for (int wheel = 0; wheel < 5; wheel++){
            wheels.add(new CarWheels(0.5));
        }
    }

    //set the default set of doors
    public void setTheDefoltSetOfDoors() {
        for (int door =0; door < 5; door++) {
            doors.add(new CarDoors(false, false));
        }

    }

    public void printInfoAboutCar() {
        System.out.println("\t Car Information \n" +
                "Date of production is: " + productionDate + "\n" +
                "engine type is: " + engineType + "\n" +
                "maximum speed is: " + maxSpeed + " kmph \n" +
                "time to get to 100 kmph is: " + timeToHundreetKPH + " seconds \n" +
                "maximum number of passengers is: " + maxNumberOfPassengers + " passengers \n" +
                "actual number of passengers is: " + actualNumberOfPassengers + " passengers \n" +
                "current speed is: " + currentSpeed + " kmph");
        for (CarWheels wheel : wheels) {
            System.out.println("Wheel # " + wheels.indexOf(wheel));
            wheel.printInfoOfCarWheels();
        }
        for (CarDoors door : doors) {
            System.out.println("Wheel # " + doors.indexOf(door));
            door.printDoorsInfo();
        }
        calculateActualMaxSpeed();
    }
}
/*
Класс Car
Методы
•	Изменить текущую скорость
•	Посадить 1 пассажира в машину
•	Высадить 1 пассажира
•	Высадить всех пассажиров
•	Получить дверь по индексу
•	Получить колесо по индексу
•	Снять все колеса с машины
•	Установить на машину X новых колесу (вдобавок к имеющимся, то есть если было 4 колеса,
после вызова метода с Х аргументом равным трем, колес будет 4+3=7)
•	Вычислить текущую возможную максимальную скорость (Скорость машины вычисляется так.
 Максимальная скорость новой машины множиться на самое стертое колесо в машине.
 Максимальная скорость равна 0 если в машине нет ни одного пассажира, так как некому ее вести)
•	Вывести в консоль данные об объекте (все поля и вычисленную максимальную скорость
в зависимости от целостности колес и наличия водителя)

На прямую к переменным этого класса никто не может, только через методы
Хранит
•	дата производства (неизменна после создания объекта)
•	тип двигателя
•	максимальная скорость машины (если она новая)
•	время разгона до 100км/ч
•	пассажировместимость
•	кол-во пассажиров внутри в данный момент
•	текущая скорость
•	массив колес
•	массив дверей
Конструктор
•	Нет пустого конструктора. Так как есть поля в классе, которые нельзя изменять после создания объекта. Например дата производства.
•	Конструктор с датой производства.
•	Конструктор со всеми полями, кроме массива колес и массива дверей.
 */