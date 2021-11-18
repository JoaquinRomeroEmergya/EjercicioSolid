class Bird :
    def __init__(self, name:str) :
        self.name = name
    def fly(self) -> None:
        print(self.__class__.__name__ + ":" + self.name + " is flying")