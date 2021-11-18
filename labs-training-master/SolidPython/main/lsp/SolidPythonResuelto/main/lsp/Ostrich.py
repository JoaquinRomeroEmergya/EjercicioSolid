from Bird import Bird;

class Ostrich(Bird) :
    def __init__(self, name:str) :
        super.__init__(name)
    def fly(self) -> None: 
        raise  Exception("Ostrich can't fly!")