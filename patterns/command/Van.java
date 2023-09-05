package patterns.command;

//This is also a receiver.
public class Van {
    private boolean isOn = false;

    public void toggle() {
        if (isOn) {
            off();
            isOn = false;
        }
        else {
            on();
            isOn = true;
        }
    }

    public void off() {
        System.out.println("The van is now turned off!");
    }

    public void on() {
        System.out.println("The van is now on!");
    }
}
