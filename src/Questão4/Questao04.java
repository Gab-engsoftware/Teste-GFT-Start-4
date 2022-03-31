package Questão4;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        int idade;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Usuario, informe sua idade: ");
        idade = entrada.nextInt();

        if(idade < 67 && idade > 18){
            System.out.println("Parabéns! você pode doar Sangue.");
        }else{
            System.out.println("Inflelizmente com a idade de " + idade + " anos não é permitido doar sangue.");
        }
    }
}
