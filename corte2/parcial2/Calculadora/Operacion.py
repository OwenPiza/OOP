# Operacion.py

class Operacion:
    def __init__(self, num1, num2):
        self.num1 = num1
        self.num2 = num2

    def calcular(self):
        raise NotImplementedError("Este método debe ser implementado por las subclases.")
