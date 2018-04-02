package AS1.Exercicio1;



import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Implementa o Exercício 1
 * @author Samuel
 */
public class Exercicio1 {
    /**
     * Executa a função lerHexa através do primeiro argumento
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        try {
            System.out.println(lerHexa(args[0]));
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    /**
     * Método recebe o nome de um arquivo e retorna os 4 primeiros bytes do arquivo em Haxadecimal.
     * @param arq entrada de uma String com o nome do arquivo.
     * @return String com o hexadecimal.
     * @throws IllegalArgumentException caso o nome do arquivo esteja em branco.
     */
    public static String lerHexa(String arq) throws FileNotFoundException, IOException{
        if (arq.equals(null) || arq.equals("") || arq.equals(" ")) {
            throw new IllegalArgumentException("Nome do arquivo inválido");
        }
        FileInputStream fis = new FileInputStream(arq);
        DataInputStream dis = new DataInputStream(fis);

        int valor = dis.readInt();
        dis.close();
        return Integer.toHexString(valor);
    }
}
