/*
 * Copyright (c) 2018.
 * Samuel Rocha Costa - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package main.java.as3.exercicio3;

import main.java.as3.exercicio2.*;
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
 * Esta classe é responsável por ler um arquivos XML no formato do objeto turma
 * proposto pelo exercício 3
 */
public class Leitor {
    private Turma turma = new Turma();
    private String path;
    
    public Leitor(String path) throws FileNotFoundException, XMLStreamException{
        this.path = path;
        fazLeitura();
    }
    
    public void fazLeitura() throws FileNotFoundException, XMLStreamException{
       XMLInputFactory f = XMLInputFactory.newFactory();
       String inputFile = this.path;
       XMLStreamReader sr = f.createXMLStreamReader(new FileInputStream(inputFile));
       XmlMapper mapper = new XmlMapper();
       sr.next(); // to point to <turma>
       //sr.next();
       while(sr.hasName()){
           sr.next();
            if("estudante".equals(sr.getLocalName())){
                Estudante e = new Estudante();
                Endereco end = new Endereco();
                sr.next();
                String nome = sr.getElementText();
                e.setNome(nome);
                
                sr.next();
                sr.next();
                String log = sr.getElementText();
                end.setLogradouro(log);
                
                sr.next();
                String numero = sr.getElementText();
                end.setNumero(numero);
                
                sr.next();
                String comp = sr.getElementText();
                end.setComplemento(comp);
                
                sr.next();
                String cep = sr.getElementText();
                end.setCEP(cep);
                
                e.setEndereco(end);
                this.turma.addEstudante(e);
                
                sr.next();
                sr.next();
            }else{
                break;
            }
       }
       sr.close();
    }
    
    public Turma getTurma(){
        return this.turma;
    }
}
