package Questao03;

public class Suco {
    double limao = 5.0;
    double tamarindo = 4.0;

    public String tipoDoSuco(String tipo){
        return tipo;
    }
    public int litrosDeSuco(int litros){
        return litros;
    }
    public double descontoSucoLimao(){
        double precoFinal = 0;
        int desconto1 = litrosDeSuco(2);
        int desconto2 = litrosDeSuco(5);
        if (desconto1 == 2){
            double precoComDescnto = limao * 0.03;
            precoFinal = limao - precoComDescnto;
        }else if (desconto2 == 5){
            double precoComDescnto = limao * 0.05;
            precoFinal = limao - precoComDescnto;
        }
        return  precoFinal;

    }
    public double descontoSucoTamarindo(int litros){
        double precoFinal = 0;
        int desconto = litros;
        if (desconto == 2){
            double precoComDescnto = limao * 0.04;
            precoFinal = limao - precoComDescnto;
        }else if (desconto == 5){
            double precoComDescnto = limao * 0.06;
            precoFinal = limao - precoComDescnto;
        }
        return  precoFinal;

    }
}
