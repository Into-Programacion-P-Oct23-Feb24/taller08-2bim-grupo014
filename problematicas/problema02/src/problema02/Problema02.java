/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author LAB.ELECT
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String acumulador = "";
        int num2;
        int num3;
        int num4;
        for (int num = 30; num >= 10; num--) {
            num2 = num*2;
            num3 = num*3;
            num4 = num*4;
            acumulador = String.format("%s%d-%d-%d-%d\n"
                    ,acumulador,num,num2,num3,num4);
            
        }System.out.println(acumulador);

    }
}
