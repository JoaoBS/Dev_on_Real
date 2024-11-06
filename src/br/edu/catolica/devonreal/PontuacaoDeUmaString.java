package br.edu.catolica.devonreal;

import java.util.Scanner;

public class PontuacaoDeUmaString {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Digite um texto: ");
        String s = read.nextLine();

        if(s.length() >= 2 && s.length() <= 100) {

            char[] charArray = s.toLowerCase().toCharArray();
            int pontuacao = 0;
            int asciiValue1, asciiValue2, result;
            int i, j;

            for(i=0, j=1; i < s.length()-1; i++, j++) {
                asciiValue1 = charArray[i];
                asciiValue2 = charArray[j];

                result = Math.abs(asciiValue1 - asciiValue2);
                pontuacao += result;
            }

            System.out.println("\nPontuação da String: " + pontuacao);
        } else {
            System.out.println("\nString muito pequena ou muito grande");
        }
    }
}
