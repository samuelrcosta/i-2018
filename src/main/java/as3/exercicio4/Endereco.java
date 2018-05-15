/*
 * Copyright (c) 2018.
 * Samuel Rocha Costa - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package main.java.as3.exercicio4;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import java.util.ArrayList;

/**
 * Esta classe Implementa a classe Endereço proposto pelo exercício 3
 * @author Samuel
 */
@JsonPropertyOrder({"bairro", "distrito", "codigo_municipio", "estado", "cep", "caixa_postal", "pais", "tipo", "linha_de_endereco", "data_inicio", "data_fim"})
public class Endereco {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("bairro")
    private String bairro;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("distrito")
    private String distrito;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("codigo_municipio")
    private String codigo_municipio;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("estado")
    private String estado;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("cep")
    private String cep;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("caixa_postal")
    private String caixa_postal;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("pais")
    private String pais;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("tipo")
    private String tipo;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("linha_de_endereco")
    private ArrayList<LinhaDeEndereco> linha_de_endereco = new ArrayList<LinhaDeEndereco>();
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("data_inicio")
    private Data data_inicio;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("data_fim")
    private Data data_fim;

    /**
     * Retorna o bairro
     * @return String
    */
    public String getBairro() {
        return bairro;
    }

    /**
     * Altera o bairro
     * @param bairro
    */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * Retorna o distrito
     * @return String
    */
    public String getDistrito() {
        return distrito;
    }

    /**
     * Altera o distrito
     * @param distrito
    */
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    /**
     * Retorna o codigo do município
     * @return String
    */
    public String getCodigo_municipio() {
        return codigo_municipio;
    }

    /**
     * Altera o código do município
     * @param codigo_municipio
    */
    public void setCodigo_municipio(String codigo_municipio) {
        this.codigo_municipio = codigo_municipio;
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

    /**
     * Retorna o cep
     * @return String
    */
    public String getCep() {
        return cep;
    }

    /**
     * Altera o cep
     * @param cep
    */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * Retorna a caixa postal
     * @return String
    */
    public String getCaixa_postal() {
        return caixa_postal;
    }

    /**
     * Altera a caixa postal
     * @param caixa_postal
    */
    public void setCaixa_postal(String caixa_postal) {
        this.caixa_postal = caixa_postal;
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
     * Retorna o tipo
     * @return String
    */
    public String getTipo() {
        return tipo;
    }

    /**
     * Altera o tipo
     * @param tipo
    */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Retorna a lista de Linhas de Endereços
     * @return ArrayList de LinhasDeEnderecos
    */
    public ArrayList<LinhaDeEndereco> getLinha_de_endereco() {
        return linha_de_endereco;
    }

    /**
     * Altera a lista de linhas de endereços
     * @param linha_de_endereco ArrayList de LinhaDeEndereco
    */
    public void setLinha_de_endereco(ArrayList<LinhaDeEndereco> linha_de_endereco) {
        this.linha_de_endereco = linha_de_endereco;
    }
    
    /**
     * Adiciona uma linha de endereço na lista
     * @param linha_de_endereco objeto LinhaDeEndereco
    */
    public void addLinha_de_endereco(LinhaDeEndereco linha_de_endereco){
        this.linha_de_endereco.add(linha_de_endereco);
    }

    /**
     * Retorna a data de início
     * @return Objeto Data
    */
    public Data getData_inicio() {
        return data_inicio;
    }

    /**
     * Altera a data de início
     * @param data_inicio objeto Data
    */
    public void setData_inicio(Data data_inicio) {
        this.data_inicio = data_inicio;
    }

    /**
     * Retorna a data fim
     * @return Objeto Data
    */
    public Data getData_fim() {
        return data_fim;
    }

    /**
     * Altera a data fim
     * @param data_fim objeto Data
    */
    public void setData_fim(Data data_fim) {
        this.data_fim = data_fim;
    } 
}
