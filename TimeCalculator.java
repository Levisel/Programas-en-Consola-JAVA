
import java.util.Scanner;

/**
 *
 * @author Francisco Velasco
 */
public class TimeCalculator {

    public static void main(String[] args) {
        //Programa que calcula la cantidad de minutos que exiten en una cantidad de horas ingresada.
        int hora, minuto;
        String salir = "n";
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al Programa!!!!! :D");
        while (!salir.equals("s")) {
            System.out.print("Ingrese sus horas: ");
            hora = sc.nextInt();
            minuto = hora * 60;
            System.out.println("En la hora " + hora + " existen " + minuto + " minutos !"); 
            System.out.print("Quieres salir del programa?? (S/N): ");
            salir = sc.next().toLowerCase();
            
        }
        System.out.println("arigato");
    }

}
