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
     * Classe main que executa a função csvToXML, recebe como parâmetro um arquivo CSV
     * e grava no mesmo diretório um arquivo com mesmo nome no formato XML.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        csvToXml(args[0]);
    }
    
    /**
     * Esta classe recebe como parâmetro um arquivo CSV
     * e grava no mesmo diretório um arquivo com mesmo nome no formato XML.
     * @param path String para o arquivo CSV
     */
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
                }
                contador++;
            }
            XML += "</alunos>";
            escritor(newPath, XML);
        }catch(FileNotFoundException e){
        }catch (IOException e){
        }finally{
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                }
            }
        }
    }
    
    /**
     * Esta função recebe um arquivo e uma string de dados e grava no disco o arquivo espeficicado
     * com os dados especificados.
     * @param path String para o arquivo
     * @param xml String para o conteúdo a ser gravado
     * @throws java.io.IOException
     */
    public static void escritor(String path, String xml) throws IOException {
        try (BufferedWriter buffWrite = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path),"UTF-8"))) {
            buffWrite.append(xml + "\n");
        }
    }
}
