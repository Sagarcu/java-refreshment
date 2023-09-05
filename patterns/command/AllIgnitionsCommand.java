package patterns.command;

import java.util.List;

public class AllIgnitionsCommand implements Command {

    private List<Car> cars;

    public AllIgnitionsCommand(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public void execute() {
        for(Car car: cars) {
            if (!car.isOn()) {
                car.toggle();
            }

        }
    }

    @Override
    public void reset() {

    }
}
