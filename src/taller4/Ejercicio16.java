
package taller4;

import java.util.Scanner;

public class Ejercicio16 {

    /**
     * Dada las horas trabajadas por un empleado determinar cuánto gana semanalmente y mensualmente, si el trabajador debe trabajar mínimo 38h semanales y un máximo de 56h.  
     * Se debe pedir la cantidad de horas trabajadas y verificar que esté dentro del rango permitido, también se debe pedir el precio de la hora.  
     * Imprimir la cantidad de horas trabajadas y el pago.
     */
    
    // DE: Cant horas trabajadas, precio de la hora
    // DS: cant de horas trabajadas y pago total
    
    
public static void main(String[] args) {
        
float horasTrabajo;
float precioHora;
float pagoSemanal;
float pagoMensual;
pagoSemanal= 0;
pagoMensual= 0;

Scanner leer= new Scanner(System.in);

        System.out.println("Porfavor digite cuantas horas trabaja semanalmente");
        horasTrabajo= leer.nextFloat();
        
        if ((horasTrabajo>=38)&&(horasTrabajo<=56)) {
            
            System.out.println("Digite el precio de la hora");
            precioHora= leer.nextFloat();
          
            pagoSemanal = horasTrabajo * precioHora;
            pagoMensual = pagoSemanal * 4;
            
            
            
            System.out.println("La cantidad de horas que usted trabajó son: " + horasTrabajo);
            System.out.println("El pago semanal es: " + pagoSemanal);
            System.out.println("El pago mensual es: " + pagoMensual);
        
          
        }else{
          
            if(horasTrabajo<38){
            
                System.out.println("Usted no cumple el minimo de horas semanales requeridas");
            }else{
            
                if (horasTrabajo>56) {
                    
                    System.out.println("Usted excedió el limite de horas semanales permitidas");
                }
            
            }
            
        }

        
        
        
        
    }
    
}
