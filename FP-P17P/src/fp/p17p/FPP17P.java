/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.p17p;
import java .util.*;

/**
 *
 * @author Esteban
 */
public class FPP17P {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  int a,b,c;
a=PedirNumero("Numero 1");
b=PedirNumero("Numero 2");
c=MCD(a,b);
Mostrar(a,b,c);

}
public static int PedirNumero(String mat){
Scanner entrada = new Scanner(System.in);
System.out.print("Ingrese el " + mat + "\n" );
int num=entrada.nextInt();
return num;
}
public static int MCD(int a, int b){
int c=0,m;
m=a;
if(m>b)m=b;
for (int i=1;i<=m;i++){
if (a%i==0&&b%i==0)
c=i;
}
return c;
}
public static void Mostrar(int a,int b,int c){
System.out.println("El MCD es "+c);
}
}