// Pines conectados a los LEDs (de LED1 a LED4)
const int ledPins[4] = {2, 3, 4, 5};

void setup() {
  Serial.begin(9600);  // Comunicación serial

  // Configura los 4 pines como salida
  for (int i = 0; i < 4; i++) {
    pinMode(ledPins[i], OUTPUT);
  }
}

void loop() {
  if (Serial.available() > 0) {
    char tecla = Serial.read();  // Lee la tecla

    int valorDecimal = -1;  // Variable para guardar el número (0 a 15)

    // Convierte el carácter recibido a número hexadecimal
    if (tecla >= '0' && tecla <= '9') {
      valorDecimal = tecla - '0';  // '0' = 0, '1' = 1, ..., '9' = 9
    } else if (tecla >= 'A' && tecla <= 'F') {
      valorDecimal = 10 + (tecla - 'A');  // 'A' = 10, ..., 'F' = 15
    } else if (tecla >= 'a' && tecla <= 'f') {
      valorDecimal = 10 + (tecla - 'a');  // También permite letras minúsculas
    }

    // Si es un número válido (0 a 15), actualiza los LEDs
    if (valorDecimal >= 0 && valorDecimal <= 15) {
      for (int i = 0; i < 4; i++) {
        // Verifica el bit correspondiente con una máscara
        bool estado = bitRead(valorDecimal, i);
        digitalWrite(ledPins[i], estado);
      }
    }
  }
}
