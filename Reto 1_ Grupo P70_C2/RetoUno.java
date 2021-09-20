/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package retouno;

import java.util.Scanner;

/**
 *
 * @author dafpa
 */
public class RetoUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        numeros(num1);
        
    }
    public static void numeros (int num1){
        String premio;
        int n2 = (2*num1)+4;
        int n3 = ((num1+n2)/5);
        
        if (n3>=0 && n3<=20)    {
            premio = "uno";}
        else if (n3>=21 && n3<=30){
            premio = "dos";}
        else if (n3>=31 && n3<=50){
            premio = "tres";}
        else {
            premio = "cuatro";}
        
        System.out.println(num1+" "+n2+" "+n3);
        System.out.println(premio);
                      
    }
}
