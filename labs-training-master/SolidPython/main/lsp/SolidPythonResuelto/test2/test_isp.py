from os.path import dirname, join, abspath
import sys
sys.path.insert(0, abspath(join(dirname(__file__), '../..')))

import unittest
from main.isp.PremiumCoffeeMachine import PremiumCoffeeMachine
from main.isp.RegularCoffeeMachine import RegularCoffeeMachine

class Excercise00(unittest.TestCase):

    def testisp00(self):
        forbidden:str = "CoffeeMachineInterface"
        fullfits:bool = True
        interfaces = RegularCoffeeMachine().__class__.__bases__
        for inf in interfaces:
            if(inf.__name__ == forbidden):
                fullfits = False
                break
        self.assertTrue(fullfits)

    

    def testisp01(self):
        forbidden:str = "CoffeeMachineInterface"
        fullfits:bool = True
        interfaces = PremiumCoffeeMachine().__class__.__bases__
        for inf in interfaces:
            if(inf.__name__ == forbidden):
                fullfits = False
                break
        self.assertTrue(fullfits)





        
        