/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.p19;
import java.util.*;

/**
 *
 * @author Esteban
 */
public class FPP19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
       a=Angulo();
       convertir(a);
    }
    public static int Angulo(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce Angulo");
        int an=teclado.nextInt();
        return an;
    }
    public static void convertir(int a){
        
       double b = Math.toRadians(a);
        double r=Math.tan(a);
        System.out.println("Seno de " + a + " es: " + Math.sin(b) );
        System.out.println("Coseno de " + a + " es: " + Math.cos(b) );
        System.out.println("Tangente de " + a + " es: " + r );
        
    
    }
}
