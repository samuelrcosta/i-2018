package main.java.AS1.exercicio3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Implementa o exercício 3
 * @author Samuel
 */
public class Exercicio3 {
    
    /**
     * Executa a função lerArquivo através do primeiro argumento
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        try {
            System.out.println(lerArquivo("src/Resources/teste.txt"));
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    
    /**
     * Método recebe o nome de um arquivo e retona uma String com o seu conteúdo em UTF-8.
     * @param arq entrada de uma String com o nome do arquivo.
     * @return String com os dados do arquivo.
     * @throws java.io.IOException
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
        StringBuilder texto = new StringBuilder();
        while ((linha = br.readLine()) != null) {
            texto.append(linha + '\n');
        }
        return texto.toString();
    }
}
