package AS1.Exercicio8;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implementa o exercício 8
 * @author Samuel
 */
public class Exercicio8 {
    
    /**
     * Executa a função lerArquivoBinario através do primeiro e do segundo argumento.
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        try{
            System.out.println(lerArquivoBinario(args[0], Integer.parseInt(args[1])));
        }catch (IOException e) {
            System.out.println(e);
        }
    }
    
    /**
     * Método que lê um arquivo binário gravado no padrão do exercício 7 e 
     * reverte os dados em binário para os dados originais.
     * @param arq entrada de uma String com o nome do arquivo a ser lido.
     * @param linha entrada de um int com o número da linha a ser lida.
     * @return dados convertidos
     * @throws java.io.FileNotFoundException
     * @throws IllegalArgumentException caso o nome dos arquivos estejam em branco.
     */
    public static String lerArquivoBinario(String arq, int linha) throws FileNotFoundException{
        if (arq.equals(null) || arq.equals("") || arq.equals(" ")) {
            throw new IllegalArgumentException("Nome do arquivo inválido");
        }
        
        FileInputStream fis = new FileInputStream(arq);
        DataInputStream dis = new DataInputStream(fis);
        // String de retorno
        String dados = "";
        // Variável que captura o número de linhas do arquivo
        int qntLinhas = 0;
        // Variável de captura a quantidade de Bytes a serem pulados
        int qntBytes = 0;
        // Variável de salva o tamanho da linha
        int tamanhoLinha = 0;
        // Grava qual a linha desejada
        int linhaDesejada = linha;
        try {
            // Lê a quantidade de linhas
            qntLinhas = dis.readInt();
            // Faz um for para ler os tamanhos de cada linha
            for(int i = 1; i <= qntLinhas; i++){
                // Lê o tamanho
                int lin = dis.readInt();
                if(i == linhaDesejada){
                    // Salva o tamanho da linha desejada
                    tamanhoLinha = lin;
                }
                if(i < linhaDesejada){
                    // Grava a quantidade de Bytes a ser pulados até a linha desejada
                    qntBytes = qntBytes + lin;
                }
            }
            // Pula os Bytes
            dis.skipBytes(qntBytes);
             // Lê os próximos bytes
            byte[] buffer = new byte[tamanhoLinha];
            dis.readFully(buffer, 0, tamanhoLinha);
            // Transforma os bytes em String
            dados = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            Logger.getLogger(Exercicio8.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dados;
    }
}
