package patterns.command;

// This is a receiver
public class Car {

    private boolean isOn = false;
    private String carBrand;

    public Car(String carBrand) {
        this.carBrand = carBrand;
    }

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

    public void on() {
        System.out.println("The " + carBrand + " is now on!");
    }

    public void off() {
        System.out.println("The " + carBrand + " is now turned off!");
    }

    public boolean isOn() {
        return isOn;
    }
}
