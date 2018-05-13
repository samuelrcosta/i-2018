/*
 * Copyright (c) 2018.
 * Samuel Rocha Costa - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package main.java.as3.exercicio3;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.xml.stream.XMLStreamException;

/**
 * Esta classe retorna uma instância de Turma com base na leitura de um arquivo XML serializado de turma
 * @author Samuel
 */
public class Aplicativo2 {
    /**
     * Usa a classe leitor para gerar a instância de turma de acordo com o arquivo XML
     * fornecido no primeiro parâmetro
     * @param args primeiro argumento é o nome do arquivo XML a ser persistido
     * @throws com.fasterxml.jackson.core.JsonProcessingException
     * @throws java.io.FileNotFoundException
     * @throws javax.xml.stream.XMLStreamException
     */
    public static Turma main(String[] args) throws JsonProcessingException, IOException, FileNotFoundException, XMLStreamException {
        Leitor leitor = new Leitor(args[0]);
        return leitor.getTurma();
    }
}
