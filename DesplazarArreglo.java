/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desplazararreglo;

import java.util.Scanner;

/**
 *
 * @author Francisco Velasco
 */
public class DesplazarArreglo {

    public static void moverArreglo(int[] array, int pos){
        int[] temp = new int[pos];
        //Guardamos los elementos del arreglo original que serán desplazados en uno temporal 
        for(int i = 0; i < pos; i++){
            temp[i] = array[array.length - pos + i];
        }
        //Procedemos a mover N posiciones del arreglo original
        for(int i = 9 - pos; i>=0; i--){
            array[i + pos] = array[i];
        }
        //Recuperamos los elementos del arreglo temporal
        for(int i = 0; i < pos; i++){
            array[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        //Ejercicio: Desplazar N posiciones de un arreglo de 10 elementos. 
        //Si se desplaza una posición debería ser:
        //Ej. 1-2-3-4-5-6-7-8-9-10 --> 10-1-2-3-4-5-6-7-8-9

        
        //Definimos variables
        Scanner sc = new Scanner(System.in); //Input
        int[] array = new int[10]; //Arreglo
        int pos; //variable que contiene el número de posiciones
        System.out.println("Bienvenido al Programa!");
        //Pedimos los elementos al usuario
        for(int i = 0; i < array.length; i++){
            System.out.print("Ingrese el numero "+(i+1)+": ");
            array[i] = sc.nextInt();
        }
        //Pedimos la cantidad de posiciones a ser desplazadas del arreglo
        System.out.print("Cuantas posiciones desea mover?: ");
        pos = sc.nextInt();
        
        //Hacemos el desplazamiento de posiciones
        moverArreglo(array, pos);
        
        //Imprimimos
        System.out.println("");
        for(int i: array){System.out.println(i);}   
        System.out.println("Gracias por usar el programa!");
        
        
    }
    
}
