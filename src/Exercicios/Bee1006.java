package Exercicios;

import java.util.Scanner;

public class Bee1006 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double n1 = leia.nextDouble();
        double n2 = leia.nextDouble();
        double n3 = leia.nextDouble();
        double media = ((n1*2)+(n2*3)+(n3*5))/10;
        System.out.printf("MEDIA = %.1f%n",media);
        leia.close();
    }
}
