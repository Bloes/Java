
package vectores;


public class Array {

    public static void main(String[] args) {
        //En programacion un vector tambien se le conoce como Array
        float[] nota = new float[3];
        nota[0] = 4.5f;
        nota[1] = 6.3f;
        nota[2] = 5.85f;
        for(int i=0;i<3;i++){
            System.out.println(nota[i]); 
        }
    }
    
}
