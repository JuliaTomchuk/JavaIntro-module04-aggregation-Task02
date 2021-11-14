package by.home.module04.aggregation.task02.entity;

public class Engine {

	private int power;
	private int numberOfcylinders;
	private MotorPowerType powerType;
	private boolean isRunning;

	public Engine() {
		power = 240;
		numberOfcylinders = 4;
		powerType = MotorPowerType.DIESEL;
		isRunning = false;
	}

	public Engine(int power, int numberOfcylinders, MotorPowerType type, boolean isRunning) {
		this.power = power;
		this.numberOfcylinders = numberOfcylinders;
		this.powerType = type;
		this.isRunning = isRunning;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getNumberOfcylinders() {
		return numberOfcylinders;
	}

	public void setNumberOfcylinders(int numberOfcylinders) {
		this.numberOfcylinders = numberOfcylinders;
	}

	public MotorPowerType getPowerType() {
		return powerType;
	}

	public void setPowerType(MotorPowerType powerType) {
		this.powerType = powerType;
	}

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isRunning ? 1231 : 1237);
		result = prime * result + numberOfcylinders;
		result = prime * result + power;
		result = prime * result + ((powerType == null) ? 0 : powerType.hashCode());
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
		Engine other = (Engine) obj;
		if (isRunning != other.isRunning)
			return false;
		if (numberOfcylinders != other.numberOfcylinders)
			return false;
		if (power != other.power)
			return false;
		if (powerType != other.powerType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [power=" + power + ", numberOfcylinders=" + numberOfcylinders
				+ ", powerType=" + powerType + ", isRunning=" + isRunning + "]";
	}

}
