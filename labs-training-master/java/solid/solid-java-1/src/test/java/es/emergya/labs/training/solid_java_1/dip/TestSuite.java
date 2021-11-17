package es.emergya.labs.training.solid_java_1.dip;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import es.emergya.labs.training.solid_java_1.dip.excercise_00.Button;
import es.emergya.labs.training.solid_java_1.dip.excercise_00.Fan;
import es.emergya.labs.training.solid_java_1.dip.excercise_00.Lamp;

@DisplayName("Dependency Inversion Principle")
public class TestSuite {

	@Nested
	@DisplayName("Exercise 00: buttons, lamps and fans")
	class Exercise00 {

		@Test
		void condition00() {

			String forbidden = "es.emergya.labs.training.solid_java_1.dip.excercise_00.Lamp";

			boolean fulfills = true;

			for (Constructor<?> ctr : Button.class.getConstructors()) {
				for (AnnotatedType type : ctr.getAnnotatedParameterTypes()) {

					if (forbidden.equals(type.getType().getTypeName())) {

						fulfills = false;
					}
				}

				if (!fulfills) {

					break;
				}
			}

			assertTrue(fulfills);
		}
		
		@Test
		void condition01() {

			assertTrue(Fan.class.getInterfaces().length > 0);
		}
		
		@Test
		void condition02() {

			assertTrue(Lamp.class.getInterfaces().length > 0);
		}
	}

}
