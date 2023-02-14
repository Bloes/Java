
package project1;


public class Project1 {
//Tipo encapsulación 
    public static void main(String[] args) {
        Vehiculo vehiculo  = new Vehiculo();
        vehiculo.setTipo("coche");
        String tipo = vehiculo.getTipo();
        System.out.println(tipo);
    }    
}
class Vehiculo{
    private String tipo;
    private boolean estado;
    
public void setTipo(String tipo){
    this.tipo = tipo;
}
public void setEstado(boolean estado){
    this.estado = estado;
}

public String getTipo(){
    return this.tipo; 
}
public boolean isEstado(){
    return this.estado; 
}
}
//Tipo Abstracción 
abstract class vehiculo{
    private String tipo;
    private int velocidadMaxima;
    private String sonido;

abstract public void setSonido(String sonido);
abstract public String getSonido(); 

}

