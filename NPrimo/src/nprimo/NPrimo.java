/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimos;

import java.util.Scanner;


public class NumerosPrimos {
    
    //Devuelve true si es primo, false en caso contrario
    public static boolean compruebaPrimo(int num){
        boolean primo = true;
        
        for (int i=2;i<num;i++){
            if ((num % i)==0 ){
                primo = false;
                i=num+1;
            }
        }
        return primo;
    }
    
    public static int siguientePrimo(int num){
        int primo = 0;
        boolean bandera = true;
        for (int i = (num+1);bandera == true; i++){
            if (compruebaPrimo(i)){
                bandera = false;
                primo = i;
            }
        }
        
        return primo;
    }
   
    public static void main(String[] args) {
        
        boolean bandera = true;
        int numero = 0;
        Scanner leer = new Scanner(System.in);
        
        while (bandera){
            System.out.println("Dime un numero para comprobar: ");
            numero = leer.nextInt();
            
            if (compruebaPrimo(numero)){
                System.out.println("El numero " + numero + " es primo");
                System.out.println("El siguiente primo es: " + siguientePrimo(numero));
            }else{
                System.out.println("El numero " + numero + " NO es primo");
                System.out.println("El siguiente primo es: " + siguientePrimo(numero));
            }
            
            if (numero == 0){
                bandera = false;
            }
        }
    }
    
}
