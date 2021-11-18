from Car import Car
from typing import Optional
from CarRepository import CarRepository


class CarManager :
    def __init__(self) -> None:
        self.carRepository = CarRepository()
    def  getCarById(self, id : str) -> Optional[Car]:
        self.carRepository.getCarById(id)
    def  getCarsNames(self) -> 'list[str]' :
        sb: 'list[str]' = []
        for car in self.carRepository.getCars :
            sb.append(car.getBrand() + " " + car.getModel() + ", ")
        return  sb[:2]
    def  getBestCar(self) -> Car :
        bestCar : Car = None
        for car in self.carRepository.getCars :
            if (bestCar == None or car.getModel() < bestCar.getModel()) :
                bestCar = car
        return  bestCar