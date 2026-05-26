package minhaBST;

public class ArvoreBinaria {
    No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    // BST methods
    public int getValorMin(No no) {
        No atual = no;
        while(atual.getEsquerda() != null) {
            atual = atual.getEsquerda();
        }
        return atual.getChave();
    }

    public int getValorMax(No no) {
        No atual = no;
        while(atual.getDireita() != null) {
            atual = atual.getDireita();
        }
        return atual.getChave();
    }

    public void inserir(int chave) {
        raiz = inserir(raiz, chave);
    }

    public No encontrar(int chave) {
        return encontrar(raiz, chave);
    }

    public No remover(int chave) {
        return remover(raiz, chave);
    }

    // private methods
    private No inserir(No no, int chave){
        if(no == null) {
            return new No(chave);
        }
        if(no.getChave() > chave) {
            no.setEsquerda(inserir(no.getEsquerda(), chave));
        } else {
            no.setDireita(inserir(no.getDireita(), chave));
        }
        return no;
    }

    private No encontrar(No no, int chave) {
        if(no == null) {
            return null; // a chave não foi encontrada
        }
        if(no.getChave() == chave) {
            return no; // a chave foi encontrada
        } else if (no.getChave() > chave) {
            return encontrar(no.getEsquerda(), chave);
        } else {
            return encontrar(no.getDireita(), chave);
        }
    }

    private No remover(No no, int chave) {
        if(no == null) {
            return null; // o nó não pertence à árvore
        }
        if(no.getChave() > chave) {
            no.setEsquerda(remover(no.getEsquerda(), chave));
        } else if(no.getChave() < chave) {
            no.setDireita(remover(no.getDireita(), chave));
        } else { // encontramos o nó
            // caso 1: nó folha
            if(no.getEsquerda() == null && no.getDireita() == null) {
                return null;
            }
            // caso 2: no pai-filho
            if(no.getEsquerda() == null) {
                return no.getDireita();
            }else if(no.getDireita() == null) {
                return no.getEsquerda();
            }
            // caso 3: nó com dois filhos
            int chaveSubstituta = getValorMin(no.getDireita());
            no.setChave(chaveSubstituta);
            no.setDireita(remover(no.getDireita(),chaveSubstituta));
        }
        return no;
    }

    // traversal methods
    public void printPreOrdem() {printPreOrdem(raiz);}
    public void printEmOrdem() {printEmOrdem(raiz);}
    public void printPosOrdem() {printPosOrdem(raiz);}

    private void printPreOrdem(No no) {
        if(no == null) {
            return;
        }
        System.out.print(no.getChave() + " ");
        printPreOrdem(no.getEsquerda());
        printPreOrdem(no.getDireita());
    }

    private void printEmOrdem(No no) {
        if(no == null) {
            return;
        }
        printEmOrdem(no.getEsquerda());
        System.out.print(no.getChave() + " ");
        printEmOrdem(no.getDireita());
    }

    private void printPosOrdem(No no) {
        if(no == null) {
            return;
        }
        printPosOrdem(no.getEsquerda());
        printPosOrdem(no.getDireita());
        System.out.print(no.getChave() + " ");
    }
}
