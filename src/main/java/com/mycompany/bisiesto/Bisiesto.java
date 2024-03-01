/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bisiesto;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Bisiesto {

    public static void main(String[] args) {
         int a,b=4;
  Scanner sc= new Scanner(System.in);
   System.out.println("Digite el año");
   a=sc.nextInt();
   if (a%b==0){
       
       if (a%100!=0 && a%400==0){
               System.out.println("El año es bisiesto");

       }else{
           System.out.println("El año  no es bisiesto");
       }
    }else
    System.out.println("El año  no es bisiesto");
   }
   }
