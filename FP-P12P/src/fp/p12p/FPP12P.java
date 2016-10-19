/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.p12p;
import java.util.*;

/**
 *
 * @author Esteban
 */
public class FPP12P {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] a=new int[10];
        
        a=Numeros(a);
        mostrarNumero(a);
        
        
                
    }
    public static int [] Numeros(int[] a){
         Scanner teclado = new Scanner(System.in);
for(int i=0;i<a.length;i++){
System.out.print("Introduce Numero en el arreglo ["+ (i+1) +"] :");
a[i]=teclado.nextInt();
        
        
    }
return a;
    }
    public static void mostrarNumero(int[] a){
        int b=0,c=0,r;
       
        for(int i=1;i<a.length;i+=2){
           b= a[i]+b;
           c++;}
           r= b/c;
        
            System.out.println("El promedio es" + r );
        }
        
        
    }
    

