/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author LAB.ELECT
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double farenheit = 20;
        double celsius;
        
        System.out.println("Farenheit\tCelcius\n");
        
        for (int contador = 1; contador <=20; contador++){
            
            celsius = ((5.0/9)*(farenheit - 32));
            
            System.out.printf("%.2f\t\t%.2f\n",
                    farenheit, celsius);
            
            farenheit += 4;
            
        }
        
    }
    
}
