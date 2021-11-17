package es.emergya.labs.training.solid_java_1.dip.excercise_00;

public class Lamp implements Device {

	private int color;

	public void turnOn() {

		System.out.println("Lamp turned on");
	}

	public void turnOff() {

		System.out.println("Lamp turned off");
	}

	public int getColor() {

		return color;
	}

	public void setColor(int color) {

		this.color = color;
	}
}
