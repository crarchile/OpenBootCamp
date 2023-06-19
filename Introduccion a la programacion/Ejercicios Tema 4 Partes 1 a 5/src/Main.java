// Ejercicios del Tema 4 del Curso de Introducción a la Programación
// Realizados por: Carlos Alvarez Rozas
// Fecha: 18 de junio de 2023
// Tema 4 - Ejercicio 1: Uso de la sentencia de Control If
// Tema 4 - Ejercicio 2: Uso de la sentencia de Control While
// Tema 4 - Ejercicio 3: Uso de la sentencia de Control Do/While
// Tema 4 - Ejercicio 4: Uso de la sentencia de Control For
// Tema 4 - Ejercicio 5: Uso de la sentencia de Control Switch

public class Main {
    public static void main(String[] args) {

    // Inicio Parte 1: Estructura de Control IF

        System.out.println("******************************************************************");
        System.out.println("Curso: Introducción a la Programación");
        System.out.println("Ejercicio: Tema 4 - Estructura de Control If");
        System.out.println("Instrucciones: Crear una sentencia de control IF que compare si la variable numeroIf contiene un valor positivo, negativo o 0");
        System.out.println("Resultados:");


        // Declaro la variable numeroIf de tipo entero con un valor inicial de 0
        int numeroIf = 0;

        // Genero la sentencia de control IF para preguntar...

        if (numeroIf > 0) {       // si el valor de la variable numeroIf es positivo, entonces mostramos el siguiente mensaje
            System.out.println("La variable numeroIf contiene el siguiente valor positivo: " + numeroIf);
        }
        else if (numeroIf < 0){    // si el valor de la variable numeroIf es negativo entonces mostramos el siguiente mensaje
            System.out.println("La variable numeroIf contiene el siguiente valor negativo: " + numeroIf);
        }
        else if (numeroIf == 0){    // si el valor de la variable numeroIf es igual a 0 entonces mostramos el siguiente mensaje
            System.out.println("La variable numeroIf es igual a cero ya que contiene el valor: " + numeroIf);
        }
    // Fin Parte 1: Estructura de Control IF

    // Inicio Parte 2: Estructura de Control While
        System.out.println("******************************************************************");
        System.out.println("Curso: Introducción a la Programación");
        System.out.println("Ejercicio: Tema 4 - Estructura de Control While");
        System.out.println("Instrucciones:");
        System.out.println("1.  El While Debe tener como condición que la variable numeroWhile sea inferior a 3");
        System.out.println("2.  El bloque de código del bucle deberá incrementar el valor de la variable en 1 cada vez que se ejecute");
        System.out.println("3.  Se debe mostrar el valor por pantalla cada vez que se ejecute");
        System.out.println("Resultados:");

        // Declaro la variable numeroWhile de tipo entero con un valor inicial de 0
        int numeroWhile = 0;

        // Muestro por pantalla el valor inicial de la variabñe
        System.out.println("El valor inicial de la variable numeroWhile es: " + numeroWhile);

        // Creo el bucle While y muestro por pantalla los valores de la variable numeroWhile durante el bucle
        while(numeroWhile < 3){
            System.out.println("El valor de la variable numeroWhile en esta iteración es: "+numeroWhile);
            numeroWhile++;  // incremento el valor de la variable en 1
        }
    // Fin Parte 2: Estructura de Control While

    // Inicio Parte 3: Bucle Do/While

        System.out.println("******************************************************************");
        System.out.println("Curso: Introducción a la Programación");
        System.out.println("Ejercicio: Tema 4 - Estructura de Control Do/While");
        System.out.println("Instrucciones: Crear la misma estructura del bucle While anterior, pero que sólo se ejecute una vez");
        System.out.println("Resultados:");

        // Declaro la variable numeroDoWhile de tipo entero con un valor inicial de 2
        int numeroDoWhile = 2;

        // Muestro valor inicial de la variable
        System.out.println("El valor inicial de la variable numeroWhile: " +  numeroDoWhile);

        do {
            numeroDoWhile = numeroDoWhile +1; //incremento el valor de la variable en 1
            System.out.println("El valor de la variable numeroWhile en esta iteración es: " + numeroDoWhile);
        } while (numeroDoWhile < 3);

    // Fin Parte 3: Bucle Do/While

    // Inicio Parte 4: Bucle For

        System.out.println("******************************************************************");
        System.out.println("Curso: Introducción a la Programación");
        System.out.println("Ejercicio: Tema 4 - Estructura de Control For");
        System.out.println("Instrucciones:");
        System.out.println("1.  Crear una variable numeroFor");
        System.out.println("2.  Esta variable tendrá 0 como valor inicial");
        System.out.println("3.  La condición de la variable será que su valor sea igual o menor que 3");
        System.out.println("4.  Se debe incrementar en 1 el valor de la variable cada vez que se ejecute");
        System.out.println("5.  El valor de la variable deberá mostrarse por pantalla");
        System.out.println("Resultados:");

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El valor de la variable numeroFor en esta iteración es: " + numeroFor);
        }
    // Fin  Parte 4: Bucle For

    // Inicio Parte 5: Switch

        System.out.println("******************************************************************");
        System.out.println("Curso: Introducción a la Programación");
        System.out.println("Ejercicio: Tema 4 - Estructura de Control Switch/Case");
        System.out.println("Instrucciones:");
        System.out.println("1.  Crear la variable estacion");
        System.out.println("2.  Crear distintos case para las 4 estaciones del año");
        System.out.println("3.  Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que se está.");
        System.out.println("4.  También habrá que poner un default para cuando el valor de la variable no sea una estación.");
        System.out.println("Resultados:");

        // Declaro la variable estacion con el valor inicial "Verano"
        var estacion ="Estacion Desconocida";

        // Comenzamos con el Switch
        switch (estacion){
            case "Invierno":
                System.out.println("Estamos en Invierno ya que el valor de la variable estacion es: " + estacion);
                break;
            case "Privamera":
                System.out.println("Estamos en Primavera ya que el valor de la variable estacion es: " + estacion);
                break;
            case "Verano":
                System.out.println("Estamos en Verano ya que el valor de la variable estacion es: " + estacion);
                break;
            case "Otoño":
                System.out.println("Estamos en Otoño ya que el valor de la variable estacion es: " + estacion);
                break;
            default:
                System.out.println("El contenido de la variable estacion no coincide con ninguna estación del año.");
        }
    // Fin Parte 5: Switch

    }
}
