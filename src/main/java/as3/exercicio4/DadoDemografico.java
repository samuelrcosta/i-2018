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
 * Esta classe Implementa a classe Dado Demográfico proposto pelo exercício 3
 * @author Samuel
 */
@JsonPropertyOrder({"sexo", "mae", "pai", "situacao_familiar", "raca", "comentario", "fonte_notificacao_obito", "pluraridade", "ordem", "seguimento", "nascimento", "obito", "nacionalidade"})
public class DadoDemografico {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("sexo")
    private String sexo;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("mae")
    private String mae;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("pai")
    private String pai;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("situacao_familiar")
    private String situacao_familiar;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("raca")
    private String raca;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("comentario")
    private String comentario;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("fonte_notificacao_obito")
    private String fonte_notificacao_obito;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("pluraridade")
    private String pluraridade;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("ordem")
    private String ordem;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("seguimento")
    private String seguimento;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("nascimento")
    private Data nascimento;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("obito")
    private Data obito;
    
    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("nacionalidade")
    private Nacionalidade nacionalidade;

    /**
     * Retorna o sexo
     * @return String
    */
    public String getSexo() {
        return sexo;
    }

    /**
     * Altera o sexo
     * @param sexo
    */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * Retorna o nome da mãe
     * @return String
    */
    public String getMae() {
        return mae;
    }

    /**
     * Altera o nome da mãe
     * @param mae
    */
    public void setMae(String mae) {
        this.mae = mae;
    }

    /**
     * Retorna o nome do pai
     * @return String
    */
    public String getPai() {
        return pai;
    }

    /**
     * Altera o nome do pai
     * @param pai
    */
    public void setPai(String pai) {
        this.pai = pai;
    }

    /**
     * Retorna a situação familiar
     * @return String
    */
    public String getSituacao_familiar() {
        return situacao_familiar;
    }

    /**
     * Altera a situação familiar
     * @param situacao_familiar
    */
    public void setSituacao_familiar(String situacao_familiar) {
        this.situacao_familiar = situacao_familiar;
    }

    /**
     * Retorna a raça
     * @return String
    */
    public String getRaca() {
        return raca;
    }

    /**
     * Altera a raça
     * @param raca
    */
    public void setRaca(String raca) {
        this.raca = raca;
    }

    /**
     * Retorna o comentário
     * @return String
    */
    public String getComentario() {
        return comentario;
    }

    /**
     * Altera o comentario
     * @param comentario
    */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * Retorna a fonte de notificação de óbito
     * @return String
    */
    public String getFonte_notificacao_obito() {
        return fonte_notificacao_obito;
    }

    /**
     * Altera a fonte de notificação de óbito
     * @param fonte_notificacao_obito
    */
    public void setFonte_notificacao_obito(String fonte_notificacao_obito) {
        this.fonte_notificacao_obito = fonte_notificacao_obito;
    }

    /**
     * Retorna a pluraridade do nascimento
     * @return String
    */
    public String getPluraridade() {
        return pluraridade;
    }

    /**
     * Altera a pluraridade do nascimento
     * @param pluraridade
    */
    public void setPluraridade(String pluraridade) {
        this.pluraridade = pluraridade;
    }

    /**
     * Retorna a ordem do nascimento
     * @return String
    */
    public String getOrdem() {
        return ordem;
    }

    /**
     * Altera a ordem do nascimento
     * @param ordem
    */
    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }

    /**
     * Retorna o seguimento do nascimento
     * @return String
    */
    public String getSeguimento() {
        return seguimento;
    }

    /**
     * Altera o seguimento do nascimento
     * @param seguimento
    */
    public void setSeguimento(String seguimento) {
        this.seguimento = seguimento;
    }

    /**
     * Retorna a data de nascimento
     * @return objeto Data
    */
    public Data getNascimento() {
        return nascimento;
    }

    /**
     * Altera a data de nascimento
     * @param nascimento objeto Data
    */
    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    /**
     * Retorna a data de obito
     * @return objeto Data
    */
    public Data getObito() {
        return obito;
    }

    /**
     * Altera a data de obito
     * @param obito objeto Data
    */
    public void setObito(Data obito) {
        this.obito = obito;
    }

    /**
     * Retorna a nacionalidade
     * @return objeto Nacionalidade
    */
    public Nacionalidade getNacionalidade() {
        return nacionalidade;
    }

    /**
     * Altera a nacionalidade
     * @param nacionalidade objeto Nacionalidade
    */
    public void setNacionalidade(Nacionalidade nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    
}
