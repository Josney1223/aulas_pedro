import java.util.ArrayList;
import java.util.List;

import Jogos.Jogo;

public class Programa{
    List<Jogo> lista;

    public static void main(String args[]){
        //ArrayList<Jogo> lista = new ArrayList<Jogo>();
        Jogo cod = new Jogo("Call of Duty", 300);
        Jogo skyrim = new Jogo("The elder scrolls V: Skyrim", 120);
        //lista.add(jogo1);
        System.out.print(skyrim.nome +","+ skyrim.valor +","+ skyrim.tempoDeJogo);
        skyrim.setTempoDeJogo(10);
    }
    
    public static void printList(List<Jogo> l){
        for(int i =0; i< l.size(); i++){
            System.out.print(l.get(i).nome);
        }
    }

}