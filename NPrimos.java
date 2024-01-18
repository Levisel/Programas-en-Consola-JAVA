package NPrimos;

import java.util.Scanner;

/**
 *
 * @author Francisco Velasco
 */
public class NPrimos {

public static void main(String[] args){
        
        //Programa que imprime una lista de números primos según desee el usuario
        
        int numero = 1, elementos, i = 1, j = 1, x=0, resp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números primos que desee ver: ");
        elementos = sc.nextInt(); 
        
        while(i <= elementos){  
            j = 1;
            while(j <= numero){
                resp = numero % j;
                if(resp == 0) x++;
                j++;
            }    
            if (x == 2)
            {
                i++;
                System.out.println(numero);
            }
            numero++;
            x = 0;
        }
}
}
