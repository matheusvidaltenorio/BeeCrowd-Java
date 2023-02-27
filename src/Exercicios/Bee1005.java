package Exercicios;

import java.util.Scanner;

public class Bee1005 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double n1 = leia.nextDouble();
        double n2 = leia.nextDouble();
        double media  = (n1 * 3.5 + 7.5 * n2)/11;
        System.out.printf("MEDIA = %.5f%n",media);
        leia.close();
    }
}
