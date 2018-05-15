/*
 * Copyright (c) 2018.
 * Samuel Rocha Costa - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package main.java.as3.exercicio4;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Esta classe lê um arquivo XML e retorna uma instância de Indivíduo
 * @author Samuel
 */
public class Leitor {
    
    /**
     * Este método utiliza o Object mapper para deserializar um arquivo XML em uma instância da
     * classe Individuo
     * @param path String para o caminho do arquivo XML
     * @return instância de Individuo
     * @throws IOException 
    */
    public Individuo realizaLeituraXML(String path) throws IOException{
        ObjectMapper xmlMapper = new XmlMapper();
        String xml = lerArquivo(path);
        Individuo individuo = xmlMapper.readValue(xml, Individuo.class);
        return individuo;
    }
    
    /**
     * Método recebe o nome de um arquivo e retona uma String com o seu conteúdo em UTF-8.
     * @param arq entrada de uma String com o nome do arquivo.
     * @return String com os dados do arquivo.
     * @throws java.io.IOException
     * @throws IllegalArgumentException caso o nome do arquivo esteja em branco.
     */
    public static String lerArquivo(String arq) throws IOException{
        if (arq.equals(null) || arq.equals("") || arq.equals(" ")) {
            throw new IllegalArgumentException("Nome do arquivo inválido");
        }
        
        Path arquivo = Paths.get(arq);
        Charset utf8 = Charset.forName("UTF-8");
        BufferedReader br = Files.newBufferedReader(arquivo, utf8);

        String linha;
        StringBuilder texto = new StringBuilder();
        while ((linha = br.readLine()) != null) {
            texto.append(linha).append('\n');
        }
        return texto.toString();
    }
}
