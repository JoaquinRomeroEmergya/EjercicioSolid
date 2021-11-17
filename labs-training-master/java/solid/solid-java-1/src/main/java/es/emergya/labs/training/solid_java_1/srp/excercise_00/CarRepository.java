package es.emergya.labs.training.solid_java_1.srp.excercise_00;


import java.util.Arrays;
import java.util.List;

public class CarRepository {

	private List<Car> databases;


	public CarRepository(){
		this.databases = Arrays
		.asList(new Car("1", "Golf III", "Volkswagen"), 
				new Car("2", "Multipla", "Fiat"),
				new Car("3", "Megane", "Renault"));

	}

    public List<Car> getCars(){
        return this.databases;
    }

	public Car getCarById(final String id) {
		
		for (Car car : databases) {
			
			if (car.getId().equals(id)) {
				return car;
			}
		}
		
		return null;
	}
}