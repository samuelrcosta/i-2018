package main.java.AS2.serializacao.exercicio1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Esta classe implementa o exercício 1
 * 
 * @author Samuel
 */
public class TesteExec {
    
    /**
     * Será feito a tentativa de gravar uma classe que utiliza uma objeto que não implementa a interface
     * serializable (classe Auxiliar), deverá retornar a exceção java.io.NotSerializableException.
     * 
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Instancia a classe Auxiliar e a classe Teste
        Auxiliar a = new Auxiliar("Rocha");
        Teste t = new Teste("Samuel", a);
        // Salva dados na classe
        t.setCidade("Goiânia");
        t.setIdade(20);
        
        // Tenta gravar a classe no arquivo "ClasseTeste.txt"
        gravaClasse(t, "ClasseTeste.txt");
    }
    
    /**
     * Esta função recebe uma classe que implementa a interface serializable e o nome de um arquivo.
     * Ela irá gravar neste arquivo o conteúdo desta classe serializado.
     * A classe irá retornar erro caso tente gravar uma classe que não implementa a interface
     * serializable.
     *
     * @throws IOException
     */
    private static void gravaClasse(Serializable s, String nomeArquivo) throws IOException {
        FileOutputStream fileOut = new FileOutputStream(nomeArquivo);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        try{
            // Tenta gravar a classe no arquivo.
            out.writeObject(s);
        }catch(java.io.NotSerializableException e){
            // Mostra a mensagem de erro
            System.out.println("Erro na serialização - " + e.getMessage());
        }
        out.close();
        fileOut.close();
     }
}
