package Ap3;

import java.util.Scanner;

public class CalculadoraPesoIdeal {

       public static class Exercicio {

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            double Altura,PesoIdeal;
            char Sexo='n';

            System.out.print("Digite sua altura (em metros): ");
            Altura = entrada.nextDouble();

            while(Sexo !='m' && Sexo !='M' && Sexo !='h' && Sexo !='H'){

                System.out.print("Digite H ou M para especificar o sexo: "); // o/
                Sexo = entrada.next(".").charAt(0);

                switch (Sexo) {
                    case 'h', 'H' -> {
                        PesoIdeal = (72.7 * Altura) - 58;
                        System.out.println("Seu peso ideal é de: " + PesoIdeal + " kg.");
                    }
                    case 'm', 'M' -> {
                        PesoIdeal = (62.1 * Altura) - 44.7;
                        System.out.println("Seu peso ideal é de: " + PesoIdeal + " kg.");
                    }
                    default -> System.out.println("Não é M");
                }

            }
        }

    }
}
