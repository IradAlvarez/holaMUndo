/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

/**
 *
 * @author iRad
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola mÜndo");
        
        //Este es un comentario de una sola linea
        //*ESte es un co
                
              
         
        int a1 = 10;
        int b1 = 20;
        int resultado =a1*b1;
                
        System.out.println("El resultado es: " + (a1 + b1));
        
        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println("El valor del dato booleano: " +isTrue);
        System.out.println("El valor del dato booleano: " +isFalse);
        
        
        // El byte solo llega de 127 a -128
        
        byte b3 = 127;
        System.out.println("El byte es: " + b3);
        
        
        // Este es un short
        short s1 = -32768;
        System.out.println("El valor del dato booleano: " + s1);
        
        int  x = 8;
        int y = 7;
        int z = x;
        x = 20;
        
        double db1 = 86585d;
        
        float f1 = 34f;
        
        //manejo de operadores
        int a = 80;
        int b = 90;
        int c = a + b;
        int d = a * b;
        int e = a / b;
        int f = a % b;
        
       
                
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }; 
    
        String[] Days = {"Mon", "Tues", "Wen", "Thue", "Fri", "Sat", "Sun"}; 
        
        System.out.println(months[3]);
        System.out.println(Days[5]);
        
        // le ponesel valor a i y es el numero de mes con el que imprime
        for (int i = 0; i< months.length ; i++){
                System.out.println("El mes es :  " + months[i]);
                
        }
        
                System.out.println("esto es una linea que salta");
        System.out.print("esta es una liea que se imprime de corrido ");
        System.out.print(" junto con esta linea");
        System.out.println("");
        System.out.print("Esta linea\n se salta a la mitad ");
        System.out.print("tabulador \t para la impresion");
        
        
        
        
        int p = 8;
        if (p > 10){
            System.out.println(p + " es mayor a 10");

        }else {
            System.out.println(p + " no es mayor a 10");
        }
        int num = 0;
        
        
        switch(num){
            case 1:
                System.out.println("el caso es Uno");
                break;
            case 2:
                System.out.println("el caso es dos");
                break;
            default:
                System.out.println("el caso es caso");
        }
           


        
        
       
        
       
                
         
        
    }
    
}
