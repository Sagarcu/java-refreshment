package patterns.command;

public class ToggleCommand implements Command {

    private Car car;

    public ToggleCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.toggle();
    }

    @Override
    public void reset() {

    }
}
