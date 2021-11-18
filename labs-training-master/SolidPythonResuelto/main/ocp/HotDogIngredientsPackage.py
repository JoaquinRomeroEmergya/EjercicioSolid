from IngredientsPackageInterface import IngredientsPackageInterface

class HotdogIngredientsPackage(IngredientsPackageInterface) :
    def __init__(self, cheeseKg:str,  meatKg:str,  mayoKg:str) :
        self.cheeseKg = cheeseKg
        self.meatKg = meatKg
        self.mayoKg = mayoKg
        self.message:str = "Pan frying hothog with {0}Kg of cheese, {1}Kg of meat and {2}Kg of mayo".format(str(cheeseKg),str(meatKg),str(mayoKg))

    def panfry(self) -> None:
        print(self.message)

    def makeFood(self) -> None:
        self.panfry()