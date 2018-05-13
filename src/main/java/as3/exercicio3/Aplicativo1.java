/*
 * Copyright (c) 2018.
 * Samuel Rocha Costa - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package main.java.as3.exercicio3;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.stream.XMLStreamException;

/**
 * Esta classe persiste em um arquivo XML uma instância teste da classe Turma
 * @author Samuel
 */
public class Aplicativo1 {
    
    /**
     * Grava um arquivo xml com o nome do primeiro parâmetro recebido.
     * Gera uma instância de turma para testes, faz uma String com o modelo do XML e grava no arquivo.
     * @param args primeiro argumento é o nome do arquivo XML a ser persistido
     * @throws com.fasterxml.jackson.core.JsonProcessingException
     * @throws java.io.FileNotFoundException
     * @throws javax.xml.stream.XMLStreamException
     */
    public static void main(String[] args) throws JsonProcessingException, IOException, FileNotFoundException, XMLStreamException {
        Construtor construtor = new Construtor();
        StringToFile stf = new StringToFile();
        Turma t = construtor.geraTurma();
        String xml = construtor.xmlParaTestes(t);
        stf.write(args[0], xml);
    }
}
