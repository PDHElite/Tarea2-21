/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilasycolas;

import java.util.Scanner;

/**
 *
 * @author alexb
 */
public class PilasyColas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pila obj =new Pila();
        Scanner op = new Scanner(System.in);
        int opcion;
        do
        {
            System.out.println("\nMenu de la pila");
            System.out.println("1.-Ingresar placa numerica(push): ");
            System.out.println("2.-Despegar avion(pop):");
            System.out.println("3.-Que avion esta disponible para salir");
            System.out.println("4.-Mostrar el angar completo:");
            System.out.println("5.-Salir.");
            System.out.println("Ingrese una opcion: ");
            opcion=op.nextInt(); 
            
            switch(opcion)
            {
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.mostraravion();
                    break;
                case 4:
                    obj.mostrarPila();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("\n Ingrese una opcion valida");
                
            }
            
        }while(opcion!=5);
        
    }
    
}
