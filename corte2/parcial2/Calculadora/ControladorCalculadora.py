from Suma import Suma
from Resta import Resta
from Multiplicacion import Multiplicacion
from Potencia import Potencia

class ControladorCalculadora:
    def __init__(self, vista):
        self.vista = vista

    def ejecutar(self):
        num1, num2, operacion = self.vista.obtener_datos()

        operaciones = {
            "suma": Suma,
            "resta": Resta,
            "multiplicacion": Multiplicacion,
            "potencia": Potencia
        }

        clase_operacion = operaciones.get(operacion)

        if clase_operacion:
            resultado = clase_operacion(num1, num2).calcular()
            self.vista.mostrar_resultado(resultado)
        else:
            self.vista.mostrar_error("Operación no válida")
