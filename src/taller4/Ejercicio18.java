package taller4;

import java.util.Scanner;

public class Ejercicio18 {

    /**
     * Realizar un algoritmo que calcule el salarioa pagar de un empleado según los siguientes parámetros: 
     * •Si gana menos de 700.000, descuento de pensión =-2%, descuento de salud =-4% y más Aux. de transporte= +11%.
     * •Si gana entre 741.000 y 999.999, descuento de pensión =-4%, descuento de salud =-6% y más Aux. de transporte= +9%.
     * •Si gana más 1.000.000y menos 1.800.00, descuento por pensión es -6%, descuento de segurode vida 5%, descuento de salud =-6% y más Aux. de transporte= +9%.
     * •Si gana más de 1.800.000 y menos de 2.500.00, descuento por pensión es -6%, descuento de seguro de vida 5%, descuento de salud =-8% y más Aux. de transporte= +8%.
     * •Si gana más de 2.500.000, descuento por pensión es -8%, descuento de seguro de vida 6%, descuento de salud =-10% y más Aux. de transporte= +9%.
     */

    //DE: Salario
    //DS: Salario a pagar según los parametros
    
    public static void main(String[] args) {
        
double salario;
double salarioFinal;

        
    Scanner leer= new Scanner(System.in);
    
    
        System.out.println("Porfavor digite su salario: ");
        salario = leer.nextDouble();
        
        if (salario<700000) {
            
        salarioFinal = ((salario) - (salario*0.02)- (salario*0.04) + (salario*0.11));
            System.out.println("El valor a pagar al empleado es: " + salarioFinal);
        }
        
        if ((salario >=700000) &&(salario <741000)){
            System.out.println("El valor a pagar al empleado es: " + salario);
        }
        
        if ((salario>=741000)&&(salario<=999999)) {
        
        salarioFinal = ((salario)- (salario*0.04)- (salario*0.06) + (salario*0.09) );
            System.out.println("El valor a pagar al empleado es: " + salarioFinal);
            
        }
   
        if ((salario >= 1000000) && (salario< 1800000)) {
         
         salarioFinal = ((salario)- (salario*0.06)- (salario*0.05)- (salario*0.06) + (salario*0.09) );
            System.out.println("El valor a pagar al empleado es: " + salarioFinal);
               
                  
        }
    
        if ((salario>=1800000)&&(salario<2500000)) {
            
          salarioFinal = ((salario)- (salario*0.06)- (salario*0.05)- (salario*0.08) + (salario*0.08) );
            System.out.println("El valor a pagar al empleado es: " + salarioFinal);
            
        }
    
        if (salario>=2500000) {
            
           salarioFinal = ((salario)- (salario*0.08)- (salario*0.06)- (salario*0.10) + (salario*0.09) );
            System.out.println("El valor a pagar al empleado es: " + salarioFinal);  
            
        }
    
    }
    
    
    
}
