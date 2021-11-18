from Car import Car
class CarRepository():
    def __init__(self) -> None:
        self.databases:'list[Car]' = [Car("1", "Golf III", "Volkswagen"),Car("2", "Multipla", "Fiat"),Car("3", "Megane", "Renault")]
    def getCars(self):
        return self.databases
    def getCarById(self,id:str):
        for car in self.databases :
            if (car.getId()==id) :
                return  car
        return  None