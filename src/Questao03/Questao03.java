package Questao03;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Suco suco = new Suco();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Olá escolha o sabor do seu suco.\nLista de Sucos\n(L) - Limão\n(T) Tamarino");
        String sc;
        int litros = 0;
        sc = entrada.next();
        System.out.println("Quantos litros deseja comprar ?\n (2)\n (5)");
        litros = entrada.nextInt();
        int desconto = litros;
        switch (sc){

            case "L":
                double limao = 5.0;
                double precoFinal = 0;
                if (desconto == 2){
                    double precoComDescnto = limao * 0.03;
                    precoFinal = limao - precoComDescnto;
                }else if (desconto == 5){
                    double precoComDescnto = limao * 0.05;
                    precoFinal = limao - precoComDescnto;
                }
                System.out.println("O preço do suco é " + precoFinal);
                break;
            case "T":
                double tamarindo = 4.0;
                precoFinal = 0;
                if (desconto == 2){
                    double precoComDescnto = tamarindo * 0.03;
                    precoFinal = tamarindo - precoComDescnto;
                }else if (desconto == 5){
                    double precoComDescnto = tamarindo * 0.05;
                    precoFinal = tamarindo - precoComDescnto;
        }
                System.out.println("O preço do suco é " + precoFinal);
                break;

        }

    }

}
