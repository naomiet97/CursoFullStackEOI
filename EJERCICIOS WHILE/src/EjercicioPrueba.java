import java.util.Scanner;

public class EjercicioPrueba {

	/**
	 * Ejercicio propuesto 6.1.1: Crea un programa que muestre los números del 1 al
	 * 10, usando "while"
	 */

	public static void ejercicio611() {

		int n = 1;
		while (n <= 10) { // para que llegue hasta 10 y no hasta 9, hay que poner <11 o <=10
			System.out.println(n);
			n++; // para que aumente en cada interacción debe estar dentro del bucle

		}

	}

	/**
	 * Ejercicio propuesto 6.1.2: Crea un programa que muestre los números pares del
	 * 20 al 2, decreciendo, usando "while"
	 */

	public static void ejercicio612() {

		int n = 20;
		while (n >= 0) {
			if (n % 2 == 0) {
				System.out.println(n);

			}
			n--;
		}

	}

	/**
	 * Crea un programa que muestre la "tabla de multiplicar del 5", usando "while"
	 */

	public static void ejercicio613() {

		final int n = 5;
		int n2 = 0;
		int fin = 12;
		while (n2 <= fin) {
			System.out.println(n * n2);
			n2++;

		}

	}

	/**
	 * Crea un programa que pida al usuario un número entero y muestre su cuadrado.
	 * Se repetirá mientras el usuario introduzca un número distinto de cero.
	 */

	public static void ejercicio614() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un número: ");
		int n = sc.nextInt();
		sc.nextLine();
		while (n != 0) {
			System.out.println(n * n + "\n");
			System.out.print("Escriba un número");
			n = sc.nextInt();
			sc.nextLine();
		}
		sc.close();
	}

	/**
	 * Crea un programa que pida al usuario su contraseña (un número entero). Se
	 * repetirá mientras introduzca una contraseña distinta de "1234".
	 */

	public static void ejercicio615() { // el while puede acabar con una condicion booleana o con actualizaciones de
										// decrementos o incrementos.

		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba la contraseña:");
		int password = sc.nextInt();
		sc.nextLine();

		while (password != 1234) {
			System.out.println("Contraseña errónea. Introduzca nuevamente la contraseña.");
			password = sc.nextInt();
			sc.nextLine();
		}
		if (password == 1234) { // el if no es necesario.

			System.out.println("Contraseña correcta");
		}

		sc.close();
	}

	/**
	 * Crea un programa que pida al usuario su login (un número entero) y su
	 * contraseña (otro número entero). Se repetirá mientras el usuario introduzca
	 * un login distinto de "1809" o una contraseña distinta de "1234".
	 */

	public static void ejercicio616() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su usuario");
		int usuario = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduzca su contraseña");
		int password = sc.nextInt();
		sc.nextLine();
		while (usuario != 1809 || password != 1234) { // la condición && obliga a quedarse dentro del bucle aunque
														// alguna de las dos respuestas esté correcta.
			System.out.println("Nombre de usuario y/o contraseña erróneos");
			System.out.println("Introduzca nuevamente el usuario");
			usuario = sc.nextInt();
			sc.nextLine();
			System.out.println("Introduzca nuevamente la contraseña");
			password = sc.nextInt();
			sc.nextLine();
		}
//		if (usuario == 1809 && password ==1234) { //el if no es necesario para mostrar el mensaje de salida del bucle ya que la condición siempre se cumple (para salir del bucle).
		System.out.println("Datos de usuario correctos.");
//			}
	}

	/**
	 * Crea un programa que escriba en pantalla tantos asteriscos como el usuario
	 * indique, todos ellos en la misma línea.
	 */

	public static void ejercicio617() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba una cifra");
		int n = sc.nextInt();
		sc.nextLine();
		while (n != 0) { // hay que pensar en el número de veces que tiene que realizarse el loop para
							// colocar el update/contador
			System.out.print("*");
			n--;
		}
	}

	/**
	 * Crea un programa que muestre los números del 1 al 10, usando "do-while"
	 */

	public static void ejercicio621() {

		int n = 1;
		do { // el update/contador debe ir dentro de las llaves del 'do'.
			System.out.println(n);
			n++;
		} while (n <= 10);

	}

	/**
	 * Crea un programa que muestre los números pares del 20 al 2, decreciendo,
	 * usando "do-while"
	 */

	public static void ejercicio622() {
		////// IMPORTANTE: En un bucle do...while, los condicionales if/else van dentro
		////// del 'do..while', no después.
		int n = 20;
		do {
			if (n % 2 == 0) {
				System.out.println(n);
			}
			n--;
		} while (n >= 2);

		do {
			if (n % 2 == 0) {
				System.out.println(n);
			}
			n--;
		} while (n >= 2);

	}

	/**
	 * Crea un programa que muestre la "tabla de multiplicar del 5", usando
	 * "do-while"
	 */

	public static void ejercicio623() {

		int cinco = 5;
		int n = 0;
		do {
			System.out.println(cinco + "*" + n + " = " + (cinco * n));
			n++;
		} while (n <= 12);
	}

	/**
	 * Escribe los números del 1 al 9, después del 1 al 8, del 1 al 7, y así
	 * sucesivamente en líneas diferentes. 123456789 12345678 1234567 123456 12345
	 * 1234 123 12 1
	 * 
	 */

	public static void ejercicio23() {
		int y = 9;

		for (int x = 9; x >= 1; x--) { // imprime cada línea

			for (int i = 1; i <= y; i++) {// imprime el contenido de cada línea
				System.out.print(i);

			}
			y--;
			System.out.println();
		}

	}

	/**
	 * Pide al usuario un número y dibuja un cuadrado (mismo alto que ancho) con
	 * asteriscos según el número recibido. Dime un número: 4
	 */

	public static void ejercio24() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un número");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= n; i++) {

			for (int x = 1; x <= n; x++) {

				System.out.print("*");

			}
			System.out.println();
		}

	}

	/**
	 * Pide al usuario un número y dibuja una escalera de bajada con asteriscos. La
	 * base será igual al número recibido. Dime un número: 4
	 *
	 **
	 ***
	 ****
	 */

	public static void ejercicio25() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un número");
		int n = Integer.parseInt(sc.nextLine());
		int i = 0;
		int j = 0;
		for (i = 0; i < n; i++) {// este es responsable del alto
			for (j = 0; j <= i; j++) {// este es responsable del ancho
				System.out.print("*");
			}
			System.out.println();
		}

	}

	/**
	 * 
	 * Haz lo mismo pero con una escalera de subida (para generar los huecos debes
	 * escribir el carácter de espacio).
	 * 
	 */

	public static void ejercicio26() {
		//

		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un número");
		int n = Integer.parseInt(sc.nextLine());
		int j = 0;
		for (int i = 1; i >= n; j--) {
			for (j = 1; j < i; j++) {
				System.out.print(" ");

			}
			for (int k = 0; k >= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
//	public static void ejercicio27() {
//		
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Escriba el alto");
//		int alto = Integer.parseInt(sc.nextLine());
//		System.out.println("Escriba el ancho");
//		int ancho = Integer.parseInt(sc.nextLine());
//		for (int i = 1; i<=alto; i++ ) {
//			for(int j = 1; j<=ancho; j++) {
//				if (alto==)
//			}
//		}
//		
//		
//	}
	
	public static void ejercicio15b() {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Escriba un número");
		int n = Integer.parseInt(sc.nextLine());
		if (n==0) {
			System.out.println("El número tiene 1 ");
		}
		for (int i = 0; i<=n && n%10==0; i++) {
		System.out.println("El número tiene " + i + " cifras");
	}
	}
	public static void main(String[] args) {
		// WHILE
//		ejercicio611();
//		ejercicio612();
//		ejercicio613();
//		ejercicio614();
//		ejercicio615();
//		ejercicio616();
//		ejercicio617();
		// DO WHILE
//		ejercicio621();
//		ejercicio622();
//		ejercicio623();
//		ejercicio23();
//		ejercio24();
//		ejercicio25();
//		ejercicio27();
		ejercicio15b();

	}
}
