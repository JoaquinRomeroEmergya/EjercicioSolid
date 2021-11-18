from IngredientsPackageInterface import IngredientsPackageInterface

class SaladIngredientsPackage(IngredientsPackageInterface) :
    def __init__(self, lettuceKg:str,  tomatoesKg:str,  tuneKg:str) :
        self.lettuceKg = lettuceKg
        self.tomatoesKg = tomatoesKg
        self.tuneKg = tuneKg
        self.message:str = "Making salad with {0}Kg of lettuce, {1}Kg of tomatoes and {2}Kg of tuna.".format(str(lettuceKg),str(tomatoesKg),str(tuneKg))
    def make(self) -> None:
        print(self.message)