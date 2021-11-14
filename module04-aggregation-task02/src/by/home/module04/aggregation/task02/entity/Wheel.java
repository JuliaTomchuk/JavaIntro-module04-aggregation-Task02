package by.home.module04.aggregation.task02.entity;

public class Wheel {

	private int loadIndex;
	private int width;
	private int diameter;

	public Wheel() {
		loadIndex = 90;
		width = 20;
		diameter = 50;
	}

	public Wheel(int loadIndex, int width, int diameter) {
		this.loadIndex = loadIndex;
		this.width = width;
		this.diameter = diameter;
	}

	public int getLoadIndex() {
		return loadIndex;
	}

	public void setLoadIndex(int loadIndex) {
		this.loadIndex = loadIndex;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diameter;
		result = prime * result + loadIndex;
		result = prime * result + width;
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
		Wheel other = (Wheel) obj;
		if (diameter != other.diameter)
			return false;
		if (loadIndex != other.loadIndex)
			return false;
		if (width != other.width)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[loadIndex=" + loadIndex + ", width=" + width + ", diameter=" + diameter
				+ "]";
	}

}
