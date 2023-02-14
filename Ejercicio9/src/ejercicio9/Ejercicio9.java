package ejercicio9;

public class Ejercicio9 {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.nombre = "Brayan";
        cliente.edad = 28;
        cliente.telefono = 30467027;
        cliente.credito = 150.23;
        System.out.println("Soy " + cliente.nombre + ", tengo " + cliente.edad + " años y mi telefono es " + cliente.telefono
                + " y mi credito disponible es: " + cliente.credito + "CPO"); 
        trabajador.nombre = "Jose";
        trabajador.edad = 42;
        trabajador.telefono = 582910244;
        trabajador.salario = 2000.32;
        System.out.println("Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años y mi telefono es " + trabajador.telefono
                + " y mi salario es: " + trabajador.salario + "CPO");

    }
}

class Persona {

    int edad;
    String nombre;
    int telefono;


}

class Cliente extends Persona {

    double credito;

    

}
class Trabajador extends Persona{
    double salario;
}
