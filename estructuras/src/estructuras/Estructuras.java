package estructuras;

import java.util.Scanner;

public class Estructuras {

	
	public static void ejemplosIf () {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduzca su nombre");
		String nombre = sc.nextLine();
		if(nombre.equals("Naomi")) {
			System.out.println("Hola Naomi");
			
		}
		System.out.println("Pasa un buen día");//lo ven todos porque está fuera de la llave condicional

		sc.close();	
		
	}
	
	public static void ejemploIfElse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su nombre");
			String nombre = sc.nextLine();
			if(nombre.equals("Naomi")) {
				System.out.println("Hola Naomi");
			} else {
				System.out.println("Hola persona desconocida");
				System.out.println("Espero verte habitualmente por aquí");
				
			}
			System.out.println("Pasa un buen día");//lo ven todos porque está fuera de la llave condicional

			sc.close();	
		
	}
	public static void ejemploIfElseIfElse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tira un dado y escribe que número ha salido");
		int numero = sc.nextInt();
		
		if (numero==1) {
			System.out.println("Ha salido un uno");
		} else if(numero==2) {
			System.out.println("Ha salido un dos");
		}else if(numero==3) {
			System.out.println("Ha salido un tres");
		}else if(numero==4) {
			System.out.println("Ha salido un cuatro");
		}else if(numero==5) {
			System.out.println("Ha salido un cinco");
		}else if(numero==6) {
			System.out.println("Ha salido un seis");
		}		else {
			System.out.println("¿Qué tipo de dado tienes que te ha salido un número diferente del uno al seis?");
		}
		sc.close();	
		
	}
	public static void main(String[] args) {
//	ejemplosIf();
//ejemploIfElse();
ejemploIfElseIfElse();
}
	}
