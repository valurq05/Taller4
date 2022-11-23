
package taller4;

import java.util.Scanner;

public class Taller4 {

    /**
     * Realizar un programa que calcule el valor a pagar por algunos galones de gasolina si sabemos que cada litro de gasolina vale 9.500.
     * Imprimir la cantidad de galones, precio por galón, cantidad de litros y precio a pagar.
     */
    
    // Valentina Urquijo & Sofia Garcia

    // DE: Cant de galones
    // DS: Cant de galones, precio por galón, cantidad de litros, precio a pagar
    
    public static void main(String[] args) {
       
 double cantGalones;
 double precioTotal;
 double precioGalon;
 double cantLitros;
 double precioLitro;
 precioLitro = 9500;
    
precioGalon = (precioLitro * 3.78541);
 

Scanner leer = new Scanner(System.in);
 
        System.out.println("Digite la cantidad de galones");
        
        cantGalones = leer.nextDouble();
        
        cantLitros= (cantGalones * 3.78541);
        
        precioTotal= (cantLitros* precioLitro);
        
        System.out.println("La cantidad de galones es: " + cantGalones);
        System.out.println("El precio por galón es: " + precioGalon);
        System.out.println("La cantidad de litros es: " + cantLitros);
        System.out.println("El precio a pagar es: " + precioTotal);
        
        
        
        
        
        
        
 
 
 

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
