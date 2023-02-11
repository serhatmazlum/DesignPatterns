package MementoPattern;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        careTaker.push(originator.save("value1"));
        careTaker.push(originator.save("value2"));
        careTaker.push(originator.save("value3"));

        originator.undo(careTaker.pop());
        originator.undo(careTaker.pop());
    }
}
