/*
 * Copyright (c) 2018.
 * Samuel Rocha Costa - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package main.java.as3.exercicio3;

import main.java.as3.exercicio2.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.util.ArrayList;

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
     * Função que retorna uma string com o formato XML de uma Turma, usando a serialização
     * de um objeto Turma.
     * @param turma instância de uma turma a ser serializada
     * @return String com no formato XML de um tênis
     * @throws com.fasterxml.jackson.core.JsonProcessingException
     */
    public String xmlTurma(Turma turma) throws JsonProcessingException{
        ArrayList<Estudante> estudantes = turma.getEstudantes();
        String retorno = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><turma>";
        for(int i = 0; i < estudantes.size(); i++){
            retorno += this.xmlMapper.writeValueAsString(estudantes.get(i));
        }
        retorno += "</turma>";
        return retorno;
    }
    
    /**
     * Função que cria uma string XML com dados de teste de uma turma
     * @param turma instância de uma turma a ser serializada
     * @return String com no formato XML de um tênis
     * @throws com.fasterxml.jackson.core.JsonProcessingException
     */
    public String xmlParaTestes(Turma turma) throws JsonProcessingException{
        Construtor construtor = new Construtor();
        String xml = construtor.xmlTurma(turma);
        return xml;
    }
    
    /**
     * Função que cria uma instância de turma com dados teste (4 estudantes)
     * @return Turma com dados teste
     */
    public Turma geraTurma(){
        Turma turmaTeste = new Turma();
        Endereco end = new Endereco();
        end.setCEP("75400000");
        end.setComplemento("Apto 1");
        end.setLogradouro("Avenida Brasil");
        end.setNumero("S/N");
        Endereco end2 = new Endereco();
        end2.setCEP("12345678");
        end2.setComplemento("Caso 5");
        end2.setLogradouro("Avenida Perimetral Norte");
        end2.setNumero("150");
        Estudante estudanteTeste = new Estudante();
        estudanteTeste.setNome("Samuel");
        estudanteTeste.setEndereco(end);
        turmaTeste.addEstudante(estudanteTeste);
        estudanteTeste = new Estudante();
        estudanteTeste.setNome("José");
        estudanteTeste.setEndereco(end2);
        turmaTeste.addEstudante(estudanteTeste);
        estudanteTeste = new Estudante();
        estudanteTeste.setNome("Reinaldo");
        estudanteTeste.setEndereco(end2);
        turmaTeste.addEstudante(estudanteTeste);
        estudanteTeste = new Estudante();
        estudanteTeste.setNome("Matias");
        estudanteTeste.setEndereco(end);
        turmaTeste.addEstudante(estudanteTeste);
        return turmaTeste;
    }
}
