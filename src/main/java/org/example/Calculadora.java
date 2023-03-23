package org.example;

public class Calculadora {
    public double sumar (double numero1,double numero2){

        return (numero1 + numero2);
    }

    public double restar (double numero1, double numero2){

        return (numero1 - numero2);
    }

    public double multiplicar (double numero1,double numero2){

        return (numero1 * numero2);
    }

    public double division (double dividendo,double divisor){

        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }else{
                return (dividendo/divisor);
        }
    }
}
