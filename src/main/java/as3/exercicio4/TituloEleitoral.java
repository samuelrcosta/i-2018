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
 * Esta classe Implementa a classe Título Eleitoral proposto pelo exercício 3
 * @author Samuel
 */
@JsonPropertyOrder({"secao", "zona"})
public class TituloEleitoral {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("secao")
    private String secao;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("zona")
    private String zona;

    /**
     * Retorna a Seção
     * @return String
    */
    public String getSecao() {
        return secao;
    }

    /**
     * Altera a Seção
     * @param secao
    */
    public void setSecao(String secao) {
        this.secao = secao;
    }

    /**
     * Retorna a Zona
     * @return String
    */
    public String getZona() {
        return zona;
    }

    /**
     * Altera a zona
     * @param zona
    */
    public void setZona(String zona) {
        this.zona = zona;
    }
    
}
