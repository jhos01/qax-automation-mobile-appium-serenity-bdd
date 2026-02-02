# MyDemoAppTest 📱🚀

Este proyecto automatiza pruebas de la aplicación **My Demo App** utilizando **Appium**, **Java**, y **Maven**. Está diseñado para ejecutarse tanto en dispositivos **emulados** como **reales** (Android).

## 📂 Estructura del proyecto
MyDemoAppTest/
1. src
	1.1. main
	1.1.1. java/com/qaxpert
	1.2.2. OpenMyDemoAppTest.java
	1.2. test
	1.2.1.java/com/qaxpert/
	1.2.2. AppTest.java
2. pom.xml
3. README.md

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

mvn clean install
mvn exec:java -Dexec.mainClass="com.qaxpert.OpenMyDemoAppTest"

### Ejecución por terminal desde IntelliJ
1. Clic derecho sobre la clase OpenMyDemoAppTest
2. Selecciona: Run 'OpenMyDemoAppTest.main()'

### Dependencias clave
  <!-- ========== DEPENDENCIAS ========== -->
  <dependencies>

    <!-- ===== APPIUM ===== -->
    <dependency>
      <groupId>io.appium</groupId>
      <artifactId>java-client</artifactId>
      <version>${appium.version}</version>
    </dependency>


    <!-- ===== JUNIT ===== -->
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>${junit.version}</version>
      <scope>test</scope>
    </dependency>

  </dependencies>
