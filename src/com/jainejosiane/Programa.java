package com.jainejosiane;

/*
Crie um programa que leia um valor inteiro (este número tem que conter
4 dígitos) A saída é mostrar a quantidade de dígitos “pares”
Exemplo.: Digamos que a entrada foi 3257. A resposta será 1 (vale 2
pontos)
Regras:
a) A entrada deve estar entre 1000 e 9999
b) Se o usuário digitar 3 dígitos ou menos, o Programa avisa que tem que
conter 4 dígitos e continuar a programação até a resposta final.
 */
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número com 4 dígitos: ");
        int numero = sc.nextInt();

        String numeroS = String.valueOf(numero);

        int digitos = numeroS.length();
        while (digitos != 4) {
            System.out.println("Número inválido! Digite um número com 4 dígitos: ");
            numeroS = sc.next();
            digitos = numeroS.length();
        }

        int par = 0;

        for (int i = 0; i < digitos; i++) {
            System.out.println(numeroS.charAt(i));
            int numeroAtual = numeroS.charAt(i);
            if (numeroAtual % 2 == 0) {
                par++;
            }
        }
        System.out.println("Números pares: " + par);
    }
}