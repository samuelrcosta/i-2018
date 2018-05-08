package main.java.AS1.exercicio4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implementa o exercício 4
 * @author Samuel
 */
public class Exercicio4 {
    
    /**
     * Executa a função escreveArquivo através do primeiro e do segundo argumento
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        escreveArquivo(args[0], args[1]);
    }
    
    /**
     * Método recebe o nome de um arquivo e uma string de dados para fazer a gravação
     * destes dados neste arquivo.
     * @param arq entrada de uma String com o nome do arquivo.
     * @param dados String com os dados a serem gravados
     * @throws IllegalArgumentException caso o nome do arquivo esteja em branco.
     */
    public static void escreveArquivo(String arq, String dados){
        if (arq.equals(null) || arq.equals("") || arq.equals(" ")) {
            throw new IllegalArgumentException("Nome do arquivo inválido");
        }
        
        PrintWriter pw;
        try {
            pw = new PrintWriter(arq, "UTF-8");
            pw.write(dados);
            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Exercicio4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Exercicio4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
