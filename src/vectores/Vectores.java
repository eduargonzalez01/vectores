/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Vector 10 pares  Impares y pares
        //Declaracion
        int cantPar=0;
        int cantImpar=0;
        Scanner leer = new Scanner(System.in);
        int [] datos = new int[10];
        System.out.print("Llene el arreglo con 10 registros \n");
        for (int i = 0; i <= 9; i++) {
          
            datos[i]=leer.nextInt();
            
            
        if (datos[i]%2==0) {
            cantPar++;   
        }
        else{
            cantImpar++;
        }
        }
         System.out.print("Hay "+cantPar+ " numeros pares \n");
         System.out.print("Hay "+cantPar+ " numeros impares \n");
        
    }
    
}
