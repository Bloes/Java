
package polimorfismo;


public class Polimorfismo {

    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.diHola();
        coche.sumaNumeros(2.5,3.3);
      
    }  
}
class Vehiculo{
    public void diHola(){
        System.out.println("Hola!!!!!");
    }
}
class Coche extends Vehiculo{
    @Override
    public void diHola(){
        System.out.println("Este es un coche");
    }
    public int sumaNumeros(int a, int b ){
        System.out.println("Es Integer");
        return a+b;
        
    }
    public float sumaNumeros(float a, float b){
        System.out.println("Es Float");
        return a+b; 
        
    }
    public void sumaNumeros(double a, double b){
        System.out.println("El resultado double es: " + a+b);
        System.out.println("Es Double");
    }
}