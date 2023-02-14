
package ejercici8;


public class Ejercici8 {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(28);
        persona.setNombre("Brayan");
        persona.setTelefono(304568);
        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
  
    }
           
 }
class Persona{
    private int edad;
    private String nombre;
    private int telefono; 

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }
    
    
}
