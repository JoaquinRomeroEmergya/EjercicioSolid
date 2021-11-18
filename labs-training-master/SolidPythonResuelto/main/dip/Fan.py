from Device import Device

class Fan(Device):
    def turnOn(self) -> None:
        print("Fan turned on")
    def turnOff(self) -> None:
        print("Fan turned off")
    def  getColor(self) -> None:
        return  self.color
    def setColor(self, color:int) -> None:
        self.color:int = color