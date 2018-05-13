/*
 * Copyright (c) 2018.
 * Samuel Rocha Costa - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package main.java.as3.exercicio2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Samuel
 * Esta classe implementa a classe Tênis para resolver o problema do XML do exercício 2
 */
@JacksonXmlRootElement(localName = "sapato")
@XmlAccessorType(XmlAccessType.FIELD)
public class Sapato {
    @XmlElement
    public String marca;
    
    @XmlElement
    public float preco;
    
    @XmlElement
    public int red;
    
    @XmlElement
    public int green;
    
    @XmlElement
    public int blue;
    
    public Sapato(String marca, float preco, int red, int green, int blue){
        this.marca = marca;
        this.preco = preco;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
}
