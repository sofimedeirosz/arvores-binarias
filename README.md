#  Árvore Binária de Busca (BST) em Java

##  Sobre o Projeto

Este projeto foi desenvolvido com o objetivo de estudo e prática da estrutura de dados **Árvore Binária de Busca (Binary Search Tree - BST)** em Java, com foco principal na **remoção de nós** e nos diferentes casos que podem ocorrer durante esse processo.

O sistema implementa operações fundamentais de uma BST, como:

- Inserção de nós
- Busca de elementos
- Remoção de nós
- Percursos da árvore
- Busca do maior e menor valor

---

##  Desenvolvedores

Projeto desenvolvido por:

- **Sofia Medeiros da Fonseca**
- **Maria Eduarda Silveira**
- **Gabriel Moreno**

---

##  Objetivo do Estudo

O foco principal deste código é compreender como funciona a remoção de elementos em uma árvore binária de busca, analisando os três principais cenários:

1. **Remoção de nó folha**
2. **Remoção de nó com apenas um filho**
3. **Remoção de nó com dois filhos**

Além disso, o projeto auxilia no entendimento de conceitos como:

- Recursividade
- Estruturas encadeadas
- Organização hierárquica de dados
- Percursos em árvores

---

#  Estrutura do Projeto

## Classe `No`

Representa cada nó da árvore.

### Atributos

- `conteudo` → valor armazenado no nó
- `esquerda` → referência para o filho da esquerda
- `direita` → referência para o filho da direita

### Métodos

- Getters e Setters
- Construtor do nó

---

## Classe `ArvoreBinaria`

Responsável por toda a lógica da BST.

###  Inserção

```java
public void inserir(int conteudo)
```

Insere um novo valor na árvore respeitando as regras da BST:

- Valores menores vão para a esquerda
- Valores maiores vão para a direita

---

###  Busca

```java
public No encontrar(int conteudo)
```

Busca um elemento na árvore e retorna o nó correspondente.

---

###  Remoção

```java
public No remover(int conteudo)
```

Remove um nó da árvore tratando os três casos possíveis:

####  Caso 1 — Nó folha

O nó simplesmente é removido.

####  Caso 2 — Nó com um filho

O filho substitui o nó removido.

####  Caso 3 — Nó com dois filhos

O nó recebe o menor valor da subárvore direita e depois o valor duplicado é removido.

---

###  Menor valor da árvore

```java
public int getValorMin(No no)
```

Retorna o menor valor de uma subárvore.

---

###  Maior valor da árvore

```java
public int getValorMax(No no)
```

Retorna o maior valor de uma subárvore.

---

#  Percursos da Árvore

O projeto implementa os três principais tipos de percurso.

## Pré-Ordem

```java
printPreOrdem()
```

Ordem:

1. Raiz
2. Esquerda
3. Direita

---

## Em Ordem

```java
printEmOrdem()
```

Ordem:

1. Esquerda
2. Raiz
3. Direita

> Em uma BST, este percurso imprime os valores em ordem crescente.

---

## Pós-Ordem

```java
printPosOrdem()
```

Ordem:

1. Esquerda
2. Direita
3. Raiz

---

#  Exemplo de Uso

```java
ArvoreBinaria arvore = new ArvoreBinaria();

arvore.inserir(50);
arvore.inserir(30);
arvore.inserir(70);
arvore.inserir(20);
arvore.inserir(40);

System.out.println("Em ordem:");
arvore.printEmOrdem();

arvore.remover(30);

System.out.println("\nApós remover 30:");
arvore.printEmOrdem();
```

---

#  Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos (POO)

---

#  Conceitos Trabalhados

- Árvores Binárias de Busca (BST)
- Recursividade
- Estruturas de Dados
- Manipulação de Nós
- Algoritmos de Busca
- Algoritmos de Remoção
- Percursos em Árvores

---

#  Finalidade Acadêmica

Este projeto possui finalidade exclusivamente educacional, sendo utilizado para estudos e prática da disciplina de Estrutura de Dados.
