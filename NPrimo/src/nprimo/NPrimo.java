/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nprimo;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class NPrimo {

//Devuelve true si es primo, false en caso contrario
 public static boolean NumeroPrimo (int num){
     boolean primo = true;
     
     for (int i=2; i<num;i++){
         if ((num % i) == 0 ){
             primo = false;
             i=num+1;
         }
    }
     
     return primo;
 } 
  
    public static int SiguienteNumero(int num){
        int primo = 0;
        boolean bandera = true;
        
        for (int i = (num+1); bandera == true; i++){
            if (NumeroPrimo(i) ){
                bandera = false;
                primo = i;
            }
    }
    return primo;
    } 
 
    public static void main(String[] args) {
        boolean bandera = true;
        int numero = 0;
        Scanner leer = new Scanner (System.in);
        
        while (bandera){
            System.out.println("Dime un Numero");
            numero = leer.nextInt();
        }
         
            if(NumeroPrimo(numero)){
                System.out.println("El Numero "+ numero +" es PRIMO");   
                System.out.println("El Siguiente Primo "+ SiguienteNumero +" es PRIMO");
            }else{
                System.out.println("El Numero "+ numero +" no es PRIMO");   
                System.out.println("El Siguiente Primo "+ SiguienteNumero +" es PRIMO");                
            }
            if (numero == 0){
                bandera = false;
            }
}
}