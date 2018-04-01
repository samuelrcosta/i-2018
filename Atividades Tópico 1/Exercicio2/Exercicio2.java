package Exercicio2;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Samuel
 */
public class Exercicio2 {
    
    /**
     * Executa a função verificaJpeg através do primeiro argumento
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        try {
            boolean verifica = verificaJpeg(args[0]);
            if(verifica == true){
                System.out.println("É um JPEG");
            }else{
                System.out.println("Não é um JPEG");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    
    /**
     * Método recebe o nome de um arquivo e retona se ele é um Jpeg ou não.
     * @param arq entrada de uma String com o nome do arquivo de imagem.
     * @return true ou false.
     * @throws IllegalArgumentException caso o nome do arquivo esteja em branco.
     */
    public static boolean verificaJpeg(String arq) throws FileNotFoundException, IOException{
        if (arq.equals(null) || arq.equals("") || arq.equals(" ")) {
            throw new IllegalArgumentException("Nome do arquivo inválido");
        }
        
        DataInputStream ins = new DataInputStream(new BufferedInputStream(new FileInputStream(arq)));
        try {
            int value = ins.readInt();
            if (value == 0xffd8ffe0) {
                return true;
            } else {
                return false;
            }
        } finally {
            ins.close();
        }
    }
}