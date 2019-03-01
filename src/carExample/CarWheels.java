package carExample;

public class CarWheels {
    private double wheelState;

    //constructors
    public CarWheels() {
        wheelState = 1;
    }

    public CarWheels(double wheelState) {
        this.wheelState = wheelState;
    }

    //methods
    public double getWheelState() {
        return wheelState;
    }

    public void setWheelState(double wheelState) {
        this.wheelState = wheelState;
    }

    public void newWheel() {
        wheelState = 1;
    }

    public void changeWheelState(int i) {
        //check if we use correct number
        if (i < 100) {
            double procent = i / 100;
            //check - can we reduce state of the wheel on actual number
            if (wheelState > procent) {
                wheelState = wheelState - procent;
            } else {
                //if reduction is lager then actual condition just set 0 state
                wheelState = 0;
            }
        } else {
            System.out.println("Wrong input, try again");
        }
    }//end of changeWheelState

    public void printInfoOfCarWheels() {
        System.out.println("wheel worn out at " + (1 - wheelState) * 100 + " percent, \n" +
                "the wheel has a margin of safety " + wheelState * 100 + " percent");
    }

    @Override
    public String toString() {
        return "CarWheels{" +
                "wheelState=" + wheelState +
                '}';
    }
}
/*
Класс CarWheel
На прямую к переменным этого класса никто не может, только через методы
Хранит
•	Состояние целостности шины (дробное число от 0-стерта до 1-новая)
Конструктор
•	Аналогичный принцип как в классе CarDoor
Методы
•	Сменить шину на новую
•	Стереть шину на X%
•	Получить состояние (return)
•	Вывести в консоль данные об объекте
 */