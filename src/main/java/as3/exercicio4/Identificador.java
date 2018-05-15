/*
 * Copyright (c) 2018.
 * Samuel Rocha Costa - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package main.java.as3.exercicio4;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

/**
 * Esta classe Implementa a classe Identificador proposto pelo exercício 3
 * @author Samuel
 */
@JsonPropertyOrder({"designacao", "area", "emissor", "data", "tipo", "utilizacao", "titulo_eleitoral", "certidao", "ctps", "vinculo"})
public class Identificador {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("designacao")
    private String designacao;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("area")
    private String area;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("emissor")
    private String emissor;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("data")
    private String data;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("tipo")
    private String tipo;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("utilizacao")
    private Utilizacao utilizacao;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("titulo_eleitoral")
    private TituloEleitoral titulo_eleitoral;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("certidao")
    private Certidao certidao;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("ctps")
    private CTPS ctps;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("vinculo")
    private Vinculo vinculo;

    
    /**
     * Retorna a designação
     * @return String
    */
    public String getDesignacao() {
        return designacao;
    }

    /**
     * Altera a designação
     * @param designacao
    */
    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    /**
     * Retorna a área
     * @return String
    */
    public String getArea() {
        return area;
    }

    /**
     * Altera a área
     * @param area
    */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * Retorna o emissor
     * @return String
    */
    public String getEmissor() {
        return emissor;
    }

    /**
     * Altera o emissor
     * @param emissor
    */
    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    /**
     * Retorna a data
     * @return String
    */
    public String getData() {
        return data;
    }

    /**
     * Altera a data
     * @param data
    */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Retorna o tipo
     * @return String
    */
    public String getTipo() {
        return tipo;
    }

    /**
     * Altera o tipo
     * @param tipo
    */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Retorna a Utilização
     * @return objeto Utilizacao
    */
    public Utilizacao getUtilizacao() {
        return utilizacao;
    }

    /**
     * Altera a Utilizacao
     * @param utilizacao objeto Utilizacao
    */
    public void setUtilizacao(Utilizacao utilizacao) {
        this.utilizacao = utilizacao;
    }

    /**
     * Retorna o titulo eleitoral
     * @return objeto TituloEleitoral
    */
    public TituloEleitoral getTitulo_eleitoral() {
        return titulo_eleitoral;
    }

    /**
     * Altera o título eleitoral
     * @param titulo_eleitoral objeto TituloEleitoral
    */
    public void setTitulo_eleitoral(TituloEleitoral titulo_eleitoral) {
        this.titulo_eleitoral = titulo_eleitoral;
    }

    /**
     * Retorna a Certidão
     * @return objeto Certidao
    */
    public Certidao getCertidao() {
        return certidao;
    }

    /**
     * Altera a Certidão
     * @param certidao objeto Certidao
    */
    public void setCertidao(Certidao certidao) {
        this.certidao = certidao;
    }

    /**
     * Retorna o CTPS
     * @return objeto CTPS
    */
    public CTPS getCtps() {
        return ctps;
    }

    /**
     * Altera o CTPS
     * @param ctps objeto CTPS
    */
    public void setCtps(CTPS ctps) {
        this.ctps = ctps;
    }

    /**
     * Retorna o vínculo
     * @return objeto Vinculo
    */
    public Vinculo getVinculo() {
        return vinculo;
    }

    /**
     * Altera o vínculo
     * @param vinculo objeto Vinculo
    */
    public void setVinculo(Vinculo vinculo) {
        this.vinculo = vinculo;
    }
}
