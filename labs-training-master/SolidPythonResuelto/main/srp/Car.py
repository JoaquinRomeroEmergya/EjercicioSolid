class Car:
    def __init__(self, id : str,  model : str,  brand : str) :
        self.id = id
        self.model = model
        self.brand = brand
    def  getId(self) :
        return  self.id
    def  getModel(self) :
        return  self.model
    def  getBrand(self) :
        return  self.brand