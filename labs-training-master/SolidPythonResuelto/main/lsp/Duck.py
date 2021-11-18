from Bird import Bird
from FlyingBird import FlyingBird
class Duck(Bird, FlyingBird):
    def __init__(self,name:str):
        super().__init__(name)