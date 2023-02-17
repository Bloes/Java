
package interfaces;


public class Interfaces {

 
    public static void main(String[] args) {
        /*Coche coche = new  Coche();
        coche.Acelerar(50);
        int resultado = suma(2,5);
        System.out.println(resultado);*/ 
        Moto moto = new Moto();
        Coche coche = new Coche();
        EjecutarAcelerar(coche);
        EjecutarAcelerar(moto);
        
        
        
    }
    public static void EjecutarAcelerar(Vehiculo vehiculo){        //Esta es la funcion envultoria 
        vehiculo.Acelerar(15);
        
    }
    /*public static int suma(int a,int b){
        return a+b;*/
    }
    

interface Vehiculo{
    void Acelerar(int cuantaVelocida);
    void Frenar(int cuantaVelocidad); 
    
}
class Moto implements Vehiculo{

        @Override
        public void Acelerar(int cuantaVelocida) {
            System.out.println("Moto() => Acelerar"); 
        }

        @Override
        public void Frenar(int cuantaVelocidad) {
            System.out.println("Moto() => Frenar"); 
        }
    
} 

class Coche implements Vehiculo{

    static Vehiculo Coche;
    @Override
    public void Acelerar(int cuantaVelocidad){
        System.out.println("Coche() => Acelerar");
    }
    @Override
    public void Frenar(int cuantaVelocidad){
        System.out.println("Coche() => Frenar"); 
    }
}
