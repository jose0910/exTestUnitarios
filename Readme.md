


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

### Error del codigo
- las letras distinguían entre mayúsculas y minúsculas.
- **Solución:** Convertir la letra a mayúscula con `Character.toUpperCase(letra)`.

---



