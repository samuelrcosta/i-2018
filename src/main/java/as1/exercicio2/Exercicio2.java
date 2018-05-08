package main.java.AS1.exercicio2;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Implementa o exercício 2
 * @author Samuel
 */
public class Exercicio2 {
    
    /**
     * Executa a função verificaJpeg através do primeiro argumento
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        try {
            System.out.println(verificaJpeg(args[0]));
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    
    /**
     * Método recebe o nome de um arquivo e retona se ele é um Jpeg válido ou não,
     * A verificação ocorre pelos 2 primeiros e os 2 últimos bytes do arquivo
     * Caso eles correspondam a FFD8 e FFD9 a função retornará true.
     * @param arq entrada de uma String com o nome do arquivo de imagem.
     * @return true ou false.
     * @throws java.io.FileNotFoundException
     */
    public static boolean verificaJpeg(String arq) throws FileNotFoundException, IOException{
        // Pega o tamanho do arquivo
        File file = new File(arq);
        long tamanho = file.length();
        
        FileInputStream fis = new FileInputStream(arq);
        DataInputStream dis = new DataInputStream(fis);
        
        // Lê os dois primeiros bytes
        byte primeiroByte = dis.readByte();
        byte segundoByte = dis.readByte();
        
        // Pula os bytes até o final do tamanho - 2 (o -4 é porque já foram lidos 2 bytes)
        dis.skip(tamanho - 4);
        
        // Lê os quatro últimos bytes
        byte penultimoByte = dis.readByte();
        byte ultimoByte = dis.readByte();
        
        dis.close();
        
        if((primeiroByte == (byte) 0xFF) && (segundoByte == (byte) 0xD8) && (penultimoByte == (byte) 0xFF) && (ultimoByte == (byte) 0xD9)){
            return true;
        }else{
            return false;
        }
    }
}