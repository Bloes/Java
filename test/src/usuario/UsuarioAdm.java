
package usuario;


public class UsuarioAdm extends Usuario {
    
    public UsuarioAdm(String nombre, String email, int edad) {
        super(nombre, email, edad);
        this.es_adm = true;
    }
    @Override
     public void info(){
        System.out.println("[Usuario adm]: ");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Email: " + this.email);
        System.out.println("Edad: " + this.edad);
     }
}
