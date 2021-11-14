package by.home.module04.aggregation.task02.view;

import by.home.module04.aggregation.task02.entity.Car;

public class View {

	public void print(Car car) {

		System.out.println(" Марка машины " + car.getBrand());

	}

	public void print(String message, boolean isChanged) {

		System.out.println(message + isChanged);

	}

}
