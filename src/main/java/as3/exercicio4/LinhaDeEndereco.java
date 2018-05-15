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
 * Esta classe Implementa a classe Linha de Endereço proposto pelo exercício 3
 * @author Samuel
 */
@JsonPropertyOrder({"ordem", "linha"})
public class LinhaDeEndereco {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("ordem")
    private String ordem;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("linha")
    private String linha;

    /**
     * Retorna a ordem
     * @return String
    */
    public String getOrdem() {
        return ordem;
    }

    /**
     * Altera a ordem
     * @param ordem
    */
    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }

    /**
     * Retorna a linha
     * @return String
    */
    public String getLinha() {
        return linha;
    }

    /**
     * Altera a linha
     * @param linha
    */
    public void setLinha(String linha) {
        this.linha = linha;
    }
    
}
