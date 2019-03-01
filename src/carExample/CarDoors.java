package carExample;

public class CarDoors {
    private boolean isDoorOpen;
    private boolean isWindowOpen;
    //constructors
    public CarDoors() {
    }

    public CarDoors(boolean doorIsOpen, boolean windowIsOpen) {
        this.isDoorOpen = doorIsOpen;
        this.isWindowOpen = windowIsOpen;
    }
    //metods
    public void setOpenDoor() {
        this.isDoorOpen = true;
    }

    public void setCloseDoor() {
        this.isDoorOpen = false;
    }

    public void changeDoorState() {
        if (isDoorOpen) {
            setCloseDoor();
        } else {
            setOpenDoor();
        }
    }

    public void setOpenWindow() {
        this.isWindowOpen = true;
    }

    public void setCloseWindow() {
        this.isWindowOpen = false;
    }

    public void changeWindowState() {
        if (isWindowOpen) {
            setCloseWindow();
        } else {
            setOpenWindow();
        }
    }

    public void printDoorsInfo() {
        System.out.println("The door is now " + (isDoorOpen ? "open " : "close ") +
                " \n The window is now " + (isWindowOpen ? "open " : "close "));
    }

    @Override
    public String toString() {
        return "CarDoors{" +
                "doorIsOpen=" + isDoorOpen +
                ", windowIsOpen=" + isWindowOpen +
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