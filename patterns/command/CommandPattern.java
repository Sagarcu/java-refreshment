package patterns.command;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CommandPattern {

    public static void main(String[] args) {
        Car mercedes = new Car("mercedes");
        Car audi = new Car("audi");
        Car opel = new Car("opel");
        Van unmarked = new Van();
        Ignition ignition = new Ignition();

        Command command = new ToggleCommand(mercedes);
        ignition.storeAndExecute(command);

        List<Car> cars = new ArrayList<>();
        Collections.addAll(cars, mercedes, audi, opel);

        Command allIgnitionsCommand = new AllIgnitionsCommand(cars);
        ignition.storeAndExecute(allIgnitionsCommand);
    }


}
