package Exercicios;

import java.util.Scanner;

public class Bee1002 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double raio;
        raio = leia.nextDouble();
        double n;
        n = 3.14159;
        double area;
        area = (raio*raio)*n;
        System.out.printf("A=%.4f%n",area);
    }
}
