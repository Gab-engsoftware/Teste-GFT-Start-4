package Questão02;

import java.util.Locale;
import java.util.Scanner;

public class Questão02 {
    public static void main(String[] args) {
        String saldacao;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Usuario, informe seu turno de trabalho:\n(M) - Matutino\n(V)- Vespertino\n(N) - Noturno");
        saldacao = entrada.next();
        switch (saldacao){
            case "M":
                System.out.println("Bom dia!");
                break;
            case "V":
                System.out.println("Boa tarde!");
                break;
            case "N":
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Valor inválido!");
        }

    }
}
