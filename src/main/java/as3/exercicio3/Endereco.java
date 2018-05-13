/*
 * Copyright (c) 2018.
 * Samuel Rocha Costa - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package main.java.as3.exercicio3;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Samuel
 * Esta classe implementa a classe endereço proposta pelo exercício 3
 */
@JacksonXmlRootElement(localName = "endereco")
@XmlAccessorType(XmlAccessType.FIELD)
public class Endereco {
    @XmlElement
    private String CEP;
   
    @XmlElement
    private String logradouro;
    
    @XmlElement
    private String numero;
            
    @XmlElement
    private String complemento;

    /**
     * Busca o cep.
     * @return String com o CEP
     */
    public String getCEP() {
        return CEP;
    }

    /**
     * Altera o cep.
     * @param CEP string para o cep desejado
     */
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    /**
     * Busca o logradouro.
     * @return String com o logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * Altera o logradouro.
     * @param logradouro string para o logradouro desejado
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * Busca o numero.
     * @return String com o numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Altera o número.
     * @param numero string para o número desejado
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Busca o complemento.
     * @return String com o complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * Altera o complemento.
     * @param complemento string para o complemento desejado
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
