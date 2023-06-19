// Curso de Introducción a la Programación
// Autor del Ejercicio: Carlos Alvarez
// Ejercicios del Tema 8
// 19 de junio 2023

public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Carlos");
        System.out.println("Mi nombre es: " + persona.getNombre());

        persona.setEdad(48);
        System.out.println("Mi edad es: " + persona.getEdad() + " años");

        persona.setTelefono(951262599);
        System.out.println("Mi teléfono es: " + persona.getTelefono());
    }
}

class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getNombre() {

        return nombre;
    }

    public void setEdad(int edad){

        this.edad = edad;
    }

    public int getEdad() {

        return edad;
    }

    public void setTelefono(int telefono){

        this.telefono = telefono;
    }

    public int getTelefono() {

        return telefono;
    }
}