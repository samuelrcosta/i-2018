/*
 * Copyright (c) 2018.
 * Samuel Rocha Costa - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package main.java.as3.exercicio2;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstrutorTest {
    
    private final Construtor construtor = new Construtor();

    @Test
    public void xmlTenis() throws JsonProcessingException {
        String xml = this.construtor.xmlTenis("Marca teste", 10.5f, "Esportes");
        String check = "<tenis><marca>Marca teste</marca><preco>10.5</preco><pratica>Esportes</pratica></tenis>";
        assertEquals(xml, check);
    }
    
    @Test
    public void xmlSapato() throws JsonProcessingException {
        String xml = this.construtor.xmlSapato("Marca teste", 10.5f, 50, 40, 30);
        String check = "<sapato>";
        check += "<marca>Marca teste</marca>";
        check += "<preco>10.5</preco>";
        check += "<red>50</red>";
        check += "<green>40</green>";
        check += "<blue>30</blue>";
        check += "</sapato>";
        assertEquals(xml, check);
    }
    
    @Test
    public void xmlParaTestes() throws JsonProcessingException {
        String xml = this.construtor.xmlParaTestes();
        String check = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><calcados>";
        check += "<tenis><marca>Nike</marca><preco>250.0</preco><pratica>Esportes</pratica></tenis>";
        check += "<sapato><marca>Marca de Sapato</marca><preco>220.5</preco><red>20</red><green>50</green><blue>255</blue></sapato>";
        check += "<tenis><marca>Puma</marca><preco>200.0</preco><pratica>Corrida</pratica></tenis>";
        check += "<sapato><marca>Segundo Sapato</marca><preco>150.5</preco><red>120</red><green>70</green><blue>55</blue></sapato>";
        check += "</calcados>";
        assertEquals(xml, check);
    }
}