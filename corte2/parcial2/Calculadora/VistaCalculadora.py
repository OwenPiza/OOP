class VistaCalculadora:
    def obtener_datos(self):
        try:
            num1 = int(input("Ingrese el primer número entero: "))
            num2 = int(input("Ingrese el segundo número entero: "))
            operacion = input("Operación (suma, resta, multiplicacion, potencia): ").lower()
            return num1, num2, operacion
        except ValueError:
            print("⚠️ Entrada inválida. Solo se permiten números enteros.")
            return self.obtener_datos()

    def mostrar_resultado(self, resultado):
        print(f"✅ Resultado: {resultado}")

    def mostrar_error(self, mensaje):
        print(f"❌ Error: {mensaje}")
