/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Aby
 */
public class OperatorAritmatika {
    public static void main(String[] args){
        int a = 10;
        int b = 2;
        
        double c;
        
        //Penjumlahan
        c = a + b;
        System.out.println(a + "+" + b + "=" + c);
        
        //Pengurangan
        c = a - b;
        System.out.println(a + "-" + b + "=" + c);
        
        //Perkalian
        c = a * b;
        System.out.println(a + "x" + b + "=" + c);
        
        //Pembagian
        c = a / b;
        System.out.println(a + ":" + b + "=" + c);
        
        //Sisa hasil bagi
        c = a % b;
        System.out.println(a + "%" + b + "=" + c);
    }
}
