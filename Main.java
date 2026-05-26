package minhaBST;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(13);
        arvore.inserir(7);
        arvore.inserir(15);
        arvore.inserir(5);
        arvore.inserir(9);
        arvore.inserir(3);
        arvore.inserir(19);

        System.out.println("Antes:");
        arvore.printPreOrdem();

        arvore.remover(7);

        System.out.println();
        System.out.println("Depois:");
        arvore.printPreOrdem();
    }
}
