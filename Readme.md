


###  `comprobarDNI(String dni, char letra)`
- Comprobe si el DNI es válido comparando la letra.
-  Se valida la letra a **mayúscula**.

###  `calcularLetraDNI(String dni)`
- Usa el módulo *%23* para calcular la letra correcta según la normativa del DNI.

---

##  Pruebas Implementadas:
1. *`testComprobarDNI`*  
    Verifica que la validación del DNI sea correcta.
2. *`testCalcularLetraDNI`*  
    Asegura que la letra calculada sea la correcta.

### Errores del codigo
- las letras distinguían entre mayúsculas y minúsculas.
- **Solución:** Convertir la letra a mayúscula con `Character.toUpperCase(letra)`.
- Si el DNI tiene ceros a la izquierda ("00000000"), Integer.parseInt(dni) lo convierte en 0, lo que puede generar cálculos incorrectos.
- **Solución:** Usar Long.parseLong(dni) en su lugar:

---
Si el código no validara la longitud del DNI, tendríamos que añadir los siguientes tests para verificarlo:

@Test
void testDNIConLongitudIncorrecta() {
assertThrows(IllegalArgumentException.class, () -> Main.calcularLetraDNI("1234"));
assertThrows(IllegalArgumentException.class, () -> Main.calcularLetraDNI("123456789"));
}


