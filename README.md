[README (1).md](https://github.com/user-attachments/files/27940744/README.1.md)
# Unidad 3: Manejo de Excepciones y Conversión de Datos en Java

**Autor:** Jordy Cajas  
**Asignatura:** Programación Orientada a Objetos — Java  
**Unidad:** 3 — Excepciones y Conversión de Datos

---

## Descripción general

Este repositorio contiene las actividades prácticas de la Unidad 3, enfocadas en el manejo de excepciones con `try`, `catch`, `finally`, `throw` y `throws`, la creación de excepciones personalizadas y la conversión de tipos de datos en Java.

---

## Actividad 1 — Manejo de excepciones básico

Programa que solicita un número entero al usuario y divide 100 entre él. Maneja los errores posibles usando múltiples bloques `catch` y un bloque `finally` que siempre se ejecuta.

**Archivo:**
- `Actividad1.java`

---

## Actividad 2 — Excepción personalizada

Sistema de registro de estudiantes que lanza una excepción personalizada `EdadInvalidaException` cuando la edad ingresada está fuera del rango válido (0 a 120).

**Archivos:**
- `EdadInvalidaException.java` — clase de excepción personalizada que extiende `Exception`
- `Estudiante.java` — clase con validación de edad en el constructor
- `Principal.java` — clase main que registra estudiantes y maneja la excepción

---

## Actividad 3 — Conversión implícita y explícita

Demostración de los cuatro tipos de conversión de datos en Java.

**Archivos:**
- `ConversionImplicita.java` — widening automático entre tipos primitivos (byte → double)
- `ConversionExplicita.java` — casting explícito con análisis de pérdida de datos
- `ConversionStrings.java` — conversión entre String y tipos primitivos usando tres métodos distintos
- `Animal.java` — clase base para demostrar casting de objetos
- `Perro.java` — subclase que extiende Animal
- `Main.java` — clase main que demuestra instanceof y casting de referencia

---

## Actividad 4 — Sistema de conversión de monedas

Sistema que convierte cantidades entre USD y EUR usando tasas de cambio hardcodeadas. Maneja entradas inválidas con `NumberFormatException` y monedas no soportadas con la excepción personalizada `MonedaNoSoportadaException`.

**Archivos:**
- `MonedaNoSoportadaException.java` — excepción personalizada para monedas no soportadas
- `Conversor.java` — lógica de conversión con tasas de cambio
- `Main.java` — clase main que lee entrada del usuario y muestra el resultado con dos decimales

---

*Programación Avanzada en Java — Jordy Cajas · 2026*
