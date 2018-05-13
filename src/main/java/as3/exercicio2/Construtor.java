/*
 * Copyright (c) 2018.
 * Samuel Rocha Costa - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package main.java.as3.exercicio2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 *
 * @author Samuel
 * Esta classe é responsável por gerar Strings de XML
 */
public class Construtor {
    /* Mapper do JacksonXML */
    private final ObjectMapper xmlMapper;
    
    /**
     *  Construtor da classe inilializa o JacksonXML.
     */
    public Construtor(){
        this.xmlMapper = new XmlMapper();
    }
    
    /**
     * Função que retorna uma string com o formato XML de um tenis, usando a serialização
     * de um objeto Tenis.
     * @param marca String da marca do Tenis
     * @param preco Float do preço do Tenis
     * @param pratica String da pratica do Tenis
     * @return String com no formato XML de um tênis
     * @throws com.fasterxml.jackson.core.JsonProcessingException
     */
    public String xmlTenis(String marca, float preco, String pratica) throws JsonProcessingException{
        Tenis tenis = new Tenis(marca, preco, pratica);
        return this.xmlMapper.writeValueAsString(tenis);
    }
    
    /**
     * Função que retorna uma string com o formato XML de um sapato, usando a serialização
     * de um objeto Sapato.
     * @param marca String da marca do Sapato
     * @param preco float do preço do Sapato
     * @param red int para a escala vermelha do Sapato
     * @param green int para a escala verde do Sapato
     * @param blue int para a escala azul do Sapto
     * @return String com no formato XML de um sapato
     * @throws com.fasterxml.jackson.core.JsonProcessingException
     */
    public String xmlSapato(String marca, float preco, int red, int green, int blue) throws JsonProcessingException{
        Sapato sapato = new Sapato(marca, preco, red, green, blue);
        return this.xmlMapper.writeValueAsString(sapato);
    }
    
    
    /**
     * Função que retorna uma string com o formato XML de calçados proposto pelo exercício 2.
     * Retorna dados de teste, com dois sapatos e dois tênis
     * @return String com no formato XML de um arquivo de calçados
     * @throws com.fasterxml.jackson.core.JsonProcessingException
     */
    public String xmlParaTestes() throws JsonProcessingException{
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><calcados>";
        Tenis tenis = new Tenis("Nike", 250, "Esportes");
        Sapato sapato = new Sapato("Marca de Sapato", 220.5f, 20, 50, 255);
        xml += xmlMapper.writeValueAsString(tenis);
        xml += xmlMapper.writeValueAsString(sapato);
        tenis = new Tenis("Puma", 200, "Corrida");
        sapato = new Sapato("Segundo Sapato", 150.5f, 120, 70, 55);
        xml += xmlMapper.writeValueAsString(tenis);
        xml += xmlMapper.writeValueAsString(sapato);
        xml += "</calcados>";
        return xml;
    }
}
