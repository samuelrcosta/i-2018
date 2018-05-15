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
 * Esta classe Implementa o indivíduo proposto pelo exercício 3
 * @author Samuel
 */
@JsonPropertyOrder({"nomes", "endereco", "identificador", "vinculo", "comunicacao", "DadoDemografico"})
public class Individuo {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("nomes")
    private ArrayList<Nomes> nomes = new ArrayList<Nomes>();
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("endereco")
    private ArrayList<Endereco> endereco = new ArrayList<Endereco>();
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("identificador")
    private ArrayList<Identificador> identificador = new ArrayList<Identificador>();
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("vinculo")
    private ArrayList<Vinculo> vinculo = new ArrayList<Vinculo>();
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("comunicacao")
    private ArrayList<Comunicacao> comunicacao = new ArrayList<Comunicacao>();
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("DadoDemografico")
    private DadoDemografico dadodemografico = new DadoDemografico();

    /**
     * Retorna a lista de nomes
     * @return ArrayList
    */
    public ArrayList<Nomes> getNomes() {
        return nomes;
    }

    /**
     * Altera a lista de nomes
     * @param nomes ArrayList de nomes
    */
    public void setNomes(ArrayList<Nomes> nomes) {
        this.nomes = nomes;
    }
    
    /**
     * Adiciona um nomes na lista de nomes
     * @param nomes Objeto nomes
    */
    public void addNomes(Nomes nomes){
        this.nomes.add(nomes);
    }

    /**
     * Retorna a lista de enderecos
     * @return ArrayList
    */
    public ArrayList<Endereco> getEndereco() {
        return endereco;
    }

    /**
     * Altera a lista de enderecos
     * @param endereco ArrayList de enderecos
    */
    public void setEndereco(ArrayList<Endereco> endereco) {
        this.endereco = endereco;
    }
    
    /**
     * Adiciona um endereço na lista de endereços
     * @param end Objeto endereço
    */
    public void addEndereco(Endereco end){
        this.endereco.add(end);
    }

    /**
     * Retorna a lista de indetificadores
     * @return ArrayList
    */
    public ArrayList<Identificador> getIdentificador() {
        return identificador;
    }

    /**
     * Altera a lista de identificadores
     * @param identificador ArrayList de identificadores
    */
    public void setIdentificador(ArrayList<Identificador> identificador) {
        this.identificador = identificador;
    }
    
    /**
     * Adiciona um identificador na lista de identificadores
     * @param identificador 
    */
    public void addIdentificador(Identificador identificador){
        this.identificador.add(identificador);
    }

    /**
     * Retorna o dado demográfico
     * @return DadoDemografico
    */
    public DadoDemografico getDadodemografico() {
        return dadodemografico;
    }

    /**
     * Altera o Dado Demográfico
     * @param dadodemografico 
    */
    public void setDadodemografico(DadoDemografico dadodemografico) {
        this.dadodemografico = dadodemografico;
    }

    /**
     * Retorna a lista de vinculos
     * @return ArrayList
    */
    public ArrayList<Vinculo> getVinculo() {
        return vinculo;
    }

    /**
     * Altera a lista de vinculos
     * @param vinculo ArrayList de vinculos
    */
    public void setVinculo(ArrayList<Vinculo> vinculo) {
        this.vinculo = vinculo;
    }
    
    /**
     * Adiciona um vinculo na lista de vinculos
     * @param vinculo 
    */
    public void addVinculo(Vinculo vinculo){
        this.vinculo.add(vinculo);
    }

    /**
     * Retorna a lista de comunicações
     * @return ArrayList
    */
    public ArrayList<Comunicacao> getComunicacao() {
        return comunicacao;
    }

    /**
     * Altera a lista de comunicações
     * @param comunicacao ArrayList de comunicações
    */
    public void setComunicacao(ArrayList<Comunicacao> comunicacao) {
        this.comunicacao = comunicacao;
    }
    
    /**
     * Adiciona uma comunicação na lista de comunicações
     * @param comunicacao 
    */
    public void addComunicacao(Comunicacao comunicacao){
        this.comunicacao.add(comunicacao);
    }
}
