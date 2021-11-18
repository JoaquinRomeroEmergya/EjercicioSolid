from Device import Device

class Button ():
    def __init__(self, device:Device) :
        self.device = device
    def toggle(self) -> None:
        self.state:bool = not self.state
        buttonOn:bool = self.state
        if (buttonOn) :
            self.lamp.turnOn()
        else :
            self.lamp.turnOff()
