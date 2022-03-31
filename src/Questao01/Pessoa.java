package Questao01;

import java.util.Date;

public class Pessoa {
    private String nome;
    private Date data;
    private int altura;

    public Pessoa(String nome, Date data, int altura) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public String obterDados(String str){
       return "Dados pessoais" + getNome() +
        getData() +
        getAltura();
    }
}
