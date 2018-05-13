/*
 * Copyright (c) 2018.
 * Samuel Rocha Costa - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package main.java.as3.exercicio3;

import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
/**
 * Esta função implementa a Turma proposta no exercício 3
 * @author Samuel
 */
@JacksonXmlRootElement(localName = "turma")
@XmlAccessorType(XmlAccessType.FIELD)
public class Turma {
     @XmlElement
     private ArrayList<Estudante> estudantes = new ArrayList<Estudante>();
     
     /**
     * Adiciona um estudante a lista.
     * @param   lista de estudantes
     */
     public void addEstudante(Estudante e){
         this.estudantes.add(e);
     }
     
     /**
     * Retorna a lista de estudantes.
     * @return arraylist de estudantes
     */
     public ArrayList getEstudantes(){
         return estudantes;
     }
     
     /**
     * Remove um estudante da lista por meio do seu index.
     */
     public void removerEstudante(int index){
         this.estudantes.remove(index);
     }
}
