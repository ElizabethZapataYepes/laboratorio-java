package main.Ejercicio16;
import main.Teclado.Teclado;
public class Main {

    public static void comprobarPesoIdeal(Persona persona){
        if(persona.calcularIMC()==-1){
            System.out.println("Estas bajo de peso");
        }
        else if(persona.calcularIMC()==0){
            System.out.println("Estas en tu peso ideal");
        }
        else {
            System.out.println("Estas en sobrepeso");
        }
    }


    public static void ejecutar() {
        System.out.print("Digite el nombre: ");
        String nombre= Teclado.input();
        System.out.print("Digite la edad: ");
        Integer edad= Teclado.inputInteger();
        System.out.print("Digite el sexo: ");
        Character sexo= Teclado.input().charAt(0);
        System.out.print("Digite el peso: ");
        Double peso= Teclado.inputDouble();
        System.out.print("Digite la altura");
        Double altura= Teclado.inputDouble();

        Persona persona1 = new Persona(nombre,edad,peso,altura,sexo);

        System.out.println("Persona 1:");
        System.out.println("Es mayor de edad: "+ persona1.esMayorDeEdad());
        System.out.println(persona1.toString());
        Main.comprobarPesoIdeal(persona1);
    }
}

