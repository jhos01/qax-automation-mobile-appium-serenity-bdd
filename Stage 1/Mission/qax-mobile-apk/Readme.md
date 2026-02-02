# 📦 qax-mobile-apk

Proyecto Appium para probar **apps Android instaladas manualmente** en un emulador (por ejemplo, descargadas como `.apk` o desde tiendas alternativas).

---

## 🔧 Tecnologías Usadas

- Java 17+
- Appium Java Client 8.x
- Appium Server
- JUnit 4
- Maven

---

## 🗂️ Estructura del Proyecto

qax-mobile-apk/
1. src/
	1.1. test/java/com.qaxpert/ # Clases de prueba para cada app instalada
2. AllManualAppsInEmulatedDeviceSuite.java # Suite que ejecuta todas las pruebas
3. pom.xml # Archivo Maven


---

## ▶️ Cómo Ejecutar

1. Inicia tu emulador Android.
2. Verifica que las apps estén **preinstaladas manualmente** en el emulador.
3. Inicia Appium Server (`http://localhost:4723`).
4. Corre `AllManualAppsInEmulatedDeviceSuite.java` para ejecutar todas las pruebas.

---

## 📦 Apps Cubiertas

- Android Appium Demo (`com.skill2lead.appiumdemo`)
- Aptoide (`cm.aptoide.pt`)
- Automation Sample App
- F-Droid
- Grocery Demo App
- My Currency

---

## 📌 Recomendaciones

- Usa `adb shell pm list packages` para verificar apps instaladas.
- Usa `adb shell dumpsys window | grep -E 'mCurrentFocus|mFocusedApp'` para encontrar `appPackage` y `appActivity`.

---

## 🧠 Tips

- Cada clase `*Test.java` contiene un método `@Test` que inicia una app específica.
- Si alguna prueba no corre desde la suite, asegúrate de que tenga un método `@Test` válido.
