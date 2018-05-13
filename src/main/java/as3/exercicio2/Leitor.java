/*
 * Copyright (c) 2018.
 * Samuel Rocha Costa - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package main.java.as3.exercicio2;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

/**
 *
 * @author Samuel
 * Esta classe é responsável por ler um arquivos XML no formato do objeto calçado
 * proposto pelo exercício 2
 */
public final class Leitor {
    private final ArrayList<Tenis> tenis = new ArrayList<>();
    private final ArrayList<Sapato> sapatos = new ArrayList<>();
    private final String path;
    
    /**
     * Função que recebe um path para fazer a leitura de um arquivo XML de calçados no formato estabelecido
     * noe exercício 2
     * @param path String para o path do arquivo XML
     * @throws java.io.FileNotFoundException
     * @throws javax.xml.stream.XMLStreamException
     */
    public Leitor(String path) throws FileNotFoundException, XMLStreamException{
        this.path = path;
        fazLeitura();
    }
    
    /**
     * Função que faz a leitura do arquivo XML fornecido na variável path, ela irá alimentar o ArrayList
     * de tenis e sapatos de acordo com os dados encontrados no XML
     * @throws java.io.FileNotFoundException
     * @throws javax.xml.stream.XMLStreamException
     */
    public void fazLeitura() throws FileNotFoundException, XMLStreamException{
       XMLInputFactory f = XMLInputFactory.newFactory();
       String inputFile = this.path;
       XMLStreamReader sr = f.createXMLStreamReader(new FileInputStream(inputFile));
       XmlMapper mapper = new XmlMapper();
       sr.next(); // to point to <calcados>
       while(sr.hasName()){
           sr.next();
            if("tenis".equals(sr.getLocalName())){
                sr.next();
                String marca = sr.getElementText();
                sr.next();
                float preco = parseFloat(sr.getElementText());
                sr.next();
                String pratica = sr.getElementText();
                Tenis t = new Tenis(marca, preco, pratica);
                this.tenis.add(t);
            }else if("sapato".equals(sr.getLocalName())){
                sr.next();
                String marca = sr.getElementText();
                sr.next();
                float preco = parseFloat(sr.getElementText());
                sr.next();
                int red = parseInt(sr.getElementText());
                sr.next();
                int green = parseInt(sr.getElementText());
                sr.next();
                int blue = parseInt(sr.getElementText());
                Sapato s = new Sapato(marca, preco, red, green, blue);
                this.sapatos.add(s);
            }
            sr.next();
       }
       sr.close();
    }
    
    /**
     * Função que retorna a lista de sapatos do arquivo XML
     * @return ArrayList de sapatos
     */
    public ArrayList getSapatos(){
        return this.sapatos;
    }
    
    /**
     * Função que retorna a lista de tenis do arquivo XML
     * @return ArrayList de tenis
     */
    public ArrayList getTenis(){
        return this.tenis;
    }
}
