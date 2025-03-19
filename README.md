# Ahorcado en Java

Este es un sencillo juego de "Ahorcado" desarrollado en Java. El programa selecciona una palabra secreta y permite al usuario adivinarla letra por letra dentro de un número limitado de intentos.

## Características

-   La palabra secreta es "inteligencia".
    
-   El jugador tiene un máximo de 10 intentos.
    
-   Se muestra la palabra con guiones bajos (_) representando las letras no adivinadas.
    
-   Se distingue entre letras correctas e incorrectas.
    
-   El juego finaliza cuando el usuario adivina la palabra o se queda sin intentos.
    

## Requisitos

-   Java Development Kit (JDK) 8 o superior.
    

## Cómo jugar

1.  Compila el código con el siguiente comando:
    
    ```
    javac Ahorcado.java
    ```
    
2.  Ejecuta el programa:
    
    ```
    java Ahorcado
    ```
    
3.  Introduce una letra cuando se te solicite.
    
4.  Sigue intentando hasta que adivines la palabra o te quedes sin intentos.
    

## Código fuente

El código implementa las siguientes estructuras y conceptos de programación en Java:

1. Uso de `Scanner` para entrada de datos del usuario.
    
2. Arreglos (`char[]`) para almacenar las letras adivinadas.
    
3. Bucles (`for`, `while`) para la iteración del juego.
    
4. Condiciones (`if`) para verificar aciertos y fallos.
    
5. Uso de métodos como `charAt()`, `toLowerCase()`, y `String.valueOf()` para manipulación de caracteres.
    

## Mejoras posibles

1. Permitir que el usuario ingrese su propia palabra secreta.
    
2. Implementar la selección aleatoria de palabras de una lista.
    
3. Añadir una interfaz gráfica para una experiencia visual mejorada.
    

¡Diviértete jugando al Ahorcado en Java!