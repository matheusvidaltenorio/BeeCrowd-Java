package Exercicios;

import java.util.Scanner;

public class Bee1015 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double vlrx1 = leia.nextDouble();
        double vlry1 = leia.nextDouble();
        double vlrx2 = leia.nextDouble();
        double vlry2 = leia.nextDouble();
        double dist = Math.pow(vlrx1 - vlrx2,2) + Math.pow(vlry2 - vlry1,2);
        double result = Math.sqrt(dist);
        System.out.printf("%.4f%n",result);
        leia.close();
    }
}
