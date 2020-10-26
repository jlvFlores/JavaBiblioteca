/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingbiblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jluis
 */
public class Areglos {
    
    //Areglo Shell sort
    public static void ordenarShell(int []arreglo){
        int tam_arreglo = arreglo.length;
        int brecha = (tam_arreglo/2);
        int recorrido;
        
        while(brecha > 0){
            for(recorrido=brecha; recorrido<tam_arreglo; recorrido++){
                int buffer = arreglo[recorrido];
                int indice = recorrido;
                while(indice >= brecha && arreglo[indice-brecha] > buffer){
                    arreglo[indice] = arreglo[indice-brecha];
                    indice -= brecha;
                }
                arreglo[indice] = buffer;
            }
            brecha = brecha/2;
        }
    }
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void shellSort() throws IOException {
        int[] arreglo;
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int i,t;
        
        System.out.println("Escribe el tamaño del arreglo:");
        entrada = bufer.readLine();
        t= Integer.parseInt(entrada);
        
        arreglo = new int[t];
        System.out.println("------------------------------");

        Scanner teclado = new Scanner(System.in);

        for(i=0; i<arreglo.length; i++)
        {
            System.out.printf("Introduzca número %d: ", i+1);
            arreglo[i] = teclado.nextInt();
        }
        System.out.println("------------------------------");
        System.out.println("Arreglo original:"+ Arrays.toString(arreglo));
        ordenarShell(arreglo);
        System.out.println("Arreglo ordenado"+ Arrays.toString(arreglo));
    }
    
    //Areglo Bubble Sort
    public static void bubbleSort(){
      /* Declaración de variables */
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca tamaño del arreglo: ");
        /* Guardamos en la variable num el número de elementos que va a tener nuestro arreglo */
        num = sc.nextInt();

        /* Creamos el array del tamaño num (lo que pongamos por teclado) */
        int Arreglo1[] = new int[num];

        /* Ciclo para rellenar el arreglo con números introducidos por teclado */
        for (int i = 0; i < Arreglo1.length; i++) {
            System.out.println("Introduzca un número para el elemento " + (i + 1) + ": ");
            Arreglo1[i] = sc.nextInt();
        }
        /* Mostramos primero el arreglo sin ordenar */
        System.out.println("      -SIN ORDENAR-");
        /* Llamada al método */
        mostrarA(Arreglo1);
        
        System.out.println("¿Desea ordenar los números? S/N");
        Scanner sc2 = new Scanner(System.in);
        String res = sc2.nextLine();
        /* Si es 'S' entra, si no sale */
        if (res.equalsIgnoreCase("S"))
        {
            /* Muestra el array ordenado */
            System.out.println("       -ORDENADO-   ");
            /*Llama al método para ordenar */
            ordenaBurbuja(Arreglo1);
        }
    }
    
    static void ordenaBurbuja(int Arreglo1[]) {
        /* Bucle desde 0 hasta la longitud del array -1 */
        for (int i = 0; i < Arreglo1.length - 1; i++) {
            /* Bucle anidado desde 0 hasta la longitud del array -1 */
            for (int j = 0; j < Arreglo1.length - 1; j++)
            { /* Si el número almacenado en la posición j es mayor que el de la posición j+1
                (el siguiente del array) */
                if (Arreglo1[j] > Arreglo1[j + 1]) {
                    /* guardamos el número de la posicion j+1 en una variable (el menor) */
                    int temp = Arreglo1[j + 1];
                    /* Lo intercambiamos de posición */
                    Arreglo1[j + 1] = Arreglo1[j];
                    Arreglo1[j] = temp;
                    /* y volvemos al inicio para comparar los siguientes hasta que todos se hayan comparado*/
                    /* de esta forma vamos dejando los números mayores al final del areglo en orden*/
                }
            }
        }
        /* Llama al método mostrarA, si ordena damos por hecho que lo quiere mostrar */
        mostrarA(Arreglo1);
    }
    
    static void mostrarA(int Arreglo1[]) {
        System.out.println("|-----------------------|");
        /* Bucle para mostrar el arreglo desde la posicion 0 hasta la longitud del arreglo */
        for (int i = 0; i < Arreglo1.length; i++)
        {
         System.out.print(" Elemento " + (i + 1) + " -----> " + Arreglo1[i] + "\n");
        }
        System.out.println("|-----------------------|");
    }
    
    //Areglo busqueda Binaria
    public static void busquedaBinaria() {
        // TODO code application logic here
        //Pedido de scanner para que el usuario pueda ingresar datos
        Scanner sc = new Scanner(System.in);
        //Cracion del arrego con un tamaño de 8
        int elemento[] = new int[8];
        //Frace dirigida al usuario para ingrsar datos
        System.out.println("Ingresa 8 numeros: ");
        
        for(int i=0; i<8; i++){
            //uso de scanner para ingresar datos al arreglo
            elemento[i] = sc.nextInt();
            
            
        }
        System.out.println("                  ");
        //Uso de herramientas de arreglo para ordenar los datos del arreglo
   Arrays.sort(elemento);
   System.out.println("            ");
   //Frace para denotar que el arreglo ah sido ordenado
        System.out.println("Arreglo ordenado: ");
        System.out.println("                 ");
        //Uso de herramientas de arreglo para imprimir en pantalla el arreglo ordenado
        System.out.println(Arrays.toString(elemento));
        System.out.println("                 ");
        //Frace dirigida a usuario para ingresar dato a buscar dentro del arreglo
        System.out.println("Ingrsa un numero a buscar: ");
        //declaracion de variable tipo numerico y uso de scanner para que el usuario pueda almacenar datos dentro de esta variable
        int buscar = sc.nextInt();
        //declaracion de variables para el uso de la busqueda
        int n=elemento.length, inicio=0, centro=0;
        int fin=n-1;
        //declaracion de variable que se activara solo cuando se encuentre el dato buscado
        boolean bandera=false;
        //inicio de bucle para la busqueda del valor ingresado por el usuario
        while(inicio<=fin){
            //declaracion de la variable centro es igual a inicio mas fin entre 2
            centro=(inicio+fin)/2;
            //Si el centro se encuentra en el numero buscado en el arreglo la bandera actua con true y el bucle termina con el break
            if(elemento[centro]==buscar){
                bandera=true;
                break;
                
            }
            //Pero si el numero del centro no es el que se buscaba el fin se mueve a la izquierda del centro
            else if(buscar<elemento[centro]){
                fin=centro-1;
                
            }
            //Si no es asi el inicio se mueve a la derecha del centro
            else{
                inicio=centro+1;
            }
        }
        //uso de if para verificar que el dato fue encontrado
        if(bandera==true){
            System.out.println("El numero se encuentra en la posición: " +(centro));
        }
        //en el caso de que no se encontrara el dato aparecera este enunciado
        else{
            System.out.println("¡¡¡Numero no encontrado!!!");
        }
        
    }

}
