package timecalculator;

import java.util.Scanner;

/**
 *
 * @author Francisco Velasco
 */
public class TimeCalculator {

    public static void main(String[] args) {

        int hora, minuto;
        String salir = "n";
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al Programa!!!!! :D");
        while (!salir.equals("s")) {
            System.out.print("Ingrese sus horas: ");
            hora = sc.nextInt();
            minuto = hora * 60;
            System.out.println("En la hora " + hora + " existen " + minuto + " minutos !"); //Este es un comentario de prueba jajajajaja
            System.out.println("arigato");
            System.out.print("Quieres salir del programa?? (S/N): ");
            salir = sc.next().toLowerCase();
            
        }
        System.out.println("arigato");
    }

}
