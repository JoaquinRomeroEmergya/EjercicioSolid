package es.emergya.labs.training.solid_java_1.dip.excercise_00;

public class Fan implements Device{
	
	private int color;

	public void turnOn() {

		System.out.println("Fan turned on");
	}

	public void turnOff() {

		System.out.println("Fan turned off");
	}

	public int getColor() {

		return color;
	}

	public void setColor(int color) {

		this.color = color;
	}
}
