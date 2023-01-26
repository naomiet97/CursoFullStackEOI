package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MiArrays {

	public static void ejemploArrays() {
		int[] numeros; // declarar la variable
		numeros = new int[5]; // Asignar memoria para poder trabajar con ella

		int[] nums = new int[5]; // Declaración y asignación en la misma línea. Lo más habitual
		// si a los nums no le doy valores a los números, todos tienen 0
		numeros[0] = 12; // lo que está dentro de los corchetes es 'i'
		numeros[1] = 23;
		numeros[2] = 53;
		numeros[3] = 5;
		numeros[4] = 92;
		int[] numeros2 = { 12, 23, 53, 5, 92 };
	}

	public static void ejemplosRecorridosFor() {
		int[] numeros = { 12, 23, 53, 5, 92 };
		// con bucle for
		for (int i = 0; i < numeros.length; i++) { // recorrer el array de uno en uno
			System.out.println(" El array números en su posición " + i + " tiene el valor " + numeros[i]);
		}

	}

	public static void ejemplosRecorridosForEach() {
		// bucle for-each
		// para CADA número dentro de 'números', imprime número
		int[] numeros = { 12, 23, 53, 5, 92 };
		for (int numero : numeros) {
			System.out.println(numero);

		}
	}

	public static void ejemplosRecorridosForEachPosicion() {
		// para la posición, normalmente no se usa este bucle, se usa el FOR
		int[] numeros = { 12, 23, 53, 5, 92 };
		int i = 0;
		for (int numero : numeros) {
			System.out.println("EL array números en su posición " + (i++) + " tiene el valor " + numero);

		}
	}

	public static void ejemplosRecorridosForEachReversa() {
		// para la posición, normalmente no se usa este bucle, se usa el FOR
		int[] numeros = { 12, 23, 53, 5, 92 };

		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.println("EL array números en su posición " + (i) + " tiene el valor " + numeros[i]);

		}
	}

	public static void ejemploBusquedas1() {
		String[] nombres = { "Juan", "Ana", "Pedro", "Eva", "Paco" };
		boolean encontrado = false;
		String buscar = "Pedro";
		for (int i = 0; i < nombres.length && !encontrado; i++) {
			if (nombres[i].equals(buscar)) {
				encontrado = true;
			}
		}
		if (encontrado) {
			System.out.println("El nombre " + buscar + " está en el array");
		} else {
			System.out.println(buscar + " no encontrado...");
		}

	}

	public static void ejemploArrayProgramacionFuncional() {
		String[] nombres = { "Juan", "Ana", "Pedro", "Eva", "Paco" };
		String buscar = "Pedro";
		if (Arrays.stream(nombres).anyMatch(n -> n.equals(buscar))) {
			System.out.println("El nombre " + buscar + " está en el array");
		} else {
			System.out.println(buscar + " no encontrado...");
		}
	}

	public static void ejemploRedimension() {

		String[] nombres = { "Juan", "Ana", "Pedro", "Eva", "Paco" };
		nombres = Arrays.copyOf(nombres, 10); // la parte de arrays siempre tiene que tener el array a la izquierda
												// seguido por un igual
		for (int i = 0; i < 10; i++) {
			System.out.println(nombres[i]);
		}
	}

	public static void ejemploRedimensionB() {

		String[] nombres = { "Juan", "Ana", "Pedro", "Eva", "Paco" };
		nombres = Arrays.copyOf(nombres, 10); // la parte de arrays siempre tiene que tener el array a la izquierda
												// seguido por un igual
		for (int i = 0; i < nombres.length; i++) {
			if (nombres[i] != null)
				System.out.println(nombres[i] + " tiene " + nombres[i].length() + " letras");
		}
	}

	public static void ejemploRedimensionC() {
		// en un bucle for each No se pone nombres[i]
		String[] nombres = { "Juan", "Ana", "Pedro", "Eva", "Paco" };
		nombres = Arrays.copyOf(nombres, 10); // la parte de arrays siempre tiene que tener el array a la izquierda
												// seguido por un igual
		System.out.println("Comienzo del for-each");
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
	}

	public static void ejemploRedimensionD() {
		// Se aumenta en una unidad
		Scanner sc = new Scanner(System.in);
		String[] alumnos = { "Juan", "Ana", "Pedro", "Eva", "Paco" };
		System.out.println("Introduzca el nuevo alumno");
		String nuevoAlumno = sc.nextLine();
		alumnos = Arrays.copyOf(alumnos, alumnos.length + 1); // Le da un tamaño de una unidad más al array
		alumnos[alumnos.length - 1] = nuevoAlumno; // Mete el nuevo dato en la última posición
		for (String alumno : alumnos) {// en funcional debajo
			System.out.println(nuevoAlumno);// en funcional debajo
		}
		// FUNCIONAL: para cada elemento del array, imprime ese elemento.
		Arrays.stream(alumnos).forEach(e -> System.out.println(e));
		sc.close();

	}

	public static void ejemploStringJoin() {
		String[] alumnos = { "Juan", "Ana", "Pedro", "Eva", "Paco" };
		String cadenaAlumnos = String.join(", ", alumnos);
		System.out.println(cadenaAlumnos);
	}

//	public static void ejemploEliminarUnidad() {
//
//		// Se aumenta en una unidad
//		String[] alumnos = { "Juan", "Ana", "Pedro", "Eva", "Paco" };
//		alumnos = Arrays.copyOf(alumnos, alumnos.length + 1); // Le da un tamaño de una unidad más al array
//		alumnos[alumnos.length - 1] = nuevoAlumno; // Mete el nuevo dato en la última posición
//		for (String alumno : alumnos) {// en funcional debajo
//			System.out.println(nuevoAlumno);// en funcional debajo
//		}
//
//	}

	public static void ordenarArray() {
		String[] alumnos = { "Juan", "Ana", "Pedro", "Eva", "Paco" };
		Arrays.sort(alumnos);
		for (String alumno : alumnos) { // forEach
			System.out.println(alumno);
		}
	}

	public static void ordenarNumeros() {

		int[] numeros = { 11, 2, 4, 5, 3, 21, 80 };
		Arrays.sort(numeros);
		for (int numero : numeros) { // forEach
			System.out.println(numero);

		}

	}

	public static void ordenarInverso() {
		String[] alumnos = { "Juan", "Ana", "Pedro", "Eva", "Paco" };
		int[] numeros = { 11, 2, 4, 5, 3, 21, 80 };
		Arrays.sort(numeros);// orden menor a mayor
		for (String alumno : alumnos) { // forEach
			System.out.println(alumno);
		}
		// Orden mayor a menor
		Collections.reverse(Arrays.asList(alumnos));
		for (String alumno : alumnos) {
			System.out.println(alumno);
		}
	}

	/**
	 * Crea un array con los nombres de los meses. A continuación pide al usuario
	 * un número del 1 al 12. Muéstrale el nombre del mes correspondiente sin usar
	 * estructuras condicionales (es decir, a partir de los valores del array).
	 */

	public static void ejercicio1() {
		Scanner sc = new Scanner(System.in);
		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Ocubre", "Noviembre", "Diciembre" };
		System.out.println("Escriba un número del 1 al 12");
		int mes = Integer.parseInt(sc.nextLine());
		{ // PARA PEDIR UNA POSICIÓN EN UN ARRAY
			System.out.println(meses[mes - 1]);// como los arrays comienzan desde el 0, DE ESOS 12 MESES QUE ESTÁN
												// GUARDADOS HAY QUE PONER -1, PARA QUE LA COMPUTADORA SEPA QUE MES ESTÁ
												// DICIENDO YA QUE VAN DE 0 A 11 EN LA COMPUTADORA
		}

	}

	/**
	 * Crea un array de enteros con 10 posiciones. A continuación pide al usuario
	 * que vaya introduciendo uno a uno los 10 números por consola. Muestra lo
	 * siguiente: a. La lista de números introducidos b. La suma de los números
	 * c.La media de los números d. El mayor y el menor de los números (crea un
	 * máximo y un mínimo provisional que será igual al primer número del array,
	 * después vas comparando con el resto de posiciones).
	 */
	public static void ejercicio2() {

		Scanner sc = new Scanner(System.in);
		Integer[] numeros = new Integer[10];
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Dime un número: ");
			numeros[i] = sc.nextInt();
		}
		System.out.print("Los números introducidos son: ");
		for (int i = 0; i < numeros.length; i++) {
			if (i == 9) {
				System.out.println(numeros[i]);
			} else {
				System.out.print(numeros[i] + ", ");

			}
			// SE PODRÍA HABER UTILIZADO ARRAY.SUM
		}
		int suma = sumArray(numeros); // las funciones hay que guardarlas en una variable
		System.out.println("La suma de los números es: " + suma);

		System.out.println("La media de los números es: " + media(numeros));
		System.out.println("El número mayor es: " + max(numeros));
		System.out.println("El número menor es: " + min(numeros));

	}

	// LA FUNCIÓN ES UN ELEMENTO QUE RECIBE Y RETORNA DATOS, MIENTRAS SEA VOID NO
	// DEVUELVE NADA.
	public static int sumArray(Integer[] array) {
		int resultado = 0;
		for (int i = 0; i < array.length; i++) {
			resultado = resultado + array[i];
		}
		return resultado;

		// i = 0
		// resultado = 0 + 1
		// i = 1
		// resultado = 1 + 2;
		// i = 2
		// resultado = 3 + 3;
		// i = 3
		// resultado = 6 + 4;
		// i = 4
		// resultado = 10 + 5;
		// i = 5
		// resultado = 15 + 6;

		// Y así sucesivamente..

	}

	public static int media(Integer[] array) {
		int suma = sumArray(array);
		return suma / array.length;

	}

	public static int max(Integer[] array) {
		int max = array[0];
		// ESTO SIGNIFICA: PARA CADA ELEMENTO DEL ARREGLO!!!!!!!!!
		for (int i = 0; i < array.length; i++) {
			// i = 0
			// array[i] = 1
			// i = 1 -> array[i] = 2
			if (array[i] > max) {
				max = array[i];
			}

		}
		return max;
	}

	public static int min(Integer[] array) {
		int min = array[0];
		// ESTO SIGNIFICA: PARA CADA ELEMENTO DEL ARREGLO!!!!!!!!!
		for (int i = 0; i < array.length; i++) {
			// i = 0
			// array[i] = 1
			// i = 1 -> array[i] = 2
			if (array[i] < min) {
				min = array[i];
			}

		}
		return min;
	}

	public static void ejercicio3() {

		Scanner sc = new Scanner(System.in);
		Double[] numeros = new Double[10];
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Escriba un número: ");
			numeros[i] = sc.nextDouble();
			sc.nextLine();
		}

		double media = calcMedia(numeros);
		System.out.print("La media de los números es: " + media + " y, los números que están encima de la media son ");
		String output = "";
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > media) {
				if (output.length() == 0) {
					output += numeros[i];
				} else {
					output += ", " + numeros[i];
				}
			}
		}
		System.out.println(output);

		// i=0
		// output = "1"
		// i=1
		// output = "1, 2"
		// i=2
		// output = "1, 2, 3"
		// .
		// .
		// .
		// i=10
		// output = "1, 2, 3, ..., 10"

	}

	public static double sumArray(Double[] array) {
		double resultado = 0;
		for (int i = 0; i < array.length; i++) {
			resultado = resultado + array[i];
		}
		return resultado;
	}

	public static double calcMedia(Double[] array) {
		double suma = sumArray(array);
		return suma / array.length;

	}

	public static int calcMediana(Integer[] array) {
		Arrays.sort(array); // ORDENA DE MENOR A MAYOR
		int mediana = array[array.length / 2];
		return mediana;
	}

	/**
	 * Crea un programa que almacene en una tabla el número de días que tiene cada
	 * mes (de un año no bisiesto), pida al usuario que te indique un mes (ej. 2
	 * para febrero) y un día (ej. el día 15). Muéstrale qué número de día es
	 * dentro del año (por ejemplo, el 15 de febrero sería el día número 46, y
	 * el 31 de diciembre sería el día 365).
	 * 
	 */

	public static void ejercicio4() {

	}

	/**
	 * Crea 2 arrays, uno para almacenar notas de alumnos y otro para almacenar sus
	 * nombres. A continuación pregunta al usuario cuántos alumnos hay en total.
	 * En función del número de alumnos pide sus nombres y sus notas y guárdalos
	 * en los respectivos arrays.
	 */
	public static void ejercicio5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuándtos alumnos hay en total?");
		int totalAlumnos = Integer.parseInt(sc.nextLine());
		String[] nombreAlumnos = new String[totalAlumnos];
		Integer[] calificaciones = new Integer[totalAlumnos];

		for (int i = 0; i < nombreAlumnos.length; i++) {
			System.out.println("Escriba el nombre de cada alumno");
			String alumno = sc.nextLine();
			nombreAlumnos[i] = alumno;

		}
		for (int i = 0; i < calificaciones.length; i++) {
			System.out.println("Escriba la nota de cada alumno");
			int nota = Integer.parseInt(sc.nextLine());
			calificaciones[i] = nota;
		}
		for (int i = 0; i < nombreAlumnos.length; i++) { // PARA CADA ALUMNO MUESTRA LA CALIFICACION
			System.out.println("NOMBRE:  " + nombreAlumnos[i] + " ||| CALIFICACIÓN:  " + calificaciones[i]);
		}

	}

	/**
	 * Crea un array de números enteros con 10 posiciones. Pregunta al usuario por
	 * un número y guarda en el array la tabla de multiplicar de dicho número. A
	 * continuación, recorre el array y muestra lo que tienes almacenado.
	 */
	public static void ejercicio6() {
		Scanner sc = new Scanner(System.in);
		Integer[] numbers = new Integer[10];
		System.out.println("Escriba un número");
		int chosenNumber = Integer.parseInt(sc.nextLine());
		for (int i = 1; i < numbers.length; i++) {
			numbers[i] = chosenNumber * i;

			// i = 1 --> numbers[1] = 2 * 1;
		}
		for (int i = 1; i < numbers.length; i++) {
			System.out.println(chosenNumber + " x " + i + " = " + numbers[i]);

		}

	}

	/**
	 * Crea un programa con 2 arrays que almacenen 10 números cada uno (pon los
	 * valores que quieras). Suma las posiciones de ambos arrays (usa un bucle) en
	 * un tercer array, y al final muestra los resultados:
	 */
	public static void ejercicio7() {

		Integer[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Integer[] array2 = { 2, 4, 2, 1, 6, 9, 7, 11, 9, 10 };
		Integer[] array3 = new Integer[10];
		for (int i = 0; i < array3.length; i++) {
			array3[i] = array1[i] + array2[i];
		}
		for (int i = 0; i < array3.length; i++) {
			System.out.println("La suma de " + array1[i] + " + " + array2[i] + " = " + array3[i]);
		}
	}

	/**
	 * Crea un array de cadenas con 10 posiciones. Pide al usuario que introduzca 10
	 * nombres. Por cada nombre introducido, debes comprobar que no existe ya en el
	 * array. Si existe, no lo guardes y vuelve a pedirle otro nombre.
	 * 
	 */

	public static void ejercicio8() {
		Scanner sc = new Scanner(System.in);
		String[] names = new String[10];
		for (int i = 0; i < names.length; i++) {
			System.out.println("Escriba un nombre");
			String givenName = sc.nextLine();
			// names[i] significa NOMBRE ACTUAL/CURRENT NAME

//			while (contains(givenName, names)) {//FUNCIÓN BOOLEANA
			while (Arrays.asList(names).contains(givenName)) {//
			System.out.println("Nombre ya existe. Escriba otro nombre.");
				givenName = sc.nextLine();

			}

			names[i] = givenName;

		}

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

	}

	//CUANDO HAYA UNA CONDICIÓN COMPLEJA, CREAR UNA FUNCION BOOLEANA.
	public static boolean contains(String givenName, String[] names) { // contains(array, string)

		for (int i = 0; i < names.length; i++) {

			if (names[i] != null && names[i].equals(givenName)) {
//				System.out.println(givenName + " true");
				return true;
			}

		}
//		System.out.println(givenName + " false");
		return false;

	}

	public static void main(String[] a) {

//		ejemploArrays();
//		ejemplosRecorridosFor();
//		ejemplosRecorridosForEachPosicion();
//		ejemplosRecorridosForEachReversa();
//		ejemploBusquedas1();
//		ejemploArrayProgramacionFuncional();
//		ejemploRedimension();
//		ejemploRedimensionB();
//		ejemploRedimensionC();
//		ejemploRedimensionD();
//		ordenarArray();
//		ejemploEliminarUnidad();
//		ordenarInverso();
//		ejercicio1();
//		ejercicio2();
//		ejercicio3();
//		ejercicio4();
//		ejercicio5();
//		ejercicio6();
//		ejercicio7();
//		ejercicio8();

	}

}