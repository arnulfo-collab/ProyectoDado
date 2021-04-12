
package prueba;

import java.util.Random;

public class Prueba {

   
    public static void main(String[] args) {
 int moneda;

moneda=0;

Random r = new Random();
moneda= r.nextInt(1)+1;  
if(moneda==1)
System.out.println("cara");
else 
System.out.println("sol");
}
}
