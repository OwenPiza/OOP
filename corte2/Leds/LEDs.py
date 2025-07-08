import serial
import keyboard
import time

arduino = serial.Serial('COM5', 9600)
time.sleep(2)

print("Presiona una tecla entre 0-9 o A-F para mostrar en binario en los LEDs.")
print("Presiona ESC para salir.")

# Lista de teclas válidas
teclas_validas = ['0','1','2','3','4','5','6','7','8','9',
                  'a','b','c','d','e','f',
                  'A','B','C','D','E','F']

while True:
    for tecla in teclas_validas:
        if keyboard.is_pressed(tecla):
            arduino.write(tecla.encode())  # Envia la tecla al Arduino como byte
            print(f"Tecla presionada: {tecla}")
            time.sleep(0.3)  # Espera para evitar múltiples envíos
            break  # Evita que se detecten múltiples teclas a la vez

    if keyboard.is_pressed('esc'):
        print("Saliendo del programa...")
        break
