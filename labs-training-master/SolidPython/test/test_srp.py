from os.path import dirname, join, abspath
import sys
sys.path.insert(0, abspath(join(dirname(__file__), '../..')))

import unittest
import inspect
from main.srp.Car import Car
from main.srp.CarManager import CarManager

class Excercise00(unittest.TestCase):

    def testsrp00(self):
        forbidden:str = "car"
        fullfits:bool = True
        sig = inspect.getmembers(CarManager)
        for param in sig:
            if param[1].__class__.__name__ == Car.__name__:
                fullfits = False
                break
        self.assertTrue(fullfits)


    def testsrp01(self):
        fullfits = True
        required = ["getCarById", "getCarsNames", "getBestCar"]
        used = dir(CarManager)
        for req in required:
            if not(req in used):
                fullfits = False
                break
        self.assertTrue(fullfits)