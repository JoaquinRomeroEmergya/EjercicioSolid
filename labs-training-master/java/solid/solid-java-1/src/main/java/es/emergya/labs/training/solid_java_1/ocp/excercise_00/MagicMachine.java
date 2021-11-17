package es.emergya.labs.training.solid_java_1.ocp.excercise_00;

public class MagicMachine {

	public void produce(IngredientsInterface ingredientsPackage) {
		ingredientsPackage.makeFood();
	}
	
	class NoThatMagicException extends RuntimeException {

		private static final long serialVersionUID = 5614958177835014488L;
	}
	
}
