/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendario1;

import java.util.Arrays;

/**
 *
 * @author xp
 */
public class Calendario1 {
    public int calendario(int d){
         int  numero = 31;
         for(int i=1; i<=numero -1; i++){ // empieza el int i en el 1 ya que el calendario no tiene el dia 0
        System.out.print(i);
        System.out.print(" ");
         if(i == 7 || i == 14 || i== 21 ||i ==28){
         System.out.println();
         i++;
         
         }
        
         }
         
         
         return numero;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendario1 ejercicio1 = new Calendario1();
        
        
        System.out.println(ejercicio1.calendario(1000));
        // TODO code application logic here
    }
    
}
