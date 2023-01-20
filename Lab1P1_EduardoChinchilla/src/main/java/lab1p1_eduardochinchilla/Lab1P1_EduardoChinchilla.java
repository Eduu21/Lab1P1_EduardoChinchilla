
package lab1p1_eduardochinchilla;

import java.util.Scanner;

public class Lab1P1_EduardoChinchilla {

    public static void main(String[] args) {
        
      Scanner read = new Scanner(System.in);
      int opcion = 0;
      
      while (opcion != 4){
          System.out.println("Menu");
          System.out.println("1. Socios");
          System.out.println("2. Determinar Mayor");
          System.out.println("3. Triangulo o no");
          System.out.println("4. Salir");
          
          opcion = read.nextInt();
          
          if (opcion == 1){
            int grado = -1;
            float total = 0.0f;
            int repetir = 1;
            
            while (repetir != 0) {
                System.out.println("Ingrese grado de socio: ");
                grado = read.nextInt();
                System.out.println("Ingrese el total de la compra: ");
                total = read.nextFloat();
                
                if (grado == 0){
                   total = total;
                } else if (grado == 1){
                    total = 0.9f* total;
                } else if (grado == 2){
                    total = 0.85f * total;
                } else if (grado == 3){
                    total = 0.75f * total;
                } else {
                    System.out.println("EL grado ingresado no es valido.");
                }
                
                System.out.println("Total a pagar: " +total);
                
                System.out.println("Desea calcular el total a otro cliente [1/0]: ");
                repetir = read.nextInt();
                       
            }
            
            
          } else if(opcion == 2){
              
              int num = 0;
              int num_Mayor = 0;
              int repetir = 1;
                      
              while (repetir != 0) {
                  System.out.println("Ingrese un numero: ");
                  num = read.nextInt();
                  if (num_Mayor<num) {
                      num_Mayor = num;
                  }
                 System.out.println("Desea ingresar otro [1/0]: ");
                 repetir = read.nextInt(); 
              }
              System.out.println("El numero mayor ingresado fue el: " +num_Mayor);
              
              
          } else if (opcion == 3){
              
              int ladoA;
              int ladoB;
              int ladoC;
              int suma;
              int repetir = 1;
              
              while (repetir != 0) { 
                  System.out.println("Ingrese lado A: ");
                  ladoA = read.nextInt();
                  System.out.println("Ingrese lado B: ");
                  ladoB = read.nextInt();
                  System.out.println("Ingrese lado C: ");
                  ladoC = read.nextInt();
                  suma = (ladoA+ladoB);
                  if (suma>ladoC) {
                  System.out.println("SI forman un triangulo");
                  } else {
                  System.out.println ("NO forman un triangulo");
              }
                  System.out.println("Desea ingresar otras longitudes? [1/0]: ");
                  repetir = read.nextInt();
              }
             
          } else if (opcion == 4){
              System.out.println("Terminado ejecucion");
          } else {
              System.out.println("La opcion ingresada no es valida.");
          }
                  
          
          
                  
      }//Fin whileMenu
    }//fin Main
}//Fin Clase
