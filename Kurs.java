/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kurs;

import java.util.Scanner;

public class Kurs {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float rupiah, dolar, euro, sgd, myr;
        
        System.out.print("Input Rupiah = ");
        
        rupiah = input.nextFloat();
        dolar = (float) (rupiah/15720);
        euro = (float) (rupiah/16289);
        sgd = (float) (rupiah/14191);
        myr = (float) (rupiah/3512);
        
        System.out.println();
        System.out.println("Currency Result = ");
        System.out.println("USD = " + dolar + " USD");
        System.out.println("EUR = " + euro + " EUR");
        System.out.println("SGD = " + sgd + " SGD");
        System.out.println("MYR = " + myr + " RM");
        
    
         
        }
}


