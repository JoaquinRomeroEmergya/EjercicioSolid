package es.emergya.labs.training.solid_java_1.dip.excercise_00;

public class Button {

	private Device device;
	private boolean state;

	public Button (Device device) {

		this.device = device;
	}

	public void toggle() {

		state = !state;

		boolean buttonOn = state;

		if (buttonOn) {

			device.turnOn();

		} else {

			device.turnOff();
		}
	}
}
