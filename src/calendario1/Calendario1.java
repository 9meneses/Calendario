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

    public int calendario(int d) {
        for (int i = 1; i <= d; i++) { //imprime tantas x para imprimir en el dia que se indica, 
                                       //es decir si imprime en el dia 8 tendremos que reflejar 8 x
                                       
            System.out.print("x");
            System.out.print(" ");
            if (i % 7 == 0) {          //se utiliza para cuando haya 7 x pase de linea debido a que una semana solo tiene 7 dias
                System.out.println();
            }
        }
        
        int contador = d;               //empezamos a usar un contador que nos va servir para más adelante 
        
        
        for (int i = 1; i < 31; i++) { //se pone 31 dias debido a que estamos trabajando sobre un mes de 31 dias
            if (i <= 9) {
                System.out.print("0"); //condicion que sirve para los numeros del 1 al 10 ponerle el 0 delante como se refleja 
                                       //en los calendarios
            }
            System.out.print(i);
            System.out.print(" ");
            contador++;                 //sumamos uno al contador ya que hemos declarado que el contador era igual al dia y al 
                                        //un dia hay que actualizar tambien el valor de contador
                                        
                                        
            if (contador % 7 == 0) {    //aquí viene el caso en el que utlizamos contador en el que al contar los dias de la semana
                                        //llega a 7 se pone una linea nueva
                System.out.println();
            }
        }
        return 31;

        /* OTRA FORMA DEMASIADA LIOSA DE COMO RESOLVER ESTE EJERCICIO 
        
        
        int  numero = 31+(d-1); //se le suma el dia en que se quiere empezar ya que las x ocupan posciones de la i del for y una vez
                                //imprimidas las x hay que imprir los dias del mes desde el uno
                                //no obstante se le resta uno ya que en el return siemrpe devolvemos 31
         int dia = 0;
         
         for(int i=1; i<=numero -1; i++){ // empieza el int i en el 1 ya que el calendario no tiene el dia 0
             
             if(i>=d){
                 dia +=1;
                 if(dia <=9){ 
                System.out.print("0");
             }
                 
                 System.out.print(dia);
                 
                 System.out.print(" ");
             }
            
             if(i<d){
                 System.out.print("x");
                 System.out.print(" ");
             }
              
         if(i%7 == 0){
         System.out.println();
         
         
         }
        
         }
         numero = 31;
         return numero;
         
         */
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendario1 ejercicio1 = new Calendario1();

        System.out.println(ejercicio1.calendario(12));
        // TODO code application logic here
    }

}
