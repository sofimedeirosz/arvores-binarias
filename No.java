package minhaBST;

public class No {
    int conteudo;
    No esquerda, direita;
    //construtor
    public No(int conteudo) {
        this.conteudo = conteudo;
        this.esquerda = this.direita = null;
    }
    // getters e setters
    public int getConteudo() {
        return conteudo;
    }
    public void setConteudo(int conteudo) {
        this.conteudo = conteudo;
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
