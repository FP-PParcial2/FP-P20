/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.p16;
import java.util.*;

/**
 *
 * @author Esteban
 */
public class FPP16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        a=SolicitarDato(" a ");
        b=SolicitarDato(" b ");
        c=SolicitarDato(" c ");
        mostrarMayor(a,b,c);
    }
    public static int SolicitarDato(String Dato){
        int num;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese numero"+ Dato);
        num=teclado.nextInt();
        return num;
        
    }
    public static void mostrarMayor(int a,int b,int c){
        int m;
        m=a;
        if(m<b)m=b;
        if(m<c)m=c;
        
        System.out.println("El numero mayor es"+" " + m);
        
    }
    
}
