import java.util.Scanner;

public class hola {

    public static void main(String[] args) {
        System.out.println("Bienvenido a CS Java OOP 101");
        System.out.println("Calculadoa de IMC\n");

        double peso = 0, altura = 0, indice_masa = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su peso: ");
        peso = entrada.nextDouble();

        System.out.print("Ingrese su altura: ");
        altura = entrada.nextDouble();

        indice_masa = peso / Math.pow(altura,2);

        System.out.print("Su índice de masa corporal es: " + indice_masa);



        Jugador J1 = new Jugador();
        System.out.println("\n\n\nNombre: " + J1.getNombre());
        System.out.println("Fuerza: " + J1.getFuerza());
        System.out.println("Precisión: " + J1.getPrecision());
        System.out.println("Resistencia: " + J1.getResistencia());
        System.out.println("Rapidez: " + J1.getRapidez());
        System.out.println("Defensa: " + J1.getDefensa());


        J1.setNombre("Diego Andrés");
        J1.setFuerza((short)8);
        J1.setPrecision((short)10);
        J1.setResistencia((short)8);
        J1.setRapidez((short)11);
        J1.setDefensa((short)7);

        System.out.println("\nNombre: " + J1.getNombre());
        System.out.println("Fuerza: " + J1.getFuerza());
        System.out.println("Precisión: " + J1.getPrecision());
        System.out.println("Resistencia: " + J1.getResistencia());
        System.out.println("Rapidez: " + J1.getRapidez());
        System.out.println("Defensa: " + J1.getDefensa());



        Jugador J2 = new Jugador();

        J2.setNombre("Diego Andrés");
        J2.setFuerza((short)11);
        J2.setPrecision((short)11);
        J2.setResistencia((short)11);
        J2.setRapidez((short)11);
        J2.setDefensa((short)11);

        System.out.println("\nNombre: " + J2.getNombre());
        System.out.println("Fuerza: " + J2.getFuerza());
        System.out.println("Precisión: " + J2.getPrecision());
        System.out.println("Resistencia: " + J2.getResistencia());
        System.out.println("Rapidez: " + J2.getRapidez());
        System.out.println("Defensa: " + J2.getDefensa());

    }//fin de main

}//fin de la clase hola
