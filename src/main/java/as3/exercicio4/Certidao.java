/*
 * Copyright (c) 2018.
 * Samuel Rocha Costa - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package main.java.as3.exercicio4;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

/**
 * Esta classe Implementa a classe Certidão proposto pelo exercício 3
 * @author Samuel
 */
@JsonPropertyOrder({"tipo", "cartorio", "livro", "folha", "termo"})
public class Certidao {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("tipo")
    private String tipo;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("cartorio")
    private String cartorio;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("livro")
    private String livro;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("folha")
    private String folha;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("termo")
    private String termo;

    /**
     * Retorna o tipo
     * @return String
    */
    public String getTipo() {
        return tipo;
    }

    /**
     * Altera o tipo
     * @param tipo
    */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Retorna o cartório
     * @return String
    */
    public String getCartorio() {
        return cartorio;
    }

    /**
     * Altera o cartorio
     * @param cartorio
    */
    public void setCartorio(String cartorio) {
        this.cartorio = cartorio;
    }

    /**
     * Retorna o livro
     * @return String
    */
    public String getLivro() {
        return livro;
    }

    /**
     * Altera o livro
     * @param livro
    */
    public void setLivro(String livro) {
        this.livro = livro;
    }

    /**
     * Retorna a folha
     * @return String
    */
    public String getFolha() {
        return folha;
    }

    /**
     * Altera a folha
     * @param folha
    */
    public void setFolha(String folha) {
        this.folha = folha;
    }

    /**
     * Retorna o termo
     * @return String
    */
    public String getTermo() {
        return termo;
    }

    /**
     * Altera o termo
     * @param termo
    */
    public void setTermo(String termo) {
        this.termo = termo;
    } 
}
