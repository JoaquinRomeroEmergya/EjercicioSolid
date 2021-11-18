from Car import Car
from typing import Optional


class CarManager :
    databases:'list[Car]' = [Car("1", "Golf III", "Volkswagen"),Car("2", "Multipla", "Fiat"),Car("3", "Megane", "Renault")]
    cosa:Car = Car("dd", "eee", "dddd")
    def  getCarById(self, id : str) -> Optional[Car]:
        for car in self.databases :
            if (car.getId()==id) :
                return  car
        return  None
    def  getCarsNames(self) -> 'list[str]' :
        sb: 'list[str]' = []
        for car in self.databases :
            sb.append(car.getBrand() + " " + car.getModel() + ", ")
        return  sb[:2]
    def  getBestCar(self) -> Car :
        bestCar : Car = None
        for car in self.databases :
            if (bestCar == None or car.getModel() < bestCar.getModel()) :
                bestCar = car
        return  bestCar