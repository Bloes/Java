
package recursividad;


public class Recursividad {

   
    public static void main(String[] args) {
        factorial(8);
    }
    public static int factorial(int numero){      //Código recursivo
        int resultado;
        if(numero == 1){
            return 1;
        }
        resultado = factorial(numero - 1)* numero;
        return resultado;
    }
    public static int factorialNR(int numero){     //Código no recursivo
        int temp;
        int resultado = 1;
        
        for(temp = 0; temp <= numero;temp++){
            resultado = resultado * temp;
        }
        return resultado;
    }
    
}

    

