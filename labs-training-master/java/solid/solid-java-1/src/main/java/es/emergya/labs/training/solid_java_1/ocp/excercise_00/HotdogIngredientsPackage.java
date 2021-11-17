package es.emergya.labs.training.solid_java_1.ocp.excercise_00;

public class HotdogIngredientsPackage implements IngredientsInterface {

	private static String message = "Pan frying hothog with %.2fKg of cheese, %.2fKg of meat and %.2fKg of mayo";

	private Float cheeseKg;
	private Float meatKg;
	private Float mayoKg;

	public HotdogIngredientsPackage(Float cheeseKg, Float meatKg, Float mayoKg) {
		super();
		this.cheeseKg = cheeseKg;
		this.meatKg = meatKg;
		this.mayoKg = mayoKg;
	}

	public void makeFood(){
		panfry();
	}

	void panfry() {

		System.out.println(String.format(message, cheeseKg, meatKg, mayoKg));
	}
}
