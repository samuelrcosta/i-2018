
package AS2.ExerciciosJSON.Exercicio6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Esta classe implementa o exercício 6
 * 
 * @author Samuel
 */
public class Exercicio6 {
    
    /**
     * Faz a leitura de um buffer para uma string.
     * 
     * @param rd a Reader buffer
     * @return uma String com o dado lido
    */
    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    /**
     * Faz uma requisição para uma URL informada com parâmetro, retorna os resultados desta requisição
     * em um objeto JSON.
     * 
     * @param url uma String com a url desejada
     * @return um objeto JSON com o resultado da requisição
     * @throws java.io.IOException
     * @throws org.json.JSONException
    */
    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }

    /**
     * Executa a função readJsonFromUrl para receber o JSON da url 'http://ip.jsontest.com'
     * @param args
     * @throws IOException
     * @throws JSONException 
     */
    public static void main(String[] args) throws IOException, JSONException {
      JSONObject json = readJsonFromUrl("http://ip.jsontest.com");
      System.out.println(json.get("ip"));
    }
}
