from Device import Device

class Lamp(Device) :
    def turnOn(self) -> None:
        print("Lamp turned on")
    def turnOff(self) -> None:
        print("Lamp turned off")
    def  getColor(self) -> None:
        return  self.color
    def setColor(self, color:int) -> None:
        self.color:int = color