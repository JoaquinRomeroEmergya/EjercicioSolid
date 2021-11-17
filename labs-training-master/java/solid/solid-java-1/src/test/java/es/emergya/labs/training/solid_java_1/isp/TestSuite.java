package es.emergya.labs.training.solid_java_1.isp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import es.emergya.labs.training.solid_java_1.isp.excercise_00.PremiumCoffeeMachine;
import es.emergya.labs.training.solid_java_1.isp.excercise_00.RegularCoffeeMachine;

@DisplayName("Interface Segregation Principle")
public class TestSuite {

	@Nested
	@DisplayName("Exercise 00: the coffee shop")
	class Exercise00 {

		@Test
		void condition00() {

			String forbidden = "es.emergya.labs.training.solid_java_1.isp.excercise_00.CoffeeMachine";

			boolean fulfills = true;

			for (Class<?> cls : RegularCoffeeMachine.class.getInterfaces()) {

				if (forbidden.equals(cls.getCanonicalName())) {

					fulfills = false;
					break;
				} 
			}

			assertTrue(fulfills);
		}

		@Test
		void condition01() {

			String forbidden = "es.emergya.labs.training.solid_java_1.isp.excercise_00.CoffeeMachine";

			boolean fulfills = true;

			for (Class<?> cls : PremiumCoffeeMachine.class.getInterfaces()) {

				if (forbidden.equals(cls.getCanonicalName())) {

					fulfills = false;
					break;
				} 
			}

			assertTrue(fulfills);
		}

	}

}
