package main.java.AS2.serializacao.exercicio2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Esta classe emprega dois métodos que fazem a serialização e a desserialização da Classe Teste
 * 
 * @author Samuel
 */
public class TesteExec {
    
    /**
     * Grava uma classe Teste serializada em um arquivo e então desserializa este arquivo de volta no 
     * objeto teste
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Instancia a classe Teste
        Teste t = new Teste("Samuel");
        // Salva dados na classe
        t.setCidade("Goiânia");
        t.setIdade(20);
        // Grava a classe no arquivo "ClasseTeste.txt"
        gravaClasse(t, "ClasseTeste.txt");
        
        // Recupera a classe salva no arquivo "ClasseTeste.txt"
        Teste novaClasse = deserializa("ClasseTeste.txt");
        
        // Mostra na tela os dados da classe
        System.out.println(novaClasse.getCidade());
        System.out.println(novaClasse.getNome());
        System.out.println(novaClasse.getIdade());
    }
    
    /**
     * Esta função recebe uma classe que implementa a interface serializable e o nome de um arquivo.
     * Ela irá gravar neste arquivo o conteúdo desta classe serializado.
     *
     * @throws IOException
     */
    private static void gravaClasse(Serializable s, String nomeArquivo) throws IOException {
        FileOutputStream fileOut = new FileOutputStream(nomeArquivo);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(s);
        out.close();
        fileOut.close();
     }
    
    /**
     * Esta função recebe uma String com o nome de um arquivo. Ela irá ler o este arquivo e irá
     * retornar a classe Teste que deverá estar serializada neste arquivo.
     *
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private static Teste deserializa(String nomeArquivo) throws IOException, ClassNotFoundException{
        Teste t = null;
        FileInputStream fileIn = new FileInputStream(nomeArquivo);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        t = (Teste)in.readObject();
        in.close();
        fileIn.close();
        return t;
    }

}
