// El programa genera un arreglo de 20 números aleatorio entre 20 y 400
// pregunta en la consola si se queire resaltar múltuplos de 5 o 7
// se imprime el arreglo, resaltando el múltiplo número elegido
import java.util.Scanner; 

public class codigo6 {
	
	public static void main(String[]args) {

		int[] n = new int[20]; //se agregó el new

	    for (int i = 0; i < 20; i++) { //corrección en i++
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " ");
	    }//for 
	    
	    ///se crea scanner para leer entrada
	    Scanner scanner= new Scanner (System.in);
	    
	    System.out.println("\n¿Qué números quiere resaltar?");
	    System.out.print("(1 –> los múltiplos de 5 || 2 –> los múltiplos de 7):");
	    
	    //se corrige la leída en la consola por un  ) 
	    int opcion = scanner.nextInt();

	    int multiplo = (opcion == 1)? 5 : 7; //corrección de la función ()?x:y

	    //corrección del forEach que no es forEach pero funciona como ForEach
	    for (int e : n) { //corrección de char a int
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      } else {
	        System.out.print(e + " ");
	      }//else
	    }//for
	    scanner.close(); //s cierra escaner
	   }//main
	}//codigo6
