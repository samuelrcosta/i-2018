package Exercicio7;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.UnsupportedEncodingException;
import static java.lang.System.in;

/**
 *
 * @author Samuel
 */
public class Exercicio7 {
    /**
     * Executa a função tranformaEmBinario
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        try{
            tranformaEmBinario(args[0], args[1]);
        }catch (IOException e) {
            System.out.println(e);
        }
    }
    
    /**
     * Método que grava os dados de um arquivo em outro no formato binário
     * @param arqEntrada entrada de uma String com o nome do arquivo a ser lido.
     * @param arqSaida entrada de uma String com o nome do arquivo a ser gravado
     * @throws IllegalArgumentException caso o nome dos arquivos estejam em branco.
     */
    public static void tranformaEmBinario(String arqEntrada, String arqSaida) throws FileNotFoundException, UnsupportedEncodingException, IOException{
        if (arqEntrada.equals(null) || arqEntrada.equals("") || arqEntrada.equals(" ")) {
            throw new IllegalArgumentException("Nome do arquivo de entrada inválido");
        }
        if (arqSaida.equals(null) || arqSaida.equals("") || arqSaida.equals(" ")) {
            throw new IllegalArgumentException("Nome do arquivo de entrada inválido");
        }
        
        // Para a leitura do arquivo
        FileInputStream fis = new FileInputStream(arqEntrada);
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);
        
        // Para gravação do arquivo
        FileOutputStream fos = new FileOutputStream(arqSaida);
        DataOutputStream dos = new DataOutputStream(fos);
        
        // Primeiro grava o indice
        int qntLinhas = 0;
        String linha;
        while((linha = br.readLine()) != null){
            // Soma a quantidade de linhas
            qntLinhas++;
        }
        // Grava a quantidade de linhas
        dos.writeInt(qntLinhas);
        // Volta ao início do arquivo
        fis.getChannel().position(0);
        br = new BufferedReader(new InputStreamReader(fis));
        
        // Agora grava o tamanho de cada linha
        while((linha = br.readLine()) != null){
            byte[] texto = linha.getBytes("UTF-8");
            // Grava o tamanho da linha
            dos.writeInt(texto.length);
        }
        
        // Volta ao início do arquivo
        fis.getChannel().position(0);
        br = new BufferedReader(new InputStreamReader(fis));
        // Grava o conteudo de cada linha
        while((linha = br.readLine()) != null){
            // Pega o texto
            byte[] texto = linha.getBytes("UTF-8");
            // Grava os bytes do texto
            dos.write(texto, 0, texto.length);
        }
        br.close();
        dos.close();
        
    }
}
