package No;

public class No{
    public boolean alive;
    public No prox, back;
    public int name;

    public No(No head, int name){
        this.alive = true;
        this.prox = head;
        this.back = null;    
        this.name = name;
    }

    private void setBack(No n){
        this.back = n;
    }

    public No getProx(){
        return this.prox;
    }

    public void setProx(No prox, No head){
        /* 
            Esse metodo valida se o proximo objeto é a cabeca da lista,
            caso seja ele coloca o No desejado no local e faz as ligacoes
        */
        if(this.prox == head || this.prox == null){
            this.prox = prox; // Coloca o No novo como prox (1)
            this.prox.setBack(this); // Fala para o No novo que esse objeto é o back dele (2)
            this.prox.prox.setBack(prox); // Fala para o proximo No do novo No, que quem está atras dele é o novo No (3)
        } else {
            this.prox.setProx(prox, head); // Anda para o proximo ná, ja que esse não é o ultimo
        }  
    }

    public void deleteNo(){        
        /*
            Deleta virtualmente o No, cortando as ligacoes dos nós ajdacentes com ele
        */
        this.back.setProx(this.prox, this.back.prox); // Substitui a ligacao do no back com o prox (1)
        this.prox.setBack(this.back); // Substitui a ligacao do no prox com o back (2)
    }

    public void printThis(String name, No head){        
        if(this.name == name){
            this.deleteNo();
        }

        System.out.println(this.name+","+this.alive);
        if(this.prox != head){
            this.prox.printThis(name, head);
        }
    }
    
}