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
 * Esta classe Implementa a classe CTPS proposto pelo exercício 3
 * @author Samuel
 */
@JsonPropertyOrder({"serie", "estado"})
public class CTPS {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("serie")
    private String serie;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("estado")
    private String estado;

    /**
     * Retorna a serie
     * @return String
    */
    public String getSerie() {
        return serie;
    }

    /**
     * Altera a serie
     * @param serie
    */
    public void setSerie(String serie) {
        this.serie = serie;
    }

    /**
     * Retorna o estado
     * @return String
    */
    public String getEstado() {
        return estado;
    }

    /**
     * Altera o estado
     * @param estado
    */
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
