package AS2.ExerciciosJSON.Exercicio7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Esta classe implementa o exercício 7
 * 
 * @author Samuel
 */
public class Exercicio7 {
    
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
     * Esta função recebe a url de uma imagem e salva a imagem em um arquivo, com o nome informado
     * no segundo parâmetro
     * @param urlImagem String para a url de download da imagem
     * @param nomeArquivoSaida String para o nome do arquivo a ser salvo
     */
    public static void gravaImagem(String urlImagem, String nomeArquivoSaida){
        try {
            // 1MB de buffer
            final int BUFFER_SIZE = 1024 * 1024;
            URL url = new URL(urlImagem);
            BufferedInputStream stream = new BufferedInputStream(
                            url.openStream(), BUFFER_SIZE);
            BufferedOutputStream fos = new BufferedOutputStream(
                            new FileOutputStream(nomeArquivoSaida));
            byte buf[] = new byte[BUFFER_SIZE];
            int numBytesRead;
            do {
                    numBytesRead = stream.read(buf);
                    if (numBytesRead > 0) {
                            fos.write(buf, 0, numBytesRead);
                    }
            } while (numBytesRead > 0);
            fos.flush();
            fos.close();
            stream.close();
            buf = null;
        } catch (MalformedURLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }   
    }

    /**
     * Lê o perfil do github a partir de uma URL que retorna um json, nesse json é capturado a url 
     * da imagem do avatar do usuario e então grava em um arquivo.
     * @param args
     * @throws IOException
     * @throws JSONException 
     */
    public static void main(String[] args) throws IOException, JSONException {
      JSONObject json = readJsonFromUrl("https://api.github.com/users/kyriosdata");
      String avatarURL = (String) json.get("avatar_url");
      // Grava o arquivo
      gravaImagem(avatarURL, "Imagem.jpg");
    }
}
