package by.home.module04.aggregation.task02.main;

import java.util.ArrayList;
import java.util.List;

import by.home.module04.aggregation.task02.entity.Car;
import by.home.module04.aggregation.task02.entity.Engine;
import by.home.module04.aggregation.task02.entity.MotorPowerType;
import by.home.module04.aggregation.task02.entity.Wheel;
import by.home.module04.aggregation.task02.logic.CarLogic;
import by.home.module04.aggregation.task02.view.View;

/*Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 * Методы:ехать, заправляться, менять колесо, вывести на консоль марку автомобиля*/

public class Main {

	public static void main(String[] args) {
		List<Wheel> wheels = new ArrayList<>();

		wheels.add(new Wheel(84, 75, 12));
		wheels.add(new Wheel(84, 75, 12));
		wheels.add(new Wheel(84, 75, 12));
		wheels.add(new Wheel(84, 75, 12));

		Engine myEngine = new Engine();

		myEngine.setPower(148);
		myEngine.setNumberOfcylinders(6);
		myEngine.setPowerType(MotorPowerType.GASOLINE);

		Car myCar = new Car(wheels, myEngine, "Toyota", false);

		CarLogic logic = new CarLogic();

		View view = new View();

		boolean isFuel = logic.fuel(myCar);

		view.print("Машина заправлена: ", isFuel);

		boolean isDrive = logic.drive(myCar);

		view.print("Машина едет: ", isDrive);

		boolean isChanged = logic.changeWheel(myCar);

		view.print("Колесо заменили: ", isChanged);

		view.print(myCar);

	}

}
