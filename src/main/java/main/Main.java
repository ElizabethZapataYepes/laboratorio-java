package main;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.ProcessBuilder;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean repetir = true;
        String opcion = "0";
        do {
            menu();
            opcion = leer.next();
            if (comprobarNumero(opcion)){
                double opcionConvert = Double.valueOf(opcion);
                if(opcionConvert == 1){
                    System.out.println("Este ejercicio indica entre dos numeros, cual es el mayor o si son iguales");
                    System.out.print("¿Desea ejercutarlo? \nEscriba SI o NO: ");
                    opcion = leer.next().toUpperCase(Locale.ROOT);
                    if (opcion.equals("SI")) {
                        primerEjercicio();
                        repetir = true;
                    } else {
                        System.out.println("FELIZ DÍA");
                    }
                } else if (opcionConvert == 2){
                    System.out.println("Este ejercicio es una variacion del primero. Debes ingresar los números");
                    System.out.print("¿Desea ejercutarlo? \nEscriba SI o NO: ");
                    opcion = leer.next().toUpperCase(Locale.ROOT);
                    if (opcion.equals("SI")){
                        segundoEjercicio();
                        repetir = true;
                    } else {
                        System.out.println("FELIZ DÍA");
                    }
                } else if (opcionConvert == 3){
                    System.out.println("Este ejercicio calcula el area de una circunferencia. Solo debes ingresar" +
                            "el radio de la circunferencia");
                    System.out.print("¿Desea ejercutarlo? \nEscriba SI o NO: ");
                    opcion = leer.next().toUpperCase(Locale.ROOT);
                    if (opcion.equals("SI")) {
                        tercerEjercicio();
                        repetir = true;
                    } else {
                        System.out.println("FELIZ DÍA");
                    }
                } else if (opcionConvert == 4) {
                    System.out.println("Este ejercicio calcula el valor del producto, con IVA incluido.");
                    System.out.print("¿Desea ejercutarlo? \nEscriba SI o NO: ");
                    opcion = leer.next().toUpperCase(Locale.ROOT);
                    if (opcion.equals("SI")){
                        cuartoEjercicio();
                        repetir = true;
                    } else {
                        System.out.println("FELIZ DÍA");
                    }
                } else if (opcionConvert == 5) {
                    System.out.println("Este ejercicio muestra los numeros pares e impares del 1 al 100.");
                    System.out.print("¿Desea ejercutarlo? \nEscriba SI o NO: ");
                    opcion = leer.next().toUpperCase(Locale.ROOT);
                    if (opcion.equals("SI")){
                        quintoEjercicio();
                        repetir = true;
                    } else {
                        System.out.println("FELIZ DÍA");
                    }
                } else if (opcionConvert == 6) {
                    System.out.println("Este ejercicio muestra los numeros pares e impares del 1 al 100.");
                    System.out.print("¿Desea ejercutarlo? \nEscriba SI o NO: ");
                    opcion = leer.next().toUpperCase(Locale.ROOT);
                    if(opcion.equals("SI")){
                        sextoEjercicio();
                        repetir = true;
                    } else {
                        System.out.println("FELIZ DÍA");
                    }
                } else if (opcionConvert == 7) {
                    System.out.println("Este ejercicio muestra si un numero es mayor o igual que cero.");
                    System.out.print("¿Desea ejercutarlo? \nEscriba SI o NO: ");
                    opcion = leer.next().toUpperCase(Locale.ROOT);
                    if (opcion.equals("SI")){
                        septimoEjercicio();
                        repetir = true;
                    } else {
                        System.out.println("FELIZ DÍA");
                    }
                } else if (opcionConvert == 8) {
                    System.out.println("Este ejercicio indica si un día es laboral o festivo.");
                    System.out.print("¿Desea ejercutarlo? \nEscriba SI o NO: ");
                    opcion = leer.next().toUpperCase(Locale.ROOT);
                    if (opcion.equals("SI")){
                        octavoEjercicio();
                        repetir = true;
                    } else {
                        System.out.println("FELIZ DÍA");
                    }
                } else if (opcionConvert == 9) {
                    System.out.println("Este ejercicio cmabia las letras 'a' por las 'e'.");
                    System.out.print("¿Desea ejercutarlo? \nEscriba SI o NO: ");
                    opcion = leer.next().toUpperCase(Locale.ROOT);
                    if(opcion.equals("SI")){
                        novenoEjercicio();
                        repetir = true;
                    } else {
                        System.out.println("FELIZ DÍA");
                    }
                } else if (opcionConvert == 10) {
                    System.out.println("Este ejercicio elimina los espacios de una frase");
                    System.out.print("¿Desea ejercutarlo? \nEscriba SI o NO: ");
                    opcion = leer.next().toUpperCase(Locale.ROOT);
                    if (opcion.equals("SI")){
                        decimoEjercicio();
                        repetir = true;
                    } else {
                        System.out.println("FELIZ DÍA");
                    }
                } else if (opcionConvert == 11) {
                    System.out.println("Este ejercicio muestra cuantas letras y vocales tiene una frase");
                    System.out.print("¿Desea ejercutarlo? \nEscriba SI o NO: ");
                    opcion = leer.next().toUpperCase(Locale.ROOT);
                    if(opcion.equals("SI")){
                        decimoPrimerEjercicio();
                        repetir = true;
                    } else {
                        System.out.println("FELIZ DÍA");
                    }
                } else if (opcionConvert == 12) {
                    System.out.println("Este ejercicio muestra si dos frases son iguales");
                    System.out.print("¿Desea ejercutarlo? \nEscriba SI o NO: ");
                    opcion = leer.next().toUpperCase(Locale.ROOT);
                    if (opcion.equals("SI")){
                        decimoSegundoEjercicio();
                        repetir = true;
                    } else {
                        System.out.println("FELIZ DÍA");
                    }
                } else if (opcionConvert == 13) {
                    System.out.println("Este ejercicio muestra la hora en formato (AAAA/MM/DD) (HH:MM:SS)");
                    System.out.print("¿Desea ejercutarlo? \nEscriba SI o NO: ");
                    opcion = leer.next().toUpperCase(Locale.ROOT);
                    if (opcion.equals("SI")){
                        decimoTercerEjercicio();
                    } else {
                        System.out.println("FELIZ DÍA");
                    }
                    repetir = true;
                } else if (opcionConvert == 14) {
                    System.out.println("Este ejercicio muestra los desde N numero hasta 1000, mostrando de 2 en 2");
                    System.out.print("¿Desea ejercutarlo? \nEscriba SI o NO: ");
                    opcion = leer.next().toUpperCase(Locale.ROOT);
                    if (opcion.equals("SI")){
                        decimoCuartoEjercicio();
                        repetir = true;
                    } else {
                        System.out.println("FELIZ DÍA");
                    }
                } else if (opcionConvert == 15) {
                    System.out.println("Este ejercicio muestra un menu");
                    System.out.print("¿Desea ejercutarlo? \nEscriba SI o NO: ");
                    opcion = leer.next().toUpperCase(Locale.ROOT);
                   if(opcion.equals("SI")){
                       quinceavoEjercicio();
                       repetir = true;
                   } else {
                       System.out.println("FELIZ DÍA");
                   }
                } else if ( opcionConvert == 16){
                    main.Ejercicio16.Main main = new main.Ejercicio16.Main();
                    main.ejecutar();
                }else if( opcionConvert == 17){
                    main.Ejercicio17.Main main = new main.Ejercicio17.Main();
                    main.llenarLista();
                    main.precioFinal();
                }else if (opcionConvert == 20) {
                    System.out.println("Muchas gracias, que tenga un felíz día \nVuelve Pronto");
                    repetir = false;
                }
            } else {
                System.out.println("¿Usted es bruto? INGRESE UN NÚMERO");
                repetir = true;
            }
        } while (repetir == true);
    }


    //Métodos


    private static void menu() {
        System.out.println("__________________________TALLER JAVA___________________________");
        System.out.println("Seleccione de menú que ejercicio desea ejecutar");
        System.out.println("[1],  [2],  [3],  [4],  [5],  [6], [7],  [8],  [9], " +
                "\n[10], [11], [12], [13], [14], [15], [16], [17], [18] \n20- Para cerrar");
        System.out.print("¿Que ejercicio desea resolver?: ");

    }

    public static void clearConsole() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }


    public static boolean comprobarNumero(String n){
        if(n.matches("[+-]?\\d*(\\.\\d+)?")) {
            return true;
        } else {
            return false;
        }
    }

    public static void pedirNumero(){
        System.out.print("Ingrese un numero: ");
    }

    public static void ejecutarEjercio(){
        Scanner leer = new Scanner(System.in);
        String opcion = "";
        System.out.println("¿Desea ejercutarlo?");
        opcion = leer.next().toUpperCase(Locale.ROOT);
    }

    private static void primerEjercicio() {
        double numeroUno = 3;
        double numeroDos = 4;
        if (numeroUno > numeroDos) {
            System.out.println("El número " + numeroUno + " es mayor que el numero " + numeroDos );
        } else {
            System.out.println("El número " + numeroDos + " es mayor que el numero " + numeroUno );
        }
        System.out.println("________________________________________________________________");
    }

    private static void segundoEjercicio(){
        String numeroUno,numeroDos;
        Scanner leer = new Scanner(System.in);
        boolean repetir = true;
        do {
            pedirNumero();
            numeroUno=leer.next();
            if (comprobarNumero(numeroUno)){
                pedirNumero();
                numeroDos=leer.next();
                if (comprobarNumero(numeroDos)){
                    double numeroUnoConvert = Double.valueOf(numeroUno);
                    double numeroDosConvert = Double.valueOf(numeroDos);
                    if (numeroUnoConvert > numeroDosConvert){
                        System.out.println("El numero mayor es " + numeroUnoConvert);
                    } else if (numeroUnoConvert < numeroDosConvert) {
                        System.out.println("El numero mayor es " + numeroDosConvert);
                    } else {
                        System.out.println("Los numero son iguales ");
                        repetir = false;
                    }
                } else {
                    System.out.println("¿Usted es bruto? INGRESE UN NÚMERO");
                    repetir = true;
                }
            } else {
                System.out.println("¿Usted es bruto? INGRESE UN NÚMERO");
                repetir = true;
            }
            System.out.println("________________________________________________________________");
        } while (repetir == true);
    }

    private static void tercerEjercicio(){
        Scanner leer = new Scanner(System.in);
        double numeroPI = 3.14;
        String radioCircunferencia = "0";
        double areaCircunferencia = 0;
        boolean repetir = true;
        do {
            System.out.print("Ingrese el radio de la circunferencia: ");
            radioCircunferencia = leer.next();
            if (comprobarNumero(radioCircunferencia)){
                comprobarNumero(radioCircunferencia);
                double radioCincunferenciaConvert = Double.valueOf(radioCircunferencia);
                areaCircunferencia = numeroPI*Math.pow(radioCincunferenciaConvert,2);
                System.out.println("El area de la circunferencia es: " + areaCircunferencia);
                repetir = false;
            } else {
                System.out.println("¿Usted es bruto? INGRESE UN NÚMERO");
                repetir = true;
            }
            System.out.println("________________________________________________________________");
        } while (repetir == true);
    }

    private static void cuartoEjercicio(){
        Scanner leer = new Scanner(System.in);
        String precioProducto = "";
        double preciFinal = 0;
        double valorIva = 0.21;
        boolean repeptir = true;
        do {
            System.out.print("Ingrese el valor del producto: ");
            precioProducto = leer.next();
            if (comprobarNumero(precioProducto)){
                double precioProductoConvert = Double.valueOf(precioProducto);
                preciFinal = (precioProductoConvert*valorIva) + precioProductoConvert;
                System.out.println("El total a pagar es de: " + preciFinal);
                repeptir = false;
            } else {
                System.out.println("¿Usted es bruto? INGRESE UN NÚMERO");
                repeptir = true;
            }
            System.out.println("________________________________________________________________");
        } while (repeptir == true);
    }

    private static void quintoEjercicio(){
        int contador = 1;
        while (contador < 101) {
            if (contador %2 == 0) {
                System.out.println(contador + " Numero par");
            }else {
                System.out.println(contador + " Numero Impar");
            }
            contador++;
        }
        System.out.println("________________________________________________________________");
    }

    private static void sextoEjercicio(){
        for (int contador =1; contador < 101; contador++) {
            if (contador %2 == 0) {
                System.out.println(contador + " Numero par");
            }else {
                System.out.println(contador + " Numero Impar");
            }
        }
        System.out.println("________________________________________________________________");
    }

    private static void septimoEjercicio(){
        Scanner leer = new Scanner(System.in);
        String numero = "0";
        boolean repetir = true;
        do {
            pedirNumero();
            numero = leer.next();
            if (comprobarNumero(numero)){
                double numeroConvert = Double.valueOf(numero);
                if (numeroConvert <= 0 ) {
                    System.out.println("Ingrese un número mayor a 0");
                    repetir = true;
                } else {
                    System.out.println("El numero es: " + numero);
                    repetir = false;
                }
            }
            System.out.println("________________________________________________________________");
        } while (repetir == true);
    }

    private static void octavoEjercicio(){
        Scanner leer = new Scanner(System.in);

        String diaSemana = "";
        boolean repetir = true;
        do {
            System.out.print("Ingrese un día de la semana: ");
            diaSemana = leer.next().toUpperCase(Locale.ROOT);
            if (diaSemana.equals("LUNES")  || diaSemana.equals("1") || diaSemana.equals("2")
                    || diaSemana.equals("2")  || diaSemana.equals("MIERCOLES")
                    || diaSemana.equals("3") || diaSemana.equals("JUEVES") || diaSemana.equals("4")
                    || diaSemana.equals("VIERNES") || diaSemana.equals("5")){
                System.out.println("Dia laboral");
                repetir = false;
            } else if (diaSemana.equals("SABADO") || diaSemana.equals("6") || diaSemana.equals("DOMINGO")
                    || diaSemana.equals("7")){
                System.out.println("Dia Feriado");
                repetir = false;
            } else {
                System.out.println("No es un día válido");
                repetir = true;
            }
            System.out.println("________________________________________________________________");
        } while (repetir == true);
    }

    private static void novenoEjercicio(){
        Scanner leer = new Scanner(System.in);
        String textInicial = "La sonrisa sera la mejor arma contra la tristeza. ";
        String nuevoTexto = "";
        String textoFinal = "";

        System.out.print("Ingrese un texto libre: ");
        nuevoTexto = leer.nextLine();
        textoFinal = textInicial.replace("a", "e") + nuevoTexto;
        System.out.println(textoFinal);
        System.out.println("________________________________________________________________");
    }

    private static void decimoEjercicio(){
        Scanner leer = new Scanner(System.in);
        String textInicial = "";
        String textoFinal = "";
        System.out.print("Ingrese un texto libre: ");
        textInicial = leer.nextLine();
        textoFinal = textInicial.replace(" ", "");
        System.out.println(textoFinal);
        System.out.println("________________________________________________________________");

    }

    private static void decimoPrimerEjercicio(){
        Scanner leer = new Scanner(System.in);
        String frase = "";
        String nuevaFrase = "";
        int cantidadA = 0;
        int cantidadE = 0;
        int cantidadI = 0;
        int cantidadO = 0;
        int cantidadU = 0;
        System.out.print("Ingrese una frase: ");
        frase = leer.nextLine();
        nuevaFrase = frase.toUpperCase().replace(" ", "");

        for (int vocales = 0; vocales < nuevaFrase.length(); vocales++) {
            if (nuevaFrase.charAt(vocales) == 'A') {
                cantidadA++;
            } else if (nuevaFrase.charAt(vocales) == 'E') {
                cantidadE++;
            } else if (nuevaFrase.charAt(vocales) == 'I') {
                cantidadI++;
            } else if (nuevaFrase.charAt(vocales) == 'O') {
                cantidadO++;
            } else if (nuevaFrase.charAt(vocales) == 'U') {
                cantidadU++;
            }
        }

        System.out.println("La frase tiene: " + nuevaFrase.length()+ " caracteres");
        System.out.println("Hay " + cantidadA + " vocal(es) 'a'  en la frase");
        System.out.println("Hay " + cantidadE + " vocal(es) 'e'  en la frase");
        System.out.println("Hay " + cantidadI + " vocal(es )'i'  en la frase");
        System.out.println("Hay " + cantidadO + " vocal(es) 'o'  en la frase");
        System.out.println("Hay " + cantidadU + " vocal(es) 'u'  en la frase");
        System.out.println("________________________________________________________________");
    }

    public static void decimoSegundoEjercicio(){
        Scanner sn = new Scanner(System.in);

        System.out.print("Escribe la palabra 1: ");
        String palabra1 = sn.next();

        System.out.print("Escribe la palabra 2: ");
        String palabra2 = sn.next();

        if(palabra1.equals(palabra2)){
            System.out.println("Las palabras son iguales");
        }else{
            System.out.println("Las palabras no son iguales");
        }
        System.out.println("________________________________________________________________");
    }

    public static void decimoTercerEjercicio(){
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        System.out.println("Hora y fecha: "+hourdateFormat.format(date));
        System.out.println("________________________________________________________________");
    }

    public static void decimoCuartoEjercicio(){
        Scanner leer = new Scanner(System.in);
        int numeroInicial = 0;
        pedirNumero();
        numeroInicial = leer.nextInt();

        for (int contador = numeroInicial; contador <= 100; contador+=2){
            System.out.println(contador);
        }
        System.out.println("________________________________________________________________");
    }

    public static void quinceavoEjercicio(){
        Scanner leer = new Scanner(System.in);

        int opcion = 0;
        boolean repetir = true;
        System.out.println("*****GESTION CINEMATOGRÁFICA*****");
        System.out.println("1-NUEVO ACTOR \n2-BUSCAR ACTOR \n3-ELIMINAR ACTOR");
        System.out.println("4-MODIFICAR ACTOR \n5-VER TODOS LOS ACTORES \n6-VER PELICULAS DE LOS ACTORES");
        System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES \n8-SALIR");

        while (repetir == true) {
            opcion = leer.nextInt();
            if (opcion != 8) {
                System.out.println("*****GESTION CINEMATOGRÁFICA*****");
                System.out.println("1-NUEVO ACTOR \n2-BUSCAR ACTOR \n3-ELIMINAR ACTOR");
                System.out.println("4-MODIFICAR ACTOR \n5-VER TODOS LOS ACTORES \n6-VER PELICULAS DE LOS ACTORES");
                System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES \n8-SALIR");
                repetir = true;
            } else {
                repetir = false;
            }
        }
        System.out.println("________________________________________________________________");
    }

}
