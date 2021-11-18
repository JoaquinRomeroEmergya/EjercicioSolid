from Lamp import Lamp

class Button :
    def __init__(self, lamp:Lamp) :
        self.lamp = lamp
    def toggle(self) -> None:
        self.state:bool = not self.state
        buttonOn:bool = self.state
        if (buttonOn) :
            self.lamp.turnOn()
        else :
            self.lamp.turnOff()
