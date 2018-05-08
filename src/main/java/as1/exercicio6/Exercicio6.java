package main.java.AS1.exercicio6;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implementa o exercício 6
 * @author Samuel
 */
public class Exercicio6 {
    
    /**
     * Executa a função lerArquivoBinario através do primeiro argumento
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        try{
            System.out.println(lerArquivoBinario(args[0]));
        }catch (IOException e) {
            System.out.println(e);
        }
    }
    
    /**
     * Método que lê um arquivo binário gravado no padrão do exercício 5 e reverte
     * a forma binária deste arquivo.
     * @param arq entrada de uma String com o nome do arquivo a ser lido.
     * @return dados convertidos
     * @throws java.io.FileNotFoundException
     * @throws IllegalArgumentException caso o nome dos arquivos estejam em branco.
     */
    public static String lerArquivoBinario(String arq) throws FileNotFoundException{
        if (arq.equals(null) || arq.equals("") || arq.equals(" ")) {
            throw new IllegalArgumentException("Nome do arquivo inválido");
        }
        
        FileInputStream fis = new FileInputStream(arq);
        DataInputStream dis = new DataInputStream(fis);
        String retorno = "";
        try {
            int linha = 1;
            while(dis.available() > 0){
                // Lê o tamanho da linha
                int tamanho = dis.readInt();
                // Lê os próximos bytes
                byte[] buffer = new byte[tamanho];
                dis.readFully(buffer, 0, tamanho);
                // Transforma os bytes em String
                String dados = new String(buffer, "UTF-8");
                // Concaterna os dados da String de retorno
                retorno = retorno +  "Linha: " + linha + " - Tamanho: " + tamanho + " - dados: " + dados + "\n";
                linha++;
            }
        } catch (IOException ex) {
            Logger.getLogger(Exercicio6.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
}
