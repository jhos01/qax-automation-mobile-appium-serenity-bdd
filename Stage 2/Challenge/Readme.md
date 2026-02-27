
# 📱 Mobile Automation Project with Appium

Proyecto de automatización mobile desarrollado con **Appium + Java + JUnit 5**, implementando el patrón **Page Object Model (POM)** para pruebas automatizadas sobre una aplicación Android.

---

## 🚀 Tecnologías Utilizadas

| Tecnología | Versión |
|------------|----------|
| Java | 11 |
| Maven | 3.x |
| Appium Java Client | 8.6.0 |
| Selenium | 4.16.1 |
| JUnit | 5.10.0 |
| Android Driver | Appium AndroidDriver |

---

## 🏗 Arquitectura del Proyecto

El proyecto sigue el patrón **Page Object Model (POM)** para garantizar:

- Separación clara entre lógica de pruebas y localizadores
- Alta mantenibilidad
- Escalabilidad del framework
- Reutilización de código


---

# ✅ Casos de Prueba Automatizados

---

## 🧪 Caso 1 – Validación de Submenús del Home

**Objetivo:**  
Abrir todos los menús principales del Home y validar que cada uno tenga todos sus submenús visibles.

### ✔ Validaciones realizadas:

- App
- Accessibility
- Animation
- Content
- Graphics
- Media
- NFC
- OS
- Preference
- Views

Se utiliza:

```java
Assertions.assertAll(...)

# ✅ Dependencias prrincipales

<!-- Appium -->
<dependency>
    <groupId>io.appium</groupId>
    <artifactId>java-client</artifactId>
    <version>8.6.0</version>
</dependency>

<!-- JUnit 5 -->
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.10.0</version>
    <scope>test</scope>
</dependency>

<!-- Selenium -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.16.1</version>
</dependency>