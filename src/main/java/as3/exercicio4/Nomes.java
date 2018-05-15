/*
 * Copyright (c) 2018.
 * Samuel Rocha Costa - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package main.java.as3.exercicio4;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import java.util.ArrayList;

/**
 * Esta classe Implementa a classe Nomes proposto pelo exercício 3
 * @author Samuel
 */
@JsonPropertyOrder({"titulos", "nomes", "sobrenomes", "sufixos", "preferido", "usoCondicional", "utilizacao", "representacao"})
public class Nomes {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("titulos")
    private String titulos;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("nomes")
    private String nomes;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("sobrenomes")
    private String sobrenomes;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("sufixos")
    private String sufixos;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("preferido")
    private String preferido;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("usoCondicional")
    private String usoCondicional;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("utilizacao")
    private ArrayList<Utilizacao> utilizacao = new ArrayList<Utilizacao>();
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("representacao")
    private ArrayList<Representacao> representacao = new ArrayList<Representacao>();
    
    /**
     * Retorna os títulos
     * @return String de titulos
    */
    public String getTitulos() {
        return titulos;
    }

    /**
     * Altera os titulos
     * @param titulos
    */
    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    /**
     * Retorna os nomes
     * @return String de nomes
    */
    public String getNomes() {
        return nomes;
    }

    /**
     * Altera os nomes
     * @param nomes
    */
    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    /**
     * Retorna os sobrenomes
     * @return String de sobrenomes
    */
    public String getSobrenomes() {
        return sobrenomes;
    }

    /**
     * Altera os sobrenomes
     * @param sobrenomes
    */
    public void setSobrenomes(String sobrenomes) {
        this.sobrenomes = sobrenomes;
    }

    /**
     * Retorna os sufixos
     * @return String de sufixos
    */
    public String getSufixos() {
        return sufixos;
    }

    /**
     * Altera os sufixos
     * @param sufixos
    */
    public void setSufixos(String sufixos) {
        this.sufixos = sufixos;
    }

    /**
     * Retorna os preferidos
     * @return String de preferidos
    */
    public String getPreferido() {
        return preferido;
    }

    /**
     * Altera o preferido
     * @param preferido
    */
    public void setPreferido(String preferido) {
        this.preferido = preferido;
    }

    /**
     * Retorna os uso condicional
     * @return String de uso condicional
    */
    public String getUsoCondicional() {
        return usoCondicional;
    }

    /**
     * Altera o usoCondicional
     * @param usoCondicional
    */
    public void setUsoCondicional(String usoCondicional) {
        this.usoCondicional = usoCondicional;
    }

    /**
     * Retorna a lista de Utilização
     * @return ArrayList de Utilização
    */
    public ArrayList<Utilizacao> getUtilizacao() {
        return utilizacao;
    }

    /**
     * Altera a lista de Utilizacao
     * @param utilizacao ArrayList de Utilização
    */
    public void setUtilizacao(ArrayList<Utilizacao> utilizacao) {
        this.utilizacao = utilizacao;
    }
    
    /**
     * Adiciona um objeto na lista de Utilização
     * @param utilizacao Objeto de Utilização
    */
    public void addUtilizacao(Utilizacao utilizacao){
        this.utilizacao.add(utilizacao);
    }

    /**
     * Retorna a lista de Representação
     * @return ArrayList de Representação
    */
    public ArrayList<Representacao> getRepresentacao() {
        return representacao;
    }

    /**
     * Altera a lista de Representação
     * @param representacao ArrayList de Representação
    */
    public void setRepresentacao(ArrayList<Representacao> representacao) {
        this.representacao = representacao;
    }
    
    /**
     * Adiciona um objeto na lista de Representação
     * @param representacao Objeto de Representação
    */
    public void addRepresentacao(Representacao representacao){
        this.representacao.add(representacao);
    }
}
