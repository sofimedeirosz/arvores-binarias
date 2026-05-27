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
        return atual.getConteudo();
    }

    public int getValorMax(No no) {
        No atual = no;
        while(atual.getDireita() != null) {
            atual = atual.getDireita();
        }
        return atual.getConteudo();
    }

    public void inserir(int conteudo) {
        raiz = inserirPriv(raiz, conteudo);
    }

    public No encontrar(int conteudo) {
        return encontrar(raiz, conteudo);
    }

    public No remover(int conteudo) {
        return removerPriv(raiz, conteudo);
    }

    // private methods
    private No inserirPriv(No no, int conteudo){
        if(no == null) {
            return new No(conteudo);
        }
        if(no.getConteudo() > conteudo) {
            no.setEsquerda(inserirPriv(no.getEsquerda(), conteudo));
        } else {
            no.setDireita(inserirPriv(no.getDireita(), conteudo));
        }
        return no;
    }

    private No encontrar(No no, int conteudo) {
        if(no == null) {
            return null; // o conteúdo não foi encontrada
        }
        if(no.getConteudo() == conteudo) {
            return no; // o conteúdo foi encontrada
        } else if (no.getConteudo() > conteudo) {
            return encontrar(no.getEsquerda(), conteudo);
        } else {
            return encontrar(no.getDireita(), conteudo);
        }
    }

    private No removerPriv(No no, int conteudo) {
        if(no == null) {
            System.out.println("não há oque remover!");
            return null; // o nó não pertence à árvore
        }
        if(conteudo < no.getConteudo()) {
            no.setEsquerda(removerPriv(no.getEsquerda(), conteudo));
        } else if(conteudo > no.getConteudo()) {
            no.setDireita(removerPriv(no.getDireita(), conteudo));
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
            int conteudoAux = getValorMin(no.getDireita());
            no.setConteudo(conteudoAux);
            no.setDireita(removerPriv(no.getDireita(), conteudoAux));
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
        System.out.print(no.getConteudo() + " ");
        printPreOrdem(no.getEsquerda());
        printPreOrdem(no.getDireita());
    }

    private void printEmOrdem(No no) {
        if(no == null) {
            return;
        }
        printEmOrdem(no.getEsquerda());
        System.out.print(no.getConteudo() + " ");
        printEmOrdem(no.getDireita());
    }

    private void printPosOrdem(No no) {
        if(no == null) {
            return;
        }
        printPosOrdem(no.getEsquerda());
        printPosOrdem(no.getDireita());
        System.out.print(no.getConteudo() + " ");
    }
}
