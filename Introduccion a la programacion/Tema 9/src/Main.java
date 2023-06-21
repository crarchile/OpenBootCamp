/*
*
* Author: Carlos Alvarez
* Fecha: 20-06-2023
*
Enunciado del ejercicio: Crea una clase Persona con las siguientes variables:
La edad, El nombre, El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona.
Esta nueva clase tendrá la variable credito sólo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades
la edad, el teléfono, el nombre y el crédito; tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una
variable salario que solo tenga la clase Trabajador.
 */

public class Main {

    public static void main(String[] args) {
        // Clase Cliente
        Cliente cliente = new Cliente();
        cliente.nombre = "Carlos";
        cliente.edad = 48;
        cliente.telefono = 951262599;
        cliente.credito = 1500.00;
        System.out.println("Soy " + cliente.nombre + ", tengo " + cliente.edad + " años, mi teléfono es " + cliente.telefono
                + " y mi crédito disponible es " + cliente.credito + " € mensuales.");
        // Clase Trabajador
        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Susana";
        trabajador.edad = 48;
        trabajador.telefono = 945113302;
        trabajador.salario = 6000.00;
        System.out.println("Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años, mi teléfono es " + trabajador.telefono
                + " y mi salario es de " + trabajador.salario + " € mensuales.");

    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona {
    double salario;
}