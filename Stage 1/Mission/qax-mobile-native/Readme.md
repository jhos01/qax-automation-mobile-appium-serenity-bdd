# 📱 qax-mobile-native

Proyecto automatizado con Appium para probar **apps nativas preinstaladas** en dispositivos Android, como Calculadora, Calendario, Cámara, Reloj, Contactos, YouTube, etc.

---

## 🔧 Tecnologías Usadas

- Java 17+
- Appium Java Client 8.x
- Appium Server
- JUnit 4
- Maven

---

## 🗂️ Estructura del Proyecto
qax-mobile-native/
1. src/
	1.1.1. main/java/com.qaxpert/ # Lógica de conexión con Appium
	1.1.2. test/java/com.qaxpert/ # Clases de prueba (CalculatorTest, ClockTest, etc.)
2. AllNativeAppsTestSuite.java # Ejecuta todos los tests juntos
3. pom.xml # Configuración de dependencias


---

## ▶️ Cómo Ejecutar

1. Inicia el emulador Android.
2. Inicia Appium Server en `http://localhost:4723`.
3. Ejecuta individualmente cualquier test de clase `*Test.java`  
   **O bien** ejecuta la suite `AllNativeAppsTestSuite.java` para correr todos a la vez.

---

## 🧪 Apps Nativas Cubiertas

- Calculator
- Calendar
- Camera
- Clock
- Contacts
- Messages
- YouTube
- Browser
- Calls
- Settings

---

## 📌 Recomendaciones

- Asegúrate de tener las apps nativas habilitadas en el emulador.
- Usa `.setNoReset(true)` en Appium para evitar reinstalar apps.
