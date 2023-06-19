// Curso: Introducción a la Programación
// Tema: 3
// Ejercicio: Parte 2
// Autor: Carlos Alvarez Rozas
// Fecha: 17-06-2023
// Hora: 19:24
// Objetivos del Ejercicio:
// 1.Crear una clase "coche"
// 2. Dentro de la clase "coche", una variable numérica que almacene el número de puertas que tiene
// 3. Una función que incremente el número de puertas que tiene el coche
// 4. Crear un objeto miCoche en el main y añadirle una puerta
// 5. Mostrar el número de puertas que tiene el objeto

public class Main {
    public static void main(String[] args) {
        // creamos el objeto miCoche
        Coche miCoche = new Coche();

        // Mostramos los datos del ejercicio
        System.out.println("*******************************************************************************");
        System.out.println("ID del Ejercicio: > Curso de Intrioducción a la Programación > Tema 3 > Parte 2");
        System.out.println("Objetivos del Ejercicio:");
        System.out.println("1. Crear una clase coche");
        System.out.println("2. Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene");
        System.out.println("3. Crear una función que incremente el número de puertas que tiene el coche");
        System.out.println("4. Crear un objeto miCoche en el main y añadirle una puerta");
        System.out.println("5. Mostrar el número de puertas que tiene el objeto");

        // Mostramos el número actual de puertas que tiene el coche
        System.out.println("Cantidad actual de puertas: " + miCoche.numero_puertas);

        // Incrementamos el número de puertas
        miCoche.incrementarPuertasdelCoche();

        // Mostramos el nuevo número de puertas de coche
        System.out.println("Cantidad de puertas luego del incremento: " + miCoche.numero_puertas);
        System.out.println("*******************************************************************************");

    }
}

class Coche{

    // definimos la variable numero_puertas de tipo numérica con un valor de 1
    public int numero_puertas = 1;

    // Función que incrementa el número de puertas 1 sola vez
    public void incrementarPuertasdelCoche(){
        this.numero_puertas++;
    }
}
