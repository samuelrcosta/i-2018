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
@JacksonXmlRootElement(localName = "estudante")
@XmlAccessorType(XmlAccessType.FIELD)
public class Estudante {
    @XmlElement
    private String nome;
   
    @XmlElement
    private Endereco endereco = new Endereco();
    

    /**
     * Busca o nome.
     * @return String com o nome
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Altera o nome.
     * @param nome string para o nome desejado
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * Busca o endereco.
     * @return Endereco do estudante
     */
    public Endereco getEndereco(){
        return this.endereco;
    }
    
    /**
     * Altera o endereco.
     * @param e Endereco desejado
     */
    public void setEndereco(Endereco e){
        this.endereco = e;
    }
}
