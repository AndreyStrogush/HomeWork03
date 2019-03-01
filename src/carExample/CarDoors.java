package carExample;

public class CarDoors {
    private boolean doorIsOpen;
    private boolean windowIsOpen;
    //constructors
    public CarDoors() {
    }

    public CarDoors(boolean doorIsOpen, boolean windowIsOpen) {
        this.doorIsOpen = doorIsOpen;
        this.windowIsOpen = windowIsOpen;
    }
    //metods
    public void setOpenDoor() {
        this.doorIsOpen = true;
    }

    public void setCloseDoor() {
        this.doorIsOpen = false;
    }

    public void changeDoorState() {
        if (doorIsOpen) {
            setCloseDoor();
        } else {
            setOpenDoor();
        }
    }

    public void setOpenWindow() {
        this.windowIsOpen = true;
    }

    public void setCloseWindow() {
        this.windowIsOpen = false;
    }

    public void changeWindowState() {
        if (windowIsOpen) {
            setCloseWindow();
        } else {
            setOpenWindow();
        }
    }

    public void printDoorsInfo() {
        System.out.println("The door is now " + (doorIsOpen ? "open " : "close ") +
                " \n The window is now " + (windowIsOpen ? "open " : "close "));
    }

    @Override
    public String toString() {
        return "CarDoors{" +
                "doorIsOpen=" + doorIsOpen +
                ", windowIsOpen=" + windowIsOpen +
                '}';
    }
}
/*
Класс CarDoor
На прямую к переменным этого класса никто не может, только через методы
Хранит
•	состояние двери(открыта/закрыта)
•	состояние окна (открыто/закрыто)
Конструктор
•	Один без аргументов. Он должен присвоить переменным значения на случай если данных нет.
•	Один конструктор принимает оба состояния, двери и окна. Присваивает эти значения переменным внутри объекта.
Методы
•	открыть дверь
•	закрыть дверь
•	открыть/закрыть дверь (если дверь открыта и вызывается эта функция, значит дверь необходимо закрыть и наоборот)
•	открыть окно
•	закрыть окно
•	открыть/закрыть окно(если дверь открыта и вызывается эта функция, значит дверь необходимо закрыть и наоборот)
•	Вывести в консоль данные об объекте
 */