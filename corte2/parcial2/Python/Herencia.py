class Speaker:
    brand = "Beatpill"

    def __init__(self, color, model):
        self._color = color
        self._model = model

    def power_on(self):
        print(f"Powering on {self._color} {self._model} speaker.")

    def power_off(self):
        print(f"Powering off {self._color} {self._model} speaker.")

# Add a SmartSpeaker class and make it inherit from the Speaker class
class SmartSpeaker(Speaker):
    def __init__(self, color, model, voice_assistant):
        super().__init__(color, model)
        self._voice_assistant = voice_assistant

    def say_hello(self):
        print(f"Hello, I am {self._voice_assistant}")


# Create an instance of the SmartSpeaker class
smart_speaker = SmartSpeaker("black", "XYZ123", "Alexa")
smart_speaker.power_on()  # Inherited from Speaker
smart_speaker.say_hello()