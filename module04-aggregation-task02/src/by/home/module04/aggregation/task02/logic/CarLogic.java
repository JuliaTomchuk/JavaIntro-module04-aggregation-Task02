package by.home.module04.aggregation.task02.logic;

import by.home.module04.aggregation.task02.entity.Car;
import by.home.module04.aggregation.task02.entity.Wheel;

public class CarLogic {

	public boolean fuel(Car car) {
		car.setFilled(true);
		return car.isFilled();
	}

	public boolean drive(Car car) {
		car.getEngine().setRunning(true);

		return car.getEngine().isRunning();
	}

	public boolean changeWheel(Car car) {
		car.getWheels().set(0, new Wheel());
		return true;
	}

}
