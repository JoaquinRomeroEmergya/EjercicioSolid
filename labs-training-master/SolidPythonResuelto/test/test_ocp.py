from os.path import dirname, join, abspath
import sys
sys.path.insert(0, abspath(join(dirname(__file__), '../..')))

import unittest
from main.ocp.MagicMachine import MagicMachine
from main.ocp.SaladIngredientsPackage import SaladIngredientsPackage

class Excercise00(unittest.TestCase):

    def testocp00(self):
        magic = MagicMachine()
        try:
            magic.produce(SaladIngredientsPackage("0.5","0.2","0.35"))
            self.assertTrue(True)
        except:
            self.assertTrue(False)