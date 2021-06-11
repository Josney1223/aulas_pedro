package Jogos;

public class Jogo{
    public String nome;
    public int valor, tempoDeJogo;

    public Jogo(String nome, int valor){
        this.nome = nome;
        this.valor = valor;
        this.tempoDeJogo = 0;
    }

    public void setTempoDeJogo(int horas){
        if(horas > 1){
            this.tempoDeJogo += horas;
        }        
    }
}