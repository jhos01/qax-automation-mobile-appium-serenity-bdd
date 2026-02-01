# MyDemoAppTest 📱🚀

Este proyecto automatiza pruebas de la aplicación **My Demo App** utilizando **Appium**, **Java**, y **Maven**. Está diseñado para ejecutarse tanto en dispositivos **emulados** como **reales** (Android).

## 📂 Estructura del proyecto
MyDemoAppTest/
│
├── src/
│ ├── main/
│ │ └── java/com/qaxpert/
│ │ └── OpenMyDemoAppTest.java
│ └── test/
│ └── java/com/qaxpert/
│ └── AppTest.java
│
├── pom.xml
└── README.md

## ⚙️ Tecnologías

- Java 22
- Maven
- Appium Java Client `8.5.1`
- Selenium WebDriver `4.14.0`

## 🧪 ¿Qué hace este proyecto?

- Ingresa a la aplicacion My Demo App en un emulador Android.
- Ingresa a la aplicacion My Demo App en un dispositivo Android real.

## 🚀 Cómo ejecutar el proyecto

### Prerrequisitos

- Tener Appium Server corriendo en `http://localhost:4723`
- Tener un emulador o dispositivo real conectado y visible por ADB
- JDK 22 instalado
- Maven instalado
- Appium Instalado

### Ejecución por terminal

```bash
mvn clean install
mvn exec:java -Dexec.mainClass="com.qaxpert.OpenMyDemoAppTest"
```bash

### Ejecución por terminal desde IntelliJ
1. Clic derecho sobre la clase OpenMyDemoAppTest
2. Selecciona: Run 'OpenMyDemoAppTest.main()'

### Dependencias clave
<dependency>
  <groupId>io.appium</groupId>
  <artifactId>java-client</artifactId>
  <version>8.5.1</version>
</dependency>

<dependency>
  <groupId>org.seleniumhq.selenium</groupId>
  <artifactId>selenium-java</artifactId>
  <version>4.14.0</version>
</dependency>
