from VistaCalculadora import VistaCalculadora
from ControladorCalculadora import ControladorCalculadora

class Main:
    @staticmethod
    def iniciar():
        vista = VistaCalculadora()
        controlador = ControladorCalculadora(vista)
        controlador.ejecutar()

if __name__ == "__main__":
    Main.iniciar()
