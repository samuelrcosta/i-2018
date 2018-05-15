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
 * Esta classe Implementa a classe Vínculo proposto pelo exercício 3
 * @author Samuel
 */
@JsonPropertyOrder({"relacionamento", "data_inicial", "data_final"})
public class Vinculo {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("relacionamento")
    private String relacionamento;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("data_inicial")
    private String data_inicial;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("data_final")
    private String data_final;

    /**
     * Retorna o relacionamento
     * @return String
    */
    public String getRelacionamento() {
        return relacionamento;
    }

    /**
     * Altera o relacionamento
     * @param relacionamento
    */
    public void setRelacionamento(String relacionamento) {
        this.relacionamento = relacionamento;
    }

    /**
     * Retorna a data inicial
     * @return String
    */
    public String getData_inicial() {
        return data_inicial;
    }

    /**
     * Altera a data inicial
     * @param data_inicial
    */
    public void setData_inicial(String data_inicial) {
        this.data_inicial = data_inicial;
    }

    /**
     * Retorna a data final
     * @return String
    */
    public String getData_final() {
        return data_final;
    }

    /**
     * Altera a data final
     * @param data_final
    */
    public void setData_final(String data_final) {
        this.data_final = data_final;
    }
}
