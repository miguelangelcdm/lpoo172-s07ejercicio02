/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio02;
import java.util.Scanner;

public class S07ejercicio02 {

    public static void main(String[] args) {
        for (;;) {
             Scanner input=new Scanner (System.in);
        final double mxp=0.305;
        System.out.println("ingrese el valor en pies: ");
        double feet=input.nextDouble();
        double meters=feet*mxp;
        System.out.println(feet+"pies son "+meters+" en metros");
        }
       

    }
    
}
