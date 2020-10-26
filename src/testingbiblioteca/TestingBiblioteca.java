/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingbiblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author jluis
 */
public class TestingBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("1: Matriz, Suma de filas y suma de columnas");
        System.out.println("2: Matriz, Caracol");
        System.out.println("3: Matriz, Intercambia primer columna con ultima columna");
        System.out.println("4: Matriz, Adjunta");
        System.out.println("5: Matriz, Inversa");
        System.out.println("6: Matriz, Determina si indice es igual al arreglo");
        System.out.println("7: Matriz, Espiral");
        System.out.println("8: Matriz, Cuadro magico");
        System.out.println("9: Matriz, Entidad");
        System.out.println("10: Areglo, Shell sort");
        System.out.println("11: Areglo, Bubble sort");
        System.out.println("12: Areglo, Busqueda binaria");
        System.out.println("Escribe el numero de la matriz o arreglo que deseas utilizar");

        numeroElegido();
    }    

    private static void numeroElegido() throws IOException {
        Matrices matriz = new Matrices();
        Areglos areglo = new Areglos();
        int numMatriz = 0;
        
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        
        entrada = bufer.readLine();
        numMatriz = Integer.parseInt(entrada);
        System.out.println("");
        
        switch (numMatriz) {
          case 1:
            System.out.println("Matriz, Suma de filas y suma de columnas - Luis Angel Santos");
            matriz.sumarFilasColumnas();
            System.exit(0);
            break;
          case 2:
            System.out.println("Matriz, Caracol - Emanuel R");
            matriz.matrizCaracol();
            System.exit(0);
            break;
          case 3:
            System.out.println("Matriz, Intercambia primer columna con ultima columna - Axel Jair Segundo Leon");
            matriz.PriUltColumna();
            System.exit(0);
            break;
          case 4:
            System.out.println("Matriz, Adjunta - Jonathan Perez");
            matriz.matrizAdjunta();
            break;
          case 5:
            System.out.println("Matriz, Inversa - Cristian Sanchez Flores");
            matriz.matrizInversa();
            System.exit(0);
            break;
          case 6:
            System.out.println("Matriz, Determina si indice es igual al arreglo - Jonathan Galindo");
            // checar codigo de matriz
            System.exit(0);
            break;
          case 7:
            System.out.println("Matriz, Espiral - Jose Samuel D");
            matriz.matrizEspiral();
            System.exit(0);
            break;
          case 8:
            System.out.println("Matriz, Cuadro magico - Astrid Gonzales");
            matriz.matrizMagica();
            System.exit(0);
            break;
          case 9:
            System.out.println("Matriz, Entidad - Sherlin Torrez");
            matriz.matrizEntidad();
            System.exit(0);
            break;
          case 10:
            System.out.println("Areglo, Shell sort - Axel Jair Segundo Leon, Osvaldo Sanchez Perez");
            areglo.shellSort();
            System.exit(0);
            break;
          case 11:
            System.out.println("Areglo, Bubble Sort - Jonathan Pérez Ordóñez, Cristian Sánchez Flores");
            areglo.bubbleSort();
            System.exit(0);
            break;
          case 12:
            System.out.println("Areglo, Busqueda binaria - Astrid Deyadira González Loaiza, Josue Samuel De Fermin Fernandez");
            areglo.busquedaBinaria();
            System.exit(0);
            break;
        }    
    }
}
