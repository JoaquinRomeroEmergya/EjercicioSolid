package es.emergya.labs.training.solid_java_1.ocp.excercise_00;

public class PizzaIngredientsPackage implements IngredientsInterface {

	private static String message = "Baking pizza with %.2fKg of cheese, %.2fKg of veggies and %.2fKg of meat.";
	
	private Float cheeseKg;
	private Float veggiesKg;
	private Float meatKg;

	public PizzaIngredientsPackage(Float cheeseKg, Float veggiesKg, Float meatKg) {
		super();
		this.cheeseKg = cheeseKg;
		this.veggiesKg = veggiesKg;
		this.meatKg = meatKg;
	}

	void bake() {

		System.out.println(String.format(message, cheeseKg, veggiesKg, meatKg));
	}

	public void makeFood(){
		bake();
	}

}
