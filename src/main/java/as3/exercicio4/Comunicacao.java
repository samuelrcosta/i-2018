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
 * Esta classe Implementa a classe Comunicação proposto pelo exercício 3
 * @author Samuel
 */
@JsonPropertyOrder({"meio", "preferencia", "detalhe", "uso"})
public class Comunicacao {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("meio")
    private String meio;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("preferencia")
    private String preferencia;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("detalhe")
    private String detalhe;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("uso")
    private String uso;

    /**
     * Retorna o meio
     * @return String
    */
    public String getMeio() {
        return meio;
    }

    /**
     * Altera o meio
     * @param meio
    */
    public void setMeio(String meio) {
        this.meio = meio;
    }

    /**
     * Retorna a preferencia
     * @return String
    */
    public String getPreferencia() {
        return preferencia;
    }

    /**
     * Altera a preferencia
     * @param preferencia
    */
    public void setPreferencia(String preferencia) {
        this.preferencia = preferencia;
    }
    
    /**
     * Retorna o detalhe
     * @return String
    */
    public String getDetalhe() {
        return detalhe;
    }

    /**
     * Altera o detalhe
     * @param detalhe
    */
    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    /**
     * Retorna o uso
     * @return String
    */
    public String getUso() {
        return uso;
    }

    
    /**
     * Altera o uso
     * @param uso
    */
    public void setUso(String uso) {
        this.uso = uso;
    } 
}
