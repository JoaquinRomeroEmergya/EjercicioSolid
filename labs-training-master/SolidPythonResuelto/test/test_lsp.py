from os.path import dirname, join, abspath
import sys
sys.path.insert(0, abspath(join(dirname(__file__), '../..')))

import unittest
from main.lsp.Ostrich import Ostrich
from main.lsp.Duck import Duck

class Excercise00(unittest.TestCase):

    def testlsp00(self):
        forbidden:str = "fly"
        fullfits:bool = True
        methods = dir(Ostrich)
        for met in methods:
            if(met == forbidden):
                fullfits = False
                break
        self.assertTrue(fullfits)

    

    def testlsp01(self):
        forbidden:str = "fly"
        fullfits:bool = False
        methods = dir(Duck)
        for met in methods:
            if(met == forbidden):
                fullfits = True
                break
        self.assertTrue(fullfits)