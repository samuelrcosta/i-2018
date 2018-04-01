/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Samuel
 */
public class Exercicio3 {
    
    /**
     * Executa a função lerArquivo através do primeiro argumento
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        try {
            System.out.println(lerArquivo(args[0]));
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    
    /**
     * Método recebe o nome de um arquivo e retona uma String com o seu conteúdo em UTF-8.
     * @param arq entrada de uma String com o nome do arquivo.
     * @return String com os dados do arquivo.
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
        String texto = "";
        while ((linha = br.readLine()) != null) {
            texto = texto + linha + "\n";
        }
        return texto;
    }
}
