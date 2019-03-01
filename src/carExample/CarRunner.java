package carExample;

import java.util.Scanner;

public class CarRunner {

    public static void runCar(Car myCar) {

        System.out.println("\n Choose your action: \n" +
                "1. Print information about car \n" +
                "2. Add passenger \n" +
                "3. Remove passenger \n" +
                "4. Remove all passengers \n" +
                "5. Install new wheels \n" +
                "6. Remove all wheels \n" +
                "7. Set current speed \n" +
                "8. Get information about exact wheel \n" +
                "9. Get information about exact door \n" +
                "10. Change door state \n" +
                "11. Change window state \n" +
                "12. Print information about door \n" +
                "13. Print information about wheel \n" +
                "14. Change wheel state \n" +
                "15. Change wheel in to new one \n");

        Scanner sc = new Scanner(System.in);
        int choiсe = sc.nextInt();

        switch (choiсe) {
            case 1:
                myCar.printInfoAboutCar();
                break;
            case 2:
                myCar.addPassenger();
                break;
            case 3:
                myCar.removePassenger();
                break;
            case 4:
                myCar.removeAllPassengers();
                break;
            case 5:
                System.out.println("Enter number of wheels to install");
                myCar.installNewWeels(sc.nextInt());
                break;
            case 6:
                myCar.removeAllWeels();
                break;
            case 7:
                System.out.println("Enter current speed");
                myCar.setCurrentSpeed(sc.nextInt());
                break;
            case 8:
                System.out.println("Enter number of wheel fo which you wont to see information ");
                myCar.getCarWeels(sc.nextInt());
                break;
            case 9:
                System.out.println("Enter number of wheel fo which you wont to see information ");
                myCar.getCarDoors(sc.nextInt());
                break;
            case 10:
                System.out.println("Enter index number of door to change");
                myCar.getCarDoors(sc.nextInt() - 1).changeDoorState();
                break;
            case 11:
                System.out.println("Enter index number of window to change");
                myCar.getCarDoors(sc.nextInt() - 1).changeWindowState();
                break;
            case 12:
                System.out.println("Enter index number of door");
                myCar.getCarDoors(sc.nextInt() - 1).printDoorsInfo();
                break;
            case 13:
                System.out.println("Enter index number of wheel");
                myCar.getCarWeels(sc.nextInt() - 1).printInfoOfCarWheels();
                break;
            case 14:
                System.out.println("Enter index number of wheel");
                int n = sc.nextInt() - 1;
                System.out.println("Enter the amount of redusing wheel state (from 0 to 100");
                myCar.getCarWeels(n).changeWheelState(sc.nextInt());
                break;
            case 15:
                System.out.println("Enter index number of wheel");
                myCar.getCarWeels(sc.nextInt() - 1).newWheel();
                break;
            default:
                System.out.println("Wrong input");
                break;
        }
    }
}
/*
Задание 2 (дополнительное)
Создать консольный пользовательский интерфейс. В котором пользователя программа будет спрашивать какое действие выполнить
и с какими параметрами.
Кол-во различных действий = кол-ву функций в ДЗ.
 */