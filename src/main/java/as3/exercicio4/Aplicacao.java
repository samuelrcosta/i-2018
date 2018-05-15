/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.as3.exercicio4;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.xml.stream.XMLStreamException;

/**
 * Esta classe faz a manipulação da classe Indivíduo em arquivos XML
 * @author Samuel
 */
public class Aplicacao {
    
    public static void main(String[] args) throws IOException{
        //criaXMLteste("src/resources/teste4.xml");
        criaXMLteste(args[0]);
    }   
    
    /**
     * Este método cria uma instância de Individuo e persiste a mesma em um arquivo XML
     * @param path nome do arquivo XML a ser persistido
     * @throws com.fasterxml.jackson.core.JsonProcessingException 
    */
    public static void criaXMLteste(String path) throws JsonProcessingException, IOException{
        StringToFile stf = new StringToFile();
        Construtor construtor = new Construtor();
        Individuo individuo = construtor.criaIndividuoTeste();
        String xmlIndividuo = construtor.criaStringXML(individuo);
        stf.write(path, xmlIndividuo);
    }
}
