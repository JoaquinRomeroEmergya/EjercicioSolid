from IngredientsPackageInterface import IngredientsPackageInterface

class PizzaIngredientsPackage(IngredientsPackageInterface) :
    def __init__(self, cheeseKg:str,  veggiesKg:str,  meatKg:str) :
        self.cheeseKg = cheeseKg
        self.veggiesKg = veggiesKg
        self.meatKg = meatKg
        self.message:str = "Baking pizza with {0}Kg of cheese,  {1}Kg of veggies and {2}kg of meat.".format(str(cheeseKg),str(veggiesKg),str(meatKg))
    def bake(self) -> None :
        print(self.message)
    
    def makeFood(self) -> None:
        self.bake()