from os.path import dirname, join, abspath
import sys
sys.path.insert(0, abspath(join(dirname(__file__), '../..')))

import unittest
import inspect
from main.dip.Lamp import Lamp
from main.dip.Button import Button
from main.dip.Fan import Fan

class Excercise00(unittest.TestCase):

    def testdip00(self):
        forbidden:str = "lamp"
        fullfits:bool = True
        sig = inspect.signature(Button)
        for param in sig.parameters:
            if(param == forbidden):
                fullfits = False
                break
        self.assertTrue(fullfits)

    def testdip01(self):
       self.assertTrue(Lamp().__class__.__base__.__name__ != "object")

    def testdip02(self):
       self.assertTrue(Fan().__class__.__base__.__name__ != "object")