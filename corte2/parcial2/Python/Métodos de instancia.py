class Speaker:
    brand = "Beatpill"

    def __init__(self, color, model):
        self.color = color
        self.model = model

    def power_on(self):
        print(f"Powering on {self.color} {self.model} speaker.")

    def power_off(self):
        print(f"Powering off {self.color} {self.model} speaker.")


speaker_one = Speaker("black", "85XB5")
speaker_two = Speaker("red", "Y8F33")
speaker_one.power_on()
speaker_two.power_off()