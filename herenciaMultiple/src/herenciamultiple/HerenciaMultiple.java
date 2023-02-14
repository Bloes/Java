
package herenciamultiple;


public class HerenciaMultiple {

    public static void main(String[] args) {
        Coche coche = new Coche();
     
    }
}
class Vehiculo{
    int velicidadMaxima;
    public Vehiculo(){
        System.out.println("Aquí empienza el constructor Vehiculo");
    }
}
class Motor{
    String tipoMotor;
    public Motor(){
        System.out.println("Constructor Motor");
    }
}
class Coche extends Vehiculo, Motor{

}
