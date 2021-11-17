package es.emergya.labs.training.solid_java_1.srp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import es.emergya.labs.training.solid_java_1.srp.excercise_00.CarManager;

@DisplayName("Single Responsability Principle")
public class TestSuite {

	@Nested
	@DisplayName("Exercise 00: cars and managers")
	class Exercise00 {

		@Test
		void condition00() {

			String forbidden = "java.util.List<es.emergya.labs.training.solid_java_1.srp.excercise_00.Car>";

			boolean fulfills = true;

			Field[] fields = CarManager.class.getDeclaredFields();

			for(Field field: fields) {

				if (forbidden.equals(field.getGenericType().getTypeName())) {

					fulfills = false;
					break;
				}
			}

			assertTrue(fulfills);
		}

		@Test
		void condition01() {

			List<String> required = List.of("getCarById", "getCarsNames", "getBestCar");

			List<String> methods = List
					.of(CarManager.class.getMethods())
					.stream()
					.map(method -> method.getName())
					.collect(Collectors.toList());

			assertTrue(methods.containsAll(required));
		}

	}

}
