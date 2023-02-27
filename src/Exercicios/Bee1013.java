package Exercicios;

import java.util.Scanner;

public class Bee1013 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int a = leia.nextInt();
        int b = leia.nextInt();
        int c = leia.nextInt();
        int maiorab = (a + b + Math.abs(a - b))/2;
        int maiorabc = (maiorab + c + Math.abs(maiorab - c))/2;
        System.out.println(maiorabc+ " eh o maior");
        leia.close();
    }
}
