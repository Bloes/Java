
package herencia;


public class Herencia {

    public static void main(String[] args) {
       Coche coche = new Coche();
       coche.setSonido("BBBRERR");
        System.out.println(coche.getSonido());
   
    }
    
}
abstract class Vehiculo{
    int velocidadMaxima;
    String matricula;
    String sonido;
    
    public Vehiculo(){
        System.out.println("Estoy en el constructor vehiculo");
}

    abstract public void setSonido(String sonido);
    abstract public String getSonido();
    

    
}
class Coche extends Vehiculo{
    @Override
    public void setSonido(String sonido){
         this.sonido = sonido; 
    }
    @Override
    public String getSonido(){
        return "Super sonido: " + this.sonido;
    }
    
}
class Moto extends Coche{
    @Override
    public void setSonido(String sonido){
         this.sonido = sonido; 
    }
     @Override
    public String getSonido(){
        return this.sonido;
    }
}
