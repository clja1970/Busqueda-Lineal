package es.studium.Busquedalineal;

import java.util.Scanner;

public class Busquedalineal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int TAM = 10;
		int tabla[]= new int[TAM];
		int i;
		boolean encontrado;
		int elemento;
		Scanner teclado = new Scanner(System.in);
		//RELLENAR TABLA
		for(i=0;i<TAM;i++) {
			System.out.println("Dame un número entero ["+i+"]");
			tabla[i]=teclado.nextInt();
			}
		System.out.println("Dame el elemnto a buscar ");
		elemento=teclado.nextInt();
		encontrado=false;
		i=0;
		teclado.close();
		 while ((!encontrado) && (i<TAM)) 
		 	if (tabla[i]==elemento)
		 	{
		 		encontrado=true;
		 	}
		 	else 
		 	{
		 		i++;
		 	}
		 	if (encontrado) {
		 		System.out.println("El elemento se encontró en la posición :"+i);
		 	}
		 	else {
		 		System.out.println("No se ha encontrado el elemento ");
		 	}
	}
}

