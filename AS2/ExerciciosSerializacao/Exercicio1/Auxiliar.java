package AS2.ExerciciosSerializacao.Exercicio1;

/**
 * Esta classe tem a função de auxiliar no erro "NotSerializableException"
 * como ela não implementa a interface Serializeble, o erro irá ocorrer ao tentar gravar um objeto
 * que utiliza esta classe
 * @author Samuel
 */
public class Auxiliar {
    // Declaração de atributos
    private String nome;
    
    /**
    * Contrustor da Classe
    * 
    * @param n String para a variável nome
    */
    public Auxiliar(String n){
        this.nome = n;
    }
    
    /**
    * Retorna a variável nome
    * 
    * @return String
    */
    public String getNome() {
        return nome;
    }
    
    /**
    * Altera o valor da variável nome
    * 
    * @param nome
    */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
