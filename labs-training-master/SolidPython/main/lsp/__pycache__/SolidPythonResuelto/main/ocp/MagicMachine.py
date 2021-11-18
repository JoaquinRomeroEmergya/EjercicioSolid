from HotDogIngredientsPackage import HotdogIngredientsPackage
from PizzaIngredientsPackage import PizzaIngredientsPackage
from IngredientsPackageInterface import IngredientsPackageInterface

class NoThatMagicException(Exception) :
        serialVersionUID = 5614958177835014488

class MagicMachine :
    def produce(self, ingredientsPackage:IngredientsPackageInterface) -> None:
        if (ingredientsPackage == None) :
            raise NoThatMagicException()
        if ( isinstance(ingredientsPackage,PizzaIngredientsPackage)) :
            pizza: PizzaIngredientsPackage = ingredientsPackage
            pizza.bake()
        elif (isinstance(ingredientsPackage, HotdogIngredientsPackage)) :
            hotDog: HotdogIngredientsPackage = ingredientsPackage
            hotDog.panfry()
        else :
            raise NoThatMagicException()

