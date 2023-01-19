package holaMundo;

import java.util.Scanner;

public class HolaMundo {
//public static void ejemplosComentarios () {
//	
//	 // System.out.println("Hola Naomi");
//	 
//			/*
//			 * Este es mi primer programa
//			 * Naomi 20/05/2023
//			 */
//			System.out.println("Hola mundo!");
//	System.out.println("Otra línea");
//	System.out.println("Segunda línea");
//	System.out.println("Tercera línea");
//
//}

private static void ejemplosTipos() {
	//números enteros
//int  numero = 5;
//int numero2 = 7;
//int suma = numero + numero2;
//int resta = numero2 - numero;
//double division = (double)numero2/numero;
//System.out.println("La suma es: " + suma);
//System.out.println("La resta es: " + resta);
//System.out.println("La división sobre la marcha es: " + (numero2/numero));
//System.out.println("La division es: " + division);
//// números con decimales
//
//double decimales1 = 3.14;
//double decimales2 = 2.22;
//System.out.println("La multiplicación es: " + decimales1*decimales2);
//System.out.println("La suma es: " + (decimales1+decimales2));
//double sumadecimales = numero + decimales1;
//System.out.println("Suma con decimales es: " + sumadecimales);
//
//// Enteros largos
//int maxInt = Integer.MAX_VALUE; //2147483647;
//int minInt = Integer.MIN_VALUE; //-2147483648;
//System.out.println("Suma de dos largos: " + (maxInt+minInt));
//long largo1 = 2000000000;
//long largo2 = 1000000000;
//System.out.println("Suma de dos largos correctamente es: " + (largo1+largo2));
//
//
////variables para almacenar letras
//
//char letraA = 'a';
//char letraB = 'b';
//System.out.println("La suma de letra a y letra a: es " +(letraA+letraA));
//System.out.println("La suma de letra a y letra b: es " + letraA+letraB);
//System.out.println("La suma de letra a mas 3 es: " + (letraA+3));
//System.out.println("La suma de letra a mas 3 es: " + (char)(letraA+3));

//EJERCICIO 1. 

char c = 36;
char d = 27;
int numero1 = 36;
int numero2= 27;
System.out.println("La suma de c + d: " + (int)(c+d));
System.out.println("La suma de ambos números es: " + (int)(c+d));

// EJERCICIO 2.

int a = 15;
int b = 4;
System.out.println("15+4 = " + (a+b));
System.out.println("15-4 = " + (a-b));
System.out.println("15*4 = " + (a*b));
System.out.println("15/4 = " + (a/b));
System.out.println("15%4 = " + (a%b));


}

public static void ejemplosString() {
	
	String cadena1; //declaración
	cadena1 = "Naomi"; // asignación
	String cadena2 = "Hola", cadena3= "adiós"; // declaración y asignación de 2 variables en una línea
	String cadena4 = cadena2 + " " + cadena1;
	String prefijo = "+34";
	String telefono = "777 77 77";
	int numero = 40;
	System.out.println(prefijo + " " + telefono);
	System.out.println("otra cosa"); // más común
	System.out.printf("%s tiene %d años \n", cadena1, numero); // como imprimir en la consola con formato
	System.out.print(cadena4); // más común
}

public static void ejemplosBooleanos () {
	
	// son valores que sólo pueden almacenar true o false;
//	boolean verdad = true;
//	boolean falso = false;
////	boolean comparacion1 = 10<20; //true
//	System.out.println(10<20); //true
//	System.out.println(comparacion1); //true
	//condiciones de comparación : <, >, >=, <=, ==, != ó <> (distinto) 
	 //comparación de cadenas con .equals
	String cadena1 = "hola";
	String cadena2 = "adiós";
	String cadena3 = "hola";
	String cadena4 ="Adiós";
	System.out.println(cadena1.equals(cadena2)); //false
	System.out.println(cadena1.equals(cadena3)); //true
	System.out.println(cadena4.equals(cadena2)); //false
	boolean cadenasIguales = cadena1.equals(cadena2); //false
	System.out.println(cadenasIguales);
	int numero1 = 5;
	double numero2 = 5.0;
	double numero3 = 5.1;
	System.out.println(numero1==numero2); //true
	System.out.println(numero1==numero3);//false, ya que transforma los int en decimales para comparar
	System.out.println((11/2)==numero1);//11/2 es un int, por lo que en vez de ser 5.5 se vuelve 5, por eso lo ve como true, ya que el número 1 es un int tambien
	System.out.println((11.0/2)==numero1);//11.0/2 ya da false porque es un decimal.
	System.out.println((11%2)==1);//true, el modulo es el resto de la división entera
	System.out.println((11%2)==0);//false
	System.out.println((23%4));// el resto de la división es 3
	
}
public static void ejercicio3 () {
	 
	//EJERCICIO 3.
	 int x = 5, y = 10; 
	
	 System.out.println(x<y);
	 System.out.println(x==y);
	 System.out.println(x>=y);
	 	

}


public static void tablasVerdad() {
	
	int edad = 25;
	int anyosCarnet = 6;
	String sexo = "Masculino";
	String nombre = "Pepe";
	boolean esPepeMayor = edad >= 18 && nombre.equals("Pepe");
	System.out.println(esPepeMayor); // true

	boolean tieneDescuento = (sexo.equals("Masculino") && anyosCarnet > 10) || (sexo.equals("Femenino") &&
anyosCarnet > 5);// false || false
	System.out.println(tieneDescuento); // false

	boolean estoQueDa = sexo.equals("Masculino") && nombre.equals("Fran") || anyosCarnet>5;//true
	
}

public static void ejercicio4() {
	
	int valor1 = 6, valor2= 6;
	System.out.println(valor1 + " es menor que "+ valor2 + ": " + (valor1<valor2));//true
	System.out.printf("%d y %d son iguales: %b \n", valor1, valor2, valor1==valor2); //true
	System.out.println(valor1>=valor2);// true
}

public static void ejercicio5() {
	
	int n = 2;
	System.out.println("El valor inicial de N es = " + n);
	n = n + 77; //otra forma de escribirlo sería n += 77;
	System.out.println("N + 77= " + n);
	n = n - 3; //otra forma de escribirlo sería n -=3;
	System.out.println("N - 3 = " + n);
	n = n * 2; // otra forma de escribirlo sería *=2;
	System.out.println("N * 2 = " + n);
			
}

public static void ejemplosIncrementosDecrementos() {
	
	int numero = 10;
	//pre incrementos //al estar detrás 
	++numero; 
	System.out.println(numero);
	//post-incremento
	numero++; 
	System.out.println(numero);
	// pre decremento
	-- numero; 
	System.out.println(numero);
	//post decremento
	numero--; 
	System.out.println(numero);
	// LO IMPORTANTE ES EL MOMENTO EN EL QUE INCREMENTA O DECREMENTA
	
	System.out.println(++numero);//11
	System.out.println(numero++); //12
	System.out.println(numero); //12
	System.out.println(++numero+numero++); //23, porque es 13 + 13
	System.out.println(numero); //14
	int numero2 = ++numero;
	System.out.println("numero2 = " + numero2 + " numero = " + numero);
	int numero3 = numero++;
	System.out.println("numero2 = " + numero2 + " numero = " + numero);
	
	

}

public static void ejemplosConstantes() {
	
	//las constantes tiene que ser en mayúsculas y underscore
	final int IVA = 21; //también puede hacerse double IVA = 21 o IVA = 0.21
	double precioVaquero = 50;
	System.out.println("El precio final es " + (precioVaquero*(1+(IVA/100.0))));
	
	
	
}

public static void conversionesNumerosCadenas () {
	
	int numero = 10;
	String cadena = "11";
	System.out.println(numero + cadena); //1110 por concatenación
	System.out.println(numero + Integer.parseInt(cadena));//con Integer.parseInt, se pasa de número a cadena
	//Convertir cadena a número
	int prefijo = 34;
	int telefono = 77777777;
	System.out.println(prefijo + telefono); //la suma de ambos int
	System.out.println("" + prefijo + telefono); //sale 3477777777 porque al añadir un String, concatena el resto
	System.out.println(String.valueOf(prefijo) + telefono); //con String.valueOf se pasa de cadena a número
System.out.println("00" + prefijo + "-" + telefono);
}

public static void ejercicio6() {
	//EJEMPLO PARA ALMACENAR VALORES INICIALES DE VARIABLES QUE PODRÁN CAMBIAR EN EL CÓDIGO
	
	int A = 1;
	int B = 2;
	int C = 3;
	int D = 4;
	final int auxB = B; //para poder volver a usar los valores originales, se utilizan variables auxiliares
	System.out.println("Los valores iniciales:" + "A = " + A + " " + "B = " + B + " " + "C = " + C + " D = " + D );
	System.out.println("B toma el valor de C -> B = " + (B=C));
	System.out.println("C toma el valor de A -> C = " + (C=A));
	System.out.println("A toma el valor de D -> A = " + (A=D));
	System.out.println("D toma el valor de B -> D = " + (D=auxB));
	
}

//public static void ejercicio7() {
	
//	int letra1='b';
//	int letra2= 'k';
//	System.out.println((int)letra1);
//	System.out.println((int)letra2);
//	System.out.println("La diferencia entre b y k es = " + (int)(letra2-letra1));
//}
	
	public static void ejercicio8() {
		int a = 5;
		System.out.println(a);
		int b = ++a;
		System.out.println(b);
		int c = a++;
		System.out.println(c);
		b = b*5;
		System.out.println(b);
		a = a*2;
		System.out.println(a);
		
	}
	
	public static void ejercicio9 () {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu numbre:");
		String nombre = sc.nextLine();
		System.out.println("Tu nombre es " + nombre);
		sc.close();
	}
	
	public static void ejercicio10() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escriba un número entero: ");
		int num = sc.nextInt();
		System.out.println("El doble de ese número es: "+num*2);
		System.out.println("El triple de ese número es: "+num*3);
		sc.close();
	}
	
	public static void ejercicio11() {
//		F = 32 + ( 9 * C / 5)
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba la temperatura en grados centígrados para obtenerla en grados Fahrenheit :");
		int num = sc.nextInt();
//		int F= 32 + (9*num)/5 + 32;
		System.out.println("La temperatura en grados Fahrenheit es " + (32 + (9*num)/5));
		sc.close();
		
	}
	
	public static void ejercicio12() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un número entero de tres cifras");
		int num = sc.nextInt();
		System.out.println(num/100);
		num%=100; // hay que guardar el número porque sino vuelve a partir del inicial.
		System.out.println((num/100));
		System.out.println(num%10);
		sc.close();
	}
	
	
	public static void ejercicio13() {
		
//
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Escriba su fecha de nacimiento en día, mes y año");
//	int dia = sc.nextInt();
//	int mes = sc.nextInt();
//	int anyo = sc.nextInt();
//	int sumaFecha = dia + mes + anyo;
//	System.out.println(dia + " + " + mes + " + " + anyo + " = " + (sumaFecha));
//	int digito1 = sumaFecha /1000;
//	int digito2 = sumaFecha /100%10;
//	int digito3 = sumaFecha /10%10;
//	int digito4 = sumaFecha /1%10;
//	System.out.println("Su número de la suerte es: " + ((int) digito1 + digito2 + digito3 + digito4));
//	
//	sc.close();
//	
	}
	
	public static void ejemplosSaltos() {
//		System.out.println("Hola \n Naomi \n Bien?"); //saltos de línea
		System.out.println("Elige una opción:");
		System.out.println("\t1) Añadir un producto"); ///tabulador
		System.out.println("\t2) Borrar producto");
	
		
	}
	
	public static void ejemplosFormateos() {
		
		String nao = "Naomi";
		String domi = "Dominique";
		double salario1 = 95567.89; 
		double salario2 = 2589.3674;
		
		System.out.printf("%1s%20s\n", "Nombre", "Salario"); //%12s quiere decir 12 huecos para poner un String, %14s huecos para salario
		System.out.println("-----------------------------");
		System.out.printf("%-12s%14.2f$\n", nao,salario1); //los números decimales tienen que decir "f" de float, los números sin decimales llevarán 2d"
		System.out.printf("%-12s%14.2f$\n",domi,salario2);
		
	
	}
	
	public static void ejemplosScanner() {
		Scanner sc = new Scanner(System.in); //sc es un objeto de la clase scanner, para leer de pantalla.
		System.out.println("Introduzca su nombre:");
		String nombre = sc.nextLine(); // En nombré tendré en pantalla lo que ponga el usuario hasta que presione enter
		System.out.println("Introduzca su localidad");
		String localidad =sc.nextLine();//replace para que pueda leer tanto puntos como comas
		System.out.println("Introduzca su salario:");
		double salario = Double.parseDouble(sc.next().replace(',', '.'));
		sc.nextLine();//esto es para limpiar el buffer, y que no de error cuando alguien escriba letras después de números
		System.out.println("Introduzca cuánto desearía ganar:");
		double salarioDeseado = Double.parseDouble(sc.next().replace(',', '.')); //esto es para convertir un string en double cuando lo escriba el usuario, así no hace falta crear un sc= nextLine();
		sc.nextLine();
		System.out.println("Hola " + nombre + ", me encanta " + localidad + " y que usted gane " + salario + "$" + ", pero espero que consiga ganar " + salarioDeseado + "$");
		
		//sc.next se usa para que solo coja la primera parte de lo que digite el usuario
		sc.close();
	}
	
	public static void ejercicio15() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el nombre de 3 productos: ");
		String producto1 = sc.nextLine();
		String producto2 = sc.nextLine();
		String producto3 = sc.nextLine();
		System.out.println("Escriba el precio del primer producto: ");
		double precioP1 = Double.parseDouble(sc.next().replace(',','.'));
		System.out.println("Escriba el precio del primer producto: ");
		double precioP2 = Double.parseDouble(sc.next().replace(',','.'));
		System.out.println("Escriba el precio del primer producto: ");
		double precioP3 = Double.parseDouble(sc.next().replace(',','.'));
		double precioP1IVA = precioP1*0.21;
		double precioP2IVA = precioP2*0.21;
		double precioP3IVA = precioP3*0.21;
		System.out.printf("%-15s%12.2f%12.2\n", "NOMBRE", "PRECIO", "CON IVA"); //%12s quiere decir 12 huecos para poner un String, %14s huecos para salario
		System.out.println("-----------------------------");
		System.out.printf("%-15s%12.2f%12.2\\n", producto1, precioP1, precioP1IVA); //los números decimales tienen que decir "f" de float, los números sin decimales llevarán 2d"
		System.out.printf("%-15s%12.2f%12.2\\n", producto2, precioP2, precioP2IVA);
		System.out.printf("%-15s%12.2f%12.2\\n", producto3, precioP3, precioP3IVA);
		
	
	}
	
	public static void main(String[] args) {
//		ejemplosComentarios();
//		ejemplosTipos();
//		ejemplosString();
//		ejemplosBooleanos ();
//		ejercicio3 (); 
//		tablasVerdad();
//		ejercicio4 ();
//		ejercicio5();
//		ejemplosIncrementosDecrementos();
//		ejemplosConstantes();
//		conversionesNumerosCadenas();
//		ejercicio6();
//		ejercicio7();
//		ejercicio8();
//		ejercicio9();
//		ejercicio10();
//		ejercicio11();
//		ejercicio12();
//		ejercicio13();
//		ejemplosSaltos();
//		ejemplosFormateos();
//		ejemplosScanner();
//		ejercicio14();
		ejercicio15();
		
	}

}


