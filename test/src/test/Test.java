
package test;
import usuario.Usuario;
import usuario.UsuarioAdm;
public class Test {

   
    public static void main(String[] args) {
      Usuario usuario = new Usuario("Brayan","bloes@correo.es",28);
      usuario.info();
      
      UsuarioAdm admin = new UsuarioAdm("Brayan","bloes@correo.es",28);
      admin.info();
    }
    
}
