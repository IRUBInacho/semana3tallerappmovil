# 📖 Historias de Usuario

Este documento recopila las historias de usuario del sistema de registro de vehículos en consola.  
Cada historia incluye sus objetivos y criterios de aceptación.

---

## ✅ HU1 – Ingreso de datos del vehículo
**Historia:**  
Como *usuario del sistema*, quiero ingresar los datos de un vehículo desde la consola, para poder registrarlo en el sistema.  

**Criterios de aceptación:**  
- El sistema solicita los campos: **marca, modelo, año, color y patente**.  
- No permite dejar campos vacíos.  
- Si un campo es inválido (ej: año no numérico), muestra un mensaje de error y vuelve a solicitar el dato.  

---

## ✅ HU2 – Visualización de la información
**Historia:**  
Como *usuario del sistema*, quiero ver en pantalla todos los datos ingresados del vehículo, para confirmar que se registraron correctamente.  

**Criterios de aceptación:**  
- Al finalizar el ingreso, el sistema muestra un **resumen** con todos los datos del vehículo.  
- La información aparece en un formato claro y legible.  

---

## ✅ HU3 – Registro de múltiples vehículos
**Historia:**  
Como *usuario del sistema*, quiero poder ingresar más de un vehículo en una misma sesión, para mantener varios registros sin reiniciar el programa.  

**Criterios de aceptación:**  
- El sistema pregunta si deseo **agregar otro vehículo**.  
- Permite repetir el proceso de ingreso de datos las veces que sea necesario.  
- Los vehículos registrados se muestran de manera acumulativa.  

---

## ✅ HU4 – Manejo de errores
**Historia:**  
Como *usuario del sistema*, quiero recibir mensajes claros cuando ingreso un dato inválido, para poder corregirlo de inmediato.  

**Criterios de aceptación:**  
- El sistema valida el formato de los datos (ej: **año numérico**, **patente alfanumérica**).  
- Muestra un **mensaje de error específico** al detectar datos inválidos.  
- Permite volver a ingresar el dato hasta que sea correcto.  

---

✍️ **Notas:**  
- Estas historias se basan en los requerimientos definidos para el sistema y pueden ampliarse según nuevas necesidades.  
- Cada historia se vincula con casos de prueba para asegurar el cumplimiento de los criterios de aceptación.  
