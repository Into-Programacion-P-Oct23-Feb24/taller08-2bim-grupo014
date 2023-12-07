/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Ingrese el número de jugadores a registrar");
        int limite = entrada.nextInt();
        entrada.nextLine();
        String cadena = "";
        String cadenaEdad = "";
        int sumaEdades = 0;
        double sumaEst = 0;
        
        for (int i = 1; i <= limite; i++) {
            System.out.println("Ingrese el nombre del jugador");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese la posicion en el campo de juego");
            String posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador");
            int edad = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingrese estatura del jugador");
            double estatura = entrada.nextDouble();
            entrada.nextLine();
            
            cadena = String.format("%s%d. %s -%s-, edad %d, estatura %.2f\n",
                    cadena,
                    i,
                    nombre,
                    posicion,
                    edad,
                    estatura);
            
            cadenaEdad = String.format("%s %d",cadenaEdad, edad);
            sumaEdades = sumaEdades + edad;
            sumaEst = sumaEst + estatura;
 
        }
        
        double promEdad = sumaEdades/limite;
        double promEst = sumaEst/limite;
        
        System.out.printf("Listado de Jugadores\n\n%s\nListado de Edades%s" 
                + "\n\nPromedio de edades: %.2f Promedio de estaturas: %.2f",
                cadena, cadenaEdad, promEdad, promEst);
    }
    
}
