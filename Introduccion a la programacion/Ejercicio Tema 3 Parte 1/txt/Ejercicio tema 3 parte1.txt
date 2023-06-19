// Curso: Introducción a la Programación
// Tema: 3
// Ejercicio: Parte 1
// Fecha: 17-06-2023
// Hora: 18:17
// Autor: Carlos Alvarez Rozas
// Objetivo: Crear una función en Java que sume 3 números enteros y muestre el resultado
public class Main {
    public static void main(String[] args) {

        // declaramos una variable de tipo numérica con un valor inicial de 0
        int resultado = 0;

        // Muestro por pantalla los Datos del Ejercicio
        System.out.println("***************************************************************************************");
        System.out.println("ID del Ejercicio: > Curso de Intrioducción a la Programación > Tema 3 > Parte 1");
        System.out.println("Objetivo: Sumar 3 numeros enteros y mostrar el resultado por medio de una funcion");
        System.out.println("Parámetros de la función: 10, 20, 30");

        // Asigno a la variable "resultado" la función "suma" con los valores numéricos 10,20 y 30
        resultado = suma(10,20,30);

        // Imrpimo por pantalla el resultado de la suma, que debería ser 60
        System.out.println("El resultado de la suma es: " + resultado);
        System.out.println("***************************************************************************************");
    }
    public static int suma(int a, int b, int c){
        return a+b+c;
    }
}