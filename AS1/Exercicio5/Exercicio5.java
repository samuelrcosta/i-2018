package AS1.Exercicio5;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * Implementa o exercício 5
 * @author Samuel
 */
public class Exercicio5 {
    
    /**
     * Executa a função tranformaEmBinario através do primeiro e do segundo argumento
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
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
     * Cada linha do arquivo lido será gravada no arquivo binário, no entanto antes de do conteúdo cada linha
     * é gravado o tamanho da linha.
     * @param arqEntrada entrada de uma String com o nome do arquivo a ser lido.
     * @param arqSaida entrada de uma String com o nome do arquivo a ser gravado
     * @throws java.io.FileNotFoundException
     * @throws java.io.UnsupportedEncodingException
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
        
        String linha;
        while((linha = br.readLine()) != null){
            byte[] texto = linha.getBytes("UTF-8");
            // Grava o tamanho da linha
            dos.writeInt(texto.length);
            // Grava os bytes do texto
            dos.write(texto, 0, texto.length);
        }
        br.close();
        dos.close();
        
    }
}
