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
public class Pila {
    
    Scanner teclado = new Scanner(System.in);
    int pilanum[] = new int[10];
    int tope = -1;
    
    public void push()
    {
    if(tope>=pilanum.length-1){
        System.out.print(" El angar esta lleno ");
    }
    else{
        tope+=1;
        System.out.print(" Ingrese la placa del avion ");
        pilanum[tope]=teclado.nextInt();
    }
    }
    
    public void pop(){
        if(tope==-1)
        {
            System.out.print("El angar esta vacio ");
        }
        else{
            System.out.print(" A despegado el avion con placas "+pilanum[0]);
            System.out.print(" \nEl siguiente avion con placas "+pilanum[1]+" es el siguiente en salir");
            pilanum[tope]=0;
        }
    }
    
    public void mostraravion(){
        if(tope==-1)
        {
            System.out.print("El angar esta vacio ");
        }
        else{
            System.out.print(" El avion con la placa "+pilanum[0]+" es el siguiente en salir\n ");
            }
    }
    
    public void mostrarPila(){
       for (int tope=9; tope>=0;tope--){
          System.out.print("Datos del angar");
          System.out.println("Avion con placa "+pilanum[tope]+" disponible");
       }
    }
    
    
    
}
