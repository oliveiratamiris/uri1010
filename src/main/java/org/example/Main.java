package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int codigoPeca1 , numeroDePecas1, codigoPeca2, numeroDePecas2;

        double valorUnitarioPeca1 , valorUnitarioPeca2, totalApagar;

        codigoPeca1 = sc.nextInt();

        numeroDePecas1 = sc.nextInt();

        valorUnitarioPeca1 = sc.nextDouble();

        codigoPeca2 = sc.nextInt();

        numeroDePecas2 = sc.nextInt();

        valorUnitarioPeca2 = sc.nextDouble();

        totalApagar = (numeroDePecas1 * valorUnitarioPeca1) + (numeroDePecas2 * valorUnitarioPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalApagar);

       sc.close();
    }
}