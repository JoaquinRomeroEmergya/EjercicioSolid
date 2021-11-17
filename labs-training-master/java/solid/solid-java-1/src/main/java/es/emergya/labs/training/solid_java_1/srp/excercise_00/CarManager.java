package es.emergya.labs.training.solid_java_1.srp.excercise_00;

//import java.util.Arrays;
import java.util.List;

public class CarManager {

	public CarRepository carRepository;

	public CarManager(){
		this.carRepository = new CarRepository();
	}


	public Car getCarById(final String id) {
		return this.carRepository.getCarById(id);
	}

	public String getCarsNames() {
		
		StringBuilder sb = new StringBuilder();
		List<Car> databases = carRepository.getCars();
		
		for (Car car : databases) {
			
			sb.append(car.getBrand());
			sb.append(" ");
			sb.append(car.getModel());
			sb.append(", ");
		}
		
		return sb.substring(0, sb.length() - 2);
	}

	public Car getBestCar() {
		
		Car bestCar = null;

		List<Car> databases = carRepository.getCars();
		for (Car car : databases) {
			
			if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
				
				bestCar = car;
			}
		}
		
		return bestCar;
	}

}
