package estructuras;

import java.util.Scanner;

public class Estructuras {

    public static void ejemplosIf() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su nombre");
        String nombre = sc.nextLine();
        if (nombre.equals("Naomi")) {
            System.out.println("Hola Naomi");

        }
        System.out.println("Pasa un buen día");// lo ven todos porque está fuera de la llave condicional

        sc.close();

    }

    public static void ejemploIfElse() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su nombre");
        String nombre = sc.nextLine();
        if (nombre.equals("Naomi")) {
            System.out.println("Hola Naomi");
        } else {
            System.out.println("Hola persona desconocida");
            System.out.println("Espero verte habitualmente por aquí");

        }
        System.out.println("Pasa un buen día");// lo ven todos porque está fuera de la llave condicional

        sc.close();

    }

    public static void ejemploIfElseIfElse() {

        // bueno de usar hasta 6 condiciones o menos
        Scanner sc = new Scanner(System.in);
        System.out.println("Tira un dado y escribe que número ha salido");
        int numero = sc.nextInt();

        if (numero == 1) { // los números llevan ==, !=, etc. las letras llevan .equals()
            System.out.println("Ha salido un uno");
        } else if (numero == 2) {
            System.out.println("Ha salido un dos");
        } else if (numero == 3) {
            System.out.println("Ha salido un tres");
        } else if (numero == 4) {
            System.out.println("Ha salido un cuatro");
        } else if (numero == 5) {
            System.out.println("Ha salido un cinco");
        } else if (numero == 6) {
            System.out.println("Ha salido un seis");
        } else {
            System.out.println("¿Qué tipo de dado tienes que te ha salido un número diferente del uno al seis?");
            System.out.println("Hola");
        }
        sc.close();

    }

    public static void IfElseIfElse() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu equipo preferio");
        String equipo = sc.nextLine();
        if (equipo.toLowerCase().equals("Barcelona")) { // toLowerCase es para que si la persona escriba barcelona en
            // minuscula que no la de por erronea
            System.out.println("Visca el Barsa!");
        } else if (equipo.toUpperCase().equals("MADRID")) {// las pasa a a mayúscula y compara
            System.out.println("Hala Madrid!");
        } else if (equipo.equalsIgnoreCase("Atletico")) { // ignora las diferencias en mayus y minúsculas
            System.out.println("Aupa Atleti!");
        }

        sc.close();
    }

    public static void ejemploSwitch() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Tira un dado y escribe que número ha salido");
        int numero = sc.nextInt();
        switch (numero) {
            case 1:
                System.out.println("Ha salido un uno");
                // break;
            case 2:
                System.out.println("Ha salido un dos");
                break;
            case 3:
                System.out.println("Ha salido un tres");
                break;
            case 4:
                System.out.println("Ha salido un cuatro");
                break;
            case 5:
                System.out.println("Ha salido un cinco");
                break;
            case 6:
                System.out.println("Ha salido un seis");
                break;
            default:
                System.out.println("¿Qué tipo de dado tienes que te ha salido un número diferente del uno al seis?");
                break;

        }
        sc.close();

    }

    public static void ejemploTernarias() {
        // muy utilizado cuando se quiere sacar un mensaje u otro dependiendo de la
        // condición.
        int edad = 20;
        // if(edad>=18)
        // System.out.println("Eres mayor de edad");
        // else
        // System.out.println("Eres menor de edad");
        //
        System.out.println(edad >= 18 ? "Eres mayor de edad" : "Eres menor de edad");
        int descuento = edad > 18 ? 5 : 20;
        System.out.println(descuento);

        // int tresValores;
        // if(edad<18 ) {
        // tresValores =1;
        // } else if(edad>=18 && edad<=65) {
        // tresValores =2;
        // } else {
        // tresValores=3;
        // }
        // System.out.println("TresValores vale" + tresValores);
        //
        //

        int tresValores = edad < 18 ? 1 : (edad > 18 && edad <= 65) ? 2 : 3;

    }

    public static void ejemploTernary() {

        int euros = 10;
        System.out.println("Cuesta " + euros + " euro" + (euros != 1 ? "s" : ""));
    }

    public static void ejercicio1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un numero entero para saber si es par o impar");
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es un número par");
        } else {
            System.out.println("El número " + numero + " es un número impar");
        }

        sc.close();

    }

    public static void ejercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un número para saber si es múltiplo de 10");
        int numero = sc.nextInt();
        if (numero % 10 == 0) {
            System.out.println("Su numero es un múltiplo de 10");
        } else {
            System.out.println("Su número no es un múltiplo de 10");
        }
        sc.close();
    }

    public static void ejercicio3() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una letra");
        char caracter = sc.next().charAt(0); // CharAt pasa el contenido del char (caracteres) a números.
        if (caracter >= 'A' && caracter <= 'Z') {
            System.out.println("El caracter " + caracter + " está en mayúscula");
        } else {
            System.out.println("El caracter " + caracter + " está en minúsucla");
        }

        sc.close();

    }

    public static void ejercicio4() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una oración");
        String oracion1 = sc.nextLine();
        System.out.println("Por favor, escriba la misma oración");
        String oracion2 = sc.nextLine();
        if (oracion1.equals(oracion2)) {
            System.out.println("¡Ambas oraciones son iguales!");
        } else {
            System.out.println("¡Las oraciones son diferentes!");
        }

        // String oracion = oracion1.equals(oracion2)?"¡Ambas oraciones son
        // iguales!":"¡Las oraciones son diferentes!";

        sc.close();
    }

    public static void ejercicio5() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un número");
        int numero1 = sc.nextInt();
        System.out.println("Por favor, escriba otro número");
        int numero2 = sc.nextInt();
        if (numero2 != 0) {
            System.out.println(
                    "Si dividimos " + numero1 + " entre " + numero2 + ", el resultado es " + numero1 / numero2);
        } else {
            System.out.println("¡El resultado es infinito!");
        }

        sc.close();

    }

    public static void ejercicio6() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, escriba un primer número:");
        int n1 = sc.nextInt();
        System.out.println("Por favor, escriba un segundo número:");
        int n2 = sc.nextInt();
        System.out.println("Por favor, escriba un tercer número:");
        int n3 = sc.nextInt();
        if (n1 > n2 && n1 > n3) {
            System.out.println("El número " + n1 + " es mayor que " + n2 + " y " + n3);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("El número " + n2 + " es mayor que " + n1 + " y " + n3);

        } else if (n3 > n1 && n3 > n2) {
            System.out.println("El número " + n3 + " es mayor que " + n1 + " y " + n2);
        }

        // System.out.println((n1>n2 && n1>n3?"El número " + n1 + "es mayor que " + n2 +
        // " y " + n3 : (n2>n1 && n2>n3)? "El número " + n2 + "es mayor que " + n1 + " y
        // " + n3 : (n3>n1 && n3>n2)? "El número " + n3 + "es mayor que " + n1 + " y " +
        // n2);
    }

    public static void ejercicio7() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, escriba qué hora es (de 0 a 23)");
        int hora = sc.nextInt();

        if (hora > 23 || hora < 0) {
            System.out.println("¡El formato debe ser de 24H! Vuelva a escribirlo");
            sc.close();
            return;
        }

        System.out.println("Escriba qué minutos son (de 0 a 59)");
        int mins = sc.nextInt();
        if (mins > 59 || mins < 0) {
            System.out.println("¡Los minutos van de 0 a 59!");
            sc.close();
            return;

        }
        System.out.println("Por favor, escriba los segundos (de 0 a 59)");

        int secs = sc.nextInt();
        if (secs > 59 || secs < 0) {
            System.out.println("¡Los segundos van de 0 a 59!");
            sc.close();
            return;

        }
        String horaR = String.valueOf(hora).length() == 1 ? "0" + String.valueOf(hora) : String.valueOf(hora);
        String minsR = String.valueOf(mins).length() == 1 ? "0" + String.valueOf(mins) : String.valueOf(mins);
        String secsR = String.valueOf(secs).length() == 1 ? "0" + String.valueOf(secs) : String.valueOf(secs);

        System.out.println("La hora exacta es: " + horaR + "-" + minsR + "-" + secsR);

        sc.close();
    }

    public static void ejercicio8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, escriba un número");
        int A = sc.nextInt();
        System.out.println(A % 2 == 0 ? A + " es un número par" : A + " es un número impar");

        sc.close();

    }

    public static void ejercicio9() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, escriba el número de un mes:");
        int mes = sc.nextInt();
        if (mes < 1 || mes > 12) {
            System.out.println("Ese mes no existe");
        } else {
            switch (mes) {

                case 1:
                    System.out.print("Enero");
                    break;
                case 2:
                    System.out.print("Febrero");
                    break;
                case 3:
                    System.out.print("Marzo");
                    break;
                case 4:
                    System.out.print("Abril");
                    break;
                case 5:
                    System.out.print("Mayo");
                    break;
                case 6:
                    System.out.print("Junio");
                case 7:
                    System.out.print("Julio");
                    break;
                case 8:
                    System.out.print("Agosto");
                    break;
                case 9:
                    System.out.print("Septiembre");
                    break;
                case 10:
                    System.out.print("Octubre");
                    break;
                case 11:
                    System.out.print("Noviembre");
                    break;
                case 12:
                    System.out.print("Diciembre");
                    break;
            }

            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                System.out.println(" es un mes de 31 días");
            } else if (mes == 2) {
                System.out.println(" es un mes de 28 días");
            } else {
                System.out.println(" es un mes de 30 días");

            }
        }
        sc.close();
    }

    public static void ejercicio10() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, escriba un caracter:");
        char car = sc.next().charAt(0);
        switch (car) {
            case 1:
                System.out.println("El caracter es un signo de puntuación");
                break;
            case 2:
                System.out.println("El caracter es una cifra numérica");
                break;
            case 3:

                System.out.println("El caracter es una letra alfabética");
                break;
        }
        if (car == '.' || car == ',' || car == ';' || car == ':') {
            System.out.println("El caracter es un signo de puntuación");
        } else if (Boolean.valueOf(String.valueOf(car == '0')) || Boolean.valueOf(String.valueOf(car <= '9'))) {
            System.out.println("El caracter es una cifra numérica");
        } else if (Boolean.valueOf(String.valueOf(car <= 'A')) || Boolean.valueOf(String.valueOf(car >= 'Z'))
                || Boolean.valueOf(String.valueOf(car >= 'z'))) {
            System.out.println("El caracter es una letra alfabética");
        } else {
            System.out.println("No sé que tipo de caracter ha escrito");
        }
        sc.close();
    }
    // se podía hacer con Character.isDigit

    public static void ejercicio11() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un número:");
        int n1 = sc.nextInt();
        System.out.println("Escriba otro número:");
        int n2 = sc.nextInt();
        System.out.printf("Elija una de las siguientes opciones\n");
        System.out.println("--------------------------------------------------------");
        System.out.println("1." + "Sumar   " + "2." + "Restar    " + "3." + "Multiplicar     " + "4." + "Dividir");
        int oper = sc.nextInt();
        System.out.println(oper == 1 ? n1 + n2
                : oper == 2 ? n1 - n2
                        : oper == 3 ? n1 * n2 : oper == 4 ? n1 / n2 : "¡Debes elegir una de las opciones!");
        // if (oper ==1) {
        // System.out.println(n1+n2);
        // } else if (oper==2) {
        // System.out.println(n1-n2);
        // } else if (oper==3) {
        // System.out.println(n1*n2);
        // } else if (oper==4) {
        // System.out.println(n1/n2);
        // } else {
        // System.out.println("¡Debes elegir entre 1 y 4!");
        // }

        sc.close();

    }

    /**
     * 2. Crea una variable con el precio de una entrada que inicialmente valga 50.
     * Pregunta al usuario
     * su edad.
     * Si es menor de edad se le hará un descuento del 25% en la entrada.
     * Si es mayor de edad pero no está jubilado (65 años), pregúntale si es socio.
     * Si el usuario
     * responde “sí” hazle un descuento del 40%.
     * Si está jubilado se le hará un descuento del 75%.
     * Finalmente muéstrale el precio que tiene que pagar por la entrada
     * 
     */

    public static void ejercicio12() {

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuál es su edad?");
        int ticket = 50;
        double descMenor = 0.25;
        double descSocio = 0.40;
        double descJubilado = 0.75;
        int edad = sc.nextInt();
        if (edad < 18) {
            System.out.println("Descuento del 25% de la entrada. El precio total a pagar es: "
                    + (ticket - (ticket * descMenor)) + " euros.");
        } else if (edad > 65) {

            System.out.println("Descuento del 70% de la entrada. El precio total a pagar es: "
                    + (ticket - (ticket * descJubilado)) + " euros.");

        } else if (edad >= 18 && edad <= 65) {
            System.out.println("¿Es usted socio?");
            String socio = sc.next();
            if (socio.equals("Sí") || socio.equals("si") || socio.equals("Si")) {
                System.out.println("Descuento del 40%. El precio total a pagar es: " + (ticket - (ticket * descSocio))
                        + " euros.");
            } else if (socio.equals("No") || socio.equals("no")) {
                System.out.println("El precio total a pagar es de " + ticket + " euros.");

            }
        } else {
            System.out.println("El precio total a pagar es de " + ticket + " euros.");
        }

        sc.close();
    }

    public static void ejemploAmbitosvariables() {
        int numero = 5;
        int edad = 20;
        if (edad > 18) {
            int valor = 4; // no podríamos poner número = 3, porque repetiríamos variables
            System.out.println(numero);

        }
        System.out.println("hola");
    }

    /**
     * Este programa se ejecuta hasta que el usuario adivine la contraseña
     */

    public static void ejemploWhile1() {
        Scanner sc = new Scanner(System.in);
        String password = "1234";
        boolean adivina = false;
        while (adivina == false) { // puede ser también (!adivina)
            System.out.println("Escriba la contraseña");
            String respuesta = sc.nextLine();
            if (respuesta.equals(password)) {
                adivina = true;
            }

        }
        System.out.println("¡Enhorabuena!¡Acertaste!");
        sc.close();
    }

    /**
     * Programa que te deja intentar hasta 3 veces escribir la contraseña
     */
    public static void ejemploWhile2() {

        Scanner sc = new Scanner(System.in);
        String password = "1234";
        int intentos = 0;
        boolean adivina = false;
        while (!adivina && intentos < 3) {// mientras no adivine y el numero de intentos sea menor de 3, te deja
                                          // intentar
            System.out.println("Introduce la contraseña. Tienes " + (3 - intentos) + " intento" + ""
                    + (intentos != 2 ? "s" : ":"));
            String respuesta = sc.nextLine();
            intentos++;
            if (respuesta.equals(password)) {
                adivina = true;
            } else {
                System.out.printf("Fallaste. ");
            }
        }
        // if (adivina){ //esto es igual que escribir (adivina == true)
        // System.out.println("Acertaste");
        // } else {
        // System.out.println("Gastaste todos tus intentos");
        // }
        //
        System.out.println(adivina ? "Acertaste!" : "Gastaste todos tu intentos!"); // ternaria MUCHO más corta!

        sc.close();
    }

    /**
     * Muestra por pantalla los números de 20 al 1 usando un bucle while, y después
     * hazlo otra vez
     * usando un bucle for.
     * 
     */
    public static void ejercicio13() {
        int numero = 20;
        while (numero > 0) {
            System.out.println(numero--);// si hubiesemos hecho --numero, no hubiese impreso el 20 porque le quita 1
                                         // antes de correr el programa
            // si ponemos solo (numero), el bucle se vuelve infinito porque nunca deja de
            // valer 20, hay que decrementarlo.
            // numero --
            // hay que intentar escribir siempre la condiión de salida para que no se nos
            // olvide, ya que es la ultima antes de salir del bucle.

        }

    }

    /**
     * Inicializa una variable entera a 0. Después, pregunta al usuario por un
     * número y súmaselo a la
     * variable inicial. Repite esto hasta que el usuario introduzca el número cero.
     * Utiliza el bucle
     * do...while.
     */

    public static void ejercicio14() {
        Scanner sc = new Scanner(System.in);
        int v = 0;
        do {
            System.out.println("Escriba un número");
            v = sc.nextInt();
            v += 0;
        } while (v != 0);
        {
            if (v != 0) {
                System.out.println("Escriba un número");
                v = sc.nextInt();
                v += 0;
            } else if (v == 0) {
                System.out.println("Hemos terminado!");
            }
        }
        sc.close();

    }

    /**
     * Pide al usuario un número y calcula cuantas cifras tiene dicho número. Para
     * ello puedes dividir
     * el número entre 10 hasta que el resultado sea cero.
     */

    public static void ejercicio15() {
        int digitos = 0;
        int cifra = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un una cifra");
        cifra = sc.nextInt();
        sc.nextLine();
        while (cifra != 0) {
            digitos++;
            cifra = cifra / 10;
        }
        System.out.println("El numero de dígitos es: " + digitos);
        sc.close();
    }

    /**
     * Pide al usuario un número y dibuja una línea con tantos asteriscos como el
     * número introducido.
     */

    public static void ejercicio16() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un número");
        int n = 0;
        int astk = sc.nextInt();
        while (n < astk) {
            n++;
            System.out.print("*");
        }
        System.out.println();

    }

    public static void 

	public static void main(String[] args) {
		//ejemplosIf();
		//ejemploIfElse();
		//ejemploIfElseIfElse();
		//IfElseIfElse();
		//ejemploSwitch();
		//ejemploTernarias();
		//ejemploTernary();
		//ejercicio2();
		//		ejercicio3();
		//ejercicio1();
		//ejercicio4();
		//ejercicio5();
		//ejercicio6();
		//ejercicio7();
		//		ejercicio8();
		//		ejercicio9();
		//		ejercicio10();
		//		ejercicio11();
		//		ejercicio12();
//		ejemploAmbitosvariables();
//		ejemploWhile1();
//		ejemploWhile2();
//		ejercicio13();
//		ejercicio12();
//		ejercicio14();
//		ejercicio15();
		ejercicio16();
		
		



		
	}
}
