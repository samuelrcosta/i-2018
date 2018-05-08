/*
 * Copyright (c) 2018.
 * Samuel Rocha Costa - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package main.java.as3.exercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author Samuel
 * Esta classe implementa o exercício 1 (https://docs.google.com/document/d/1n8nHwBg1mKtDk_nNPyI3JWVQnG1MQ30w_INFg33lqtQ)
 * Irá ler um arquivo CSV e retornar o resultado em XML
 */
public class Exercicio1 {
    
    /**
     * Grava uma classe Teste serializada em um arquivo e então desserializa este arquivo de volta no 
     * objeto teste
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) {
        csvToXml("src/resources/testeCSV.csv");
    }
    
    public static void csvToXml(String path){
        String arquivoCSV = path;
        String newPath = path.replace(".csv", ".xml");
        BufferedReader br = null;
        String linha = "";
        String csvDivisor = ";";
        String XML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><alunos>";
        int contador = 0;
        try{
            br = new BufferedReader(new InputStreamReader(new FileInputStream(arquivoCSV), "UTF-8"));
            while((linha = br.readLine()) != null){
                if(contador != 0){
                    String[] csv = linha.split(csvDivisor);
                    XML += "<aluno>";
                    XML += "<nome>" + csv[csv.length-2] + "</nome>";
                    XML += "<email>" + csv[csv.length-2] + "</email>";
                    XML += "</aluno>";
                    System.out.println(csv[csv.length-2]);
                }
                contador++;
            }
            XML += "</alunos>";
            escritor(newPath, XML);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public static void escritor(String path, String xml) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path),"UTF-8"));
        buffWrite.append(xml + "\n");
        buffWrite.close();
    }
}
