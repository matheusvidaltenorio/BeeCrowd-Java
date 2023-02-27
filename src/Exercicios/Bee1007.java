package Exercicios;

import java.util.Scanner;

public class Bee1007 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int a  = leia.nextInt();
        int b  = leia.nextInt();
        int c  = leia.nextInt();
        int d  = leia.nextInt();
        int diferenca = (a*b)-(c*d);
        System.out.println("DIFERENCA = "+diferenca);
        leia.close();
    }
}
