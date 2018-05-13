/*
 * Copyright (c) 2018.
 * Samuel Rocha Costa - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package main.java.as3.exercicio2;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.stream.XMLStreamException;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeitorTest {
    @Test
    public void leitura() throws JsonProcessingException, IOException, FileNotFoundException, XMLStreamException {
        String path = "test/resources/teste.xml";
        Construtor construtor = new Construtor();
        StringToFile stf = new StringToFile();
        Leitor leitor = new Leitor(path);
        String teste = construtor.xmlParaTestes();
        stf.write(path, teste);
        ArrayList<Sapato> s = leitor.getSapatos();
        ArrayList<Tenis> t = leitor.getTenis();
        Sapato sapato = s.get(0);
        Sapato sapatoCheck = new Sapato("Marca de Sapato", 220.5f, 20, 50, 255);
        Tenis tenis = t.get(0);
        Tenis tenisCheck = new Tenis("Nike", 250, "Esportes");
        assertEquals(sapato.marca, sapatoCheck.marca);
        assertEquals(sapato.red, sapatoCheck.red);
        assertEquals(sapato.green, sapatoCheck.green);
        assertEquals(sapato.blue, sapatoCheck.blue);
        assertEquals(tenis.marca, tenisCheck.marca);
        assertEquals(tenis.pratica, tenisCheck.pratica);
    }
}