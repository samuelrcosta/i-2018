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
 * Esta classe Implementa a classe Representação proposto pelo exercício 3
 * @author Samuel
 */
@JsonPropertyOrder({"utilizacao", "alternativa"})
public class Representacao {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("utilizacao")
    private String utilizacao;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("alternativa")
    private String alternativa;

    /**
     * Retorna a Utilização
     * @return String
    */
    public String getUtilizacao() {
        return utilizacao;
    }

    /**
     * Altera a utilizacao
     * @param utilizacao
    */
    public void setUtilizacao(String utilizacao) {
        this.utilizacao = utilizacao;
    }

    /**
     * Retorna a alternativa
     * @return String
    */
    public String getAlternativa() {
        return alternativa;
    }

    /**
     * Altera a alternativa
     * @param alternativa
    */
    public void setAlternativa(String alternativa) {
        this.alternativa = alternativa;
    }
    
}
