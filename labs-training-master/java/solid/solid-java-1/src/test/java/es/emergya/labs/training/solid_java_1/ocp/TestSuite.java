package es.emergya.labs.training.solid_java_1.ocp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import es.emergya.labs.training.solid_java_1.ocp.excercise_00.MagicMachine;
import es.emergya.labs.training.solid_java_1.ocp.excercise_00.SaladIngredientsPackage;

@DisplayName("Open-Closed Principle")
public class TestSuite {

	@Nested
	@DisplayName("Exercise 00: the magic machine")	
	class Exercise00 {

		@Test
		void condition00()  {

			MagicMachine machine = new MagicMachine();

			try {
				
				machine.produce(new SaladIngredientsPackage(0.5f, 0.2f, 0.35f));
				
				assertTrue(true);
				
			} catch (Exception e) {
				
				assertTrue(false);
			}
		}

	}

}
