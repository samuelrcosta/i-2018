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
 * Esta classe Implementa a classe Data proposto pelo exercício 3
 * @author Samuel
 */
@JsonPropertyOrder({"data", "acuracia"})
public class Data {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("data")
    private String data;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("acuracia")
    private String acuracia;

    /**
     * Retorna a data
     * @return String
    */
    public String getData() {
        return data;
    }

    /**
     * Altera a data
     * @param data
    */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Retorna a acurácia
     * @return String
    */
    public String getAcuracia() {
        return acuracia;
    }

    /**
     * Altera a acurácia
     * @param acuracia
    */
    public void setAcuracia(String acuracia) {
        this.acuracia = acuracia;
    }
}
