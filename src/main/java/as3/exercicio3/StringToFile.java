/*
 * Copyright (c) 2018.
 * Samuel Rocha Costa - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package main.java.as3.exercicio3;

import main.java.as3.exercicio2.*;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 * @author Samuel
 * Esta classe grava strings em arquivo
 */
public class StringToFile {
    
    /**
     * Esta função recebe um arquivo e uma string de dados e grava no disco o arquivo espeficicado
     * com os dados especificados.
     * @param path String para o arquivo
     * @param string String para o conteúdo a ser gravado
     * @throws java.io.IOException
     */
    public void write(String path, String string) throws IOException {
        try (BufferedWriter buffWrite = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path),"UTF-8"))) {
            buffWrite.append(string + "\n");
        }
    }
}
