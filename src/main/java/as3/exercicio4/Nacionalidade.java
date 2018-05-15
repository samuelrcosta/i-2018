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
 * Esta classe Implementa a classe Nacionalidade proposto pelo exercício 3
 * @author Samuel
 */
@JsonPropertyOrder({"municipio", "estado", "pais", "data_entrada"})
public class Nacionalidade {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("municipio")
    private String municipio;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("estado")
    private String estado;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("pais")
    private String pais;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("data_entrada")
    private String data_entrada;

    /**
     * Retorna o município
     * @return String
    */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * Altera o município
     * @param municipio
    */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    /**
     * Retorna o estado
     * @return String
    */
    public String getEstado() {
        return estado;
    }

    /**
     * Altera a estado
     * @param estado
    */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Retorna o país
     * @return String
    */
    public String getPais() {
        return pais;
    }

    /**
     * Altera o país
     * @param pais
    */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Retorna a data de entrada no país
     * @return String
    */
    public String getData_entrada() {
        return data_entrada;
    }

    /**
     * Altera a data de entrada no país
     * @param data_entrada
    */
    public void setData_entrada(String data_entrada) {
        this.data_entrada = data_entrada;
    }
    
}
