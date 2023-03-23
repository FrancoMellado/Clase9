package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Seleccione la operación que desea efectuar: ");
            System.out.println("1) Suma");
            System.out.println("2) Resta");
            System.out.println("3) Division");
            System.out.println("4) Multiplicacion");

            Scanner opcion = new Scanner(System.in);
            String seleccion = opcion.nextLine();
            System.out.println(seleccion);

            Calculadora resultado = new Calculadora();

            switch (seleccion) {
                case "1" -> {

                    System.out.println("Ingrese los numeros a sumar: ");

                    Scanner num1 = new Scanner(System.in);
                    Double suma1 = num1.nextDouble();

                    Scanner num2 = new Scanner(System.in);
                    Double suma2 = num2.nextDouble();

                    System.out.println("El resultado de la suma : " + resultado.sumar(suma1,suma2));
                }
                case "2" -> {
                    System.out.println("Ingrese los numeros a sumar: ");

                    Scanner num1 = new Scanner(System.in);
                    Double resta1 = num1.nextDouble();

                    Scanner num2 = new Scanner(System.in);
                    Double resta2 = num2.nextDouble();

                    System.out.println("El resultado de la resta es: " + resultado.restar(resta1,resta2));
                }
                case "3" -> {
                    System.out.println("Ingrese los numeros a dividir: ");

                    Scanner num1 = new Scanner(System.in);
                    Double div1 = num1.nextDouble();

                    Scanner num2 = new Scanner(System.in);
                    Double div2 = num2.nextDouble();

                    System.out.println("El resultado de la division es: " + resultado.division(div1,div2));
                }
                case "4" -> {
                    System.out.println("Ingrese los numeros a multiplicar: ");

                    Scanner num1 = new Scanner(System.in);
                    Double mult1 = num1.nextDouble();

                    Scanner num2 = new Scanner(System.in);
                    Double mult2 = num2.nextDouble();

                    System.out.println("El resultado de la multiplicacion es: " + resultado.multiplicar(mult1, mult2));

                }
                default -> {
                    System.out.println("La opcion seleccionada no es correcta.");
                }
            }

        }catch (Exception e) {

            System.out.println("Excepcion:" + e.getMessage());
        }
    }

}