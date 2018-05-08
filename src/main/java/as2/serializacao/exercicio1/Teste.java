package main.java.AS2.serializacao.exercicio1;

import java.io.Serializable;

/**
 * Esta classe Implementa a interface Serialize
 * Ela foi criada com intuito de realizar testes de Serialização. 
 * @author Samuel
 */
public class Teste implements Serializable {
    // Declaração de atributos
    private String nome;
    private String cidade;
    private int idade;
    private Auxiliar aux;
    
    /**
    * Contrustor da Classe
    * 
    * @param n String para a variável nome
    */
    public Teste(String n, Auxiliar x){
        this.nome = n;
        this.aux = x;
    }

    /**
    * Retorna a variável nome
    * 
    * @return String
    */
    public String getNome() {
        return nome;
    }

    /**
    * Altera o valor da variável nome
    * 
    * @param nome
    */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
    * Retorna a variável cidade
    * 
    * @return String
    */
    public String getCidade() {
        return cidade;
    }

    /**
    * Altera o valor da variável cidade
    * 
    * @param cidade
    */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
    * Retorna a variável idade
    * 
    * @return int
    */
    public int getIdade() {
        return idade;
    }

    /**
    * Altera o valor da variável idade
    * 
    * @param idade
    */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
