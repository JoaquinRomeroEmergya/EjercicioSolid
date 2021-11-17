package es.emergya.labs.training.solid_java_1.lsp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Method;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import es.emergya.labs.training.solid_java_1.lsp.excercise_00.Duck;
import es.emergya.labs.training.solid_java_1.lsp.excercise_00.Ostrich;

@DisplayName("Liskov Substitution Principle")
public class TestSuite {

	@Nested
	@DisplayName("Exercise 00: flying ostriches")
	class Exercise00 {

		@Test
		void condition00() {
			
			String forbidden = "fly";

			boolean fulfills = true;

			
			for (Method method: Ostrich.class.getMethods()) {

				if (forbidden.equals(method.getName())) {
					
					fulfills = false;
					break;
				}
			}

			assertTrue(fulfills);
		}
		
		@Test
		void condition01() {
			
			String required = "fly";

			boolean fulfills = false;

			
			for (Method method: Duck.class.getMethods()) {

				if (required.equals(method.getName())) {
					
					fulfills = true;
					break;
				}
			}

			assertTrue(fulfills);
		}

	}

}
