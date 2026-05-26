package minhaBST;

public class No {
    int chave;
    No esquerda, direita;
    //construtor
    public No(int chave) {
        this.chave = chave;
        this.esquerda = this.direita = null;
    }
    // getters e setters
    public int getChave() {
        return chave;
    }
    public void setChave(int chave) {
        this.chave = chave;
    }

    public No getEsquerda() {
        return esquerda;
    }
    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return direita;
    }
    public void setDireita(No direita) {
        this.direita = direita;
    }
}
