package es.emergya.labs.training.solid_java_1.ocp.excercise_00;

public class SaladIngredientsPackage implements IngredientsInterface {

private static String message = "Making salad with %.2fKg of lettuce, %.2fKg of tomatoes and %.2fKg of tuna.";
	
	private Float lettuceKg;
	private Float tomatoesKg;
	private Float tuneKg;

	public SaladIngredientsPackage(Float lettuceKg, Float tomatoesKg, Float tuneKg) {
		super();
		this.lettuceKg = lettuceKg;
		this.tomatoesKg = tomatoesKg;
		this.tuneKg = tuneKg;
	}

	public void make() {

		System.out.println(String.format(message, lettuceKg, tomatoesKg, tuneKg));
	}

	@Override
	public void makeFood() {
		make();
		
	}
	
}
