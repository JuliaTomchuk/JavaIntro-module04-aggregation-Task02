package by.home.module04.aggregation.task02.entity;

import java.util.ArrayList;
import java.util.List;

public class Car {

	private List<Wheel> wheels;
	private Engine engine;
	private String brand;
	private boolean filled;

	public Car() {
		wheels = new ArrayList<>();
		engine = new Engine();
		brand = "";
		filled = false;
	}

	public Car(List<Wheel> wheels, Engine engine, String brand, boolean filled) {
		this.wheels = wheels;
		this.engine = engine;
		this.brand = brand;
		this.filled = filled;
	}

	public List<Wheel> getWheels() {
		return wheels;
	}

	public void setWheels(List<Wheel> wheels) {
		this.wheels = wheels;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + (filled ? 1231 : 1237);
		result = prime * result + ((wheels == null) ? 0 : wheels.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (filled != other.filled)
			return false;
		if (wheels == null) {
			if (other.wheels != null)
				return false;
		} else if (!wheels.equals(other.wheels))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [wheels=" + wheels + ", engine=" + engine + ", brand=" + brand
				+ ", filled=" + filled + "]";
	}

}
