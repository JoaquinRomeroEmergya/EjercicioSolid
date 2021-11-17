package es.emergya.labs.training.solid_java_1.lsp.excercise_00;

public class Duck extends Bird implements FlyingBirdsI{

	public Duck (String name) {
		super(name);

	}


	public void fly() throws Exception {
		System.out.println(this.getClass().getName() + ":" + super.name + " is flying");
	}

}
