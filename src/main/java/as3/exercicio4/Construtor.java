/*
 * Copyright (c) 2018.
 * Samuel Rocha Costa - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package main.java.as3.exercicio4;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Esta classe escreve uma instância de Indivíduo em uma String XML
 * @author Samuel
 */
public class Construtor {
    
    /**
     * Este método utiliza o Object mapper para seriazalizar a classe indivíduo em um arquivo XML
     * @param individuo
     * @return String xml
     * @throws com.fasterxml.jackson.core.JsonProcessingException 
    */
    public String criaStringXML(Individuo individuo) throws JsonProcessingException{
        ObjectMapper objectMapper = new XmlMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.setSerializationInclusion(Include.NON_NULL);
        String xml = objectMapper.writeValueAsString(individuo);
        return xml;
    }
    
    public Individuo criaIndividuoTeste(){
        Individuo individuo = new Individuo();
        individuo.addEndereco(criaEnderecoTeste());
        individuo.addIdentificador(criaIdentificadorTeste());
        individuo.addVinculo(criaVinculoTeste());
        individuo.setDadodemografico(criaDadoDemograficoTeste());
        individuo.addNomes(criaNomesTeste());
        individuo.addComunicacao(criaComunicacaoTeste());
        return individuo;
    }
    
    /**
     * Este método cria uma instância da classe endereço para testes
     * @return instância de endereco 
    */
    public Endereco criaEnderecoTeste(){
        Endereco endereco = new Endereco();
        endereco.setBairro("Centro");
        endereco.setCaixa_postal("75400000");
        endereco.setCep("751212");
        endereco.setCodigo_municipio("15");
        Data data = new Data();
        data.setData("10/05/2018");
        data.setAcuracia("teste");
        endereco.setData_inicio(data);
        data = new Data();
        data.setData("14/05/2018");
        data.setAcuracia("teste");
        endereco.setData_fim(data);
        endereco.setDistrito("Centro Oeste");
        endereco.setEstado("GO");
        LinhaDeEndereco linha_de_endereco = new LinhaDeEndereco();
        linha_de_endereco.setLinha("Linha 1");
        linha_de_endereco.setOrdem("Ordem 1");
        endereco.addLinha_de_endereco(linha_de_endereco);
        endereco.setPais("BR");
        endereco.setTipo("Principal");
        return endereco;
    }
    
    /**
     * Este método cria uma instância da classe Identificador para testes
     * @return instância de identificador 
    */
    public Identificador criaIdentificadorTeste(){
        Identificador identificador = new Identificador();
        identificador.setArea("Area central");
        identificador.setCertidao(criaCertidaoTeste());
        identificador.setCtps(criaCTPSTeste());
        identificador.setData("14/05/2018");
        identificador.setDesignacao("Teste");
        identificador.setEmissor("SSP-GO");
        identificador.setTipo("ID912");
        identificador.setTitulo_eleitoral(criaTituloEleitoralTeste());
        identificador.setUtilizacao(criaUtilizacaoTeste());
        identificador.setVinculo(criaVinculoTeste());
        return identificador;
    }
    
    /**
     * Este método cria uma instância da classe Certidão para testes
     * @return instância de certidao 
    */
    public Certidao criaCertidaoTeste(){
        Certidao certidao = new Certidao();
        certidao.setCartorio("Cartório Central");
        certidao.setFolha("100");
        certidao.setLivro("Livro 055-124");
        certidao.setTermo("01285-12");
        certidao.setTipo("Nascimento");
        return certidao;
    }
    
    /**
     * Este método cria uma instância da classe CTPS para testes
     * @return instância de ctps 
    */
    public CTPS criaCTPSTeste(){
        CTPS ctps = new CTPS();
        ctps.setEstado("Ativo");
        ctps.setSerie("001");
        return ctps;
    }
    
    /**
     * Este método cria uma instância da classe Título Eleitoral para testes
     * @return instância de TituloEleitoral 
    */
    public TituloEleitoral criaTituloEleitoralTeste(){
        TituloEleitoral titulo_eleitoral = new TituloEleitoral();
        titulo_eleitoral.setSecao("00124-121");
        titulo_eleitoral.setZona("009");
        return titulo_eleitoral;
    }
    
    /**
     * Este método cria uma instância da classe Utilização para testes
     * @return instância de Utilizacao 
    */
    public Utilizacao criaUtilizacaoTeste(){
        Utilizacao utilizacao = new Utilizacao();
        utilizacao.setUso("Utilizacao");
        utilizacao.setData_inicial("09/04/2017");
        utilizacao.setData_final("10/04/2018");
        return utilizacao;
    }
    
    /**
     * Este método cria uma instância da classe Vínculo para testes
     * @return instância de Vinculo 
    */
    public Vinculo criaVinculoTeste(){
        Vinculo vinculo = new Vinculo();
        vinculo.setRelacionamento("relacionamento teste");
        vinculo.setData_inicial("10/01/2017");
        vinculo.setData_final("10/06/2018");
        return vinculo;
    }
    
    /**
     * Este método cria uma instância da classe Dado Demográfico para testes
     * @return instância de DadoDemografico 
    */
    public DadoDemografico criaDadoDemograficoTeste(){
        DadoDemografico dado_demografico = new DadoDemografico();
        dado_demografico.setComentario("Comentario teste");
        dado_demografico.setFonte_notificacao_obito("Família");
        dado_demografico.setMae("Maria");
        dado_demografico.setPai("José");
        dado_demografico.setNacionalidade(criaNacionalidadeTeste());
        Data nascimento = new Data();
        nascimento.setAcuracia("teste");
        nascimento.setData("27/01/1998");
        dado_demografico.setNascimento(nascimento);
        dado_demografico.setOrdem("Ordem teste");
        dado_demografico.setPluraridade("teste pluraridade");
        dado_demografico.setRaca("Pardo");
        dado_demografico.setSeguimento("Seguimento teste");
        dado_demografico.setSexo("M");
        dado_demografico.setSituacao_familiar("Situação teste");
        return dado_demografico;
    }
    
    /**
     * Este método cria uma instância da classe Nacionalidade para testes
     * @return instância de DadoDemografico 
    */
    public Nacionalidade criaNacionalidadeTeste(){
        Nacionalidade nacionalidade =  new Nacionalidade();
        nacionalidade.setData_entrada("10/05/1998");
        nacionalidade.setEstado("GO");
        nacionalidade.setMunicipio("Goiânia");
        nacionalidade.setPais("Brasil");
        return nacionalidade;
    }
    
    /**
     * Este método cria uma instância da classe Nomes para testes
     * @return instância de Nomes 
    */
    public Nomes criaNomesTeste(){
        Nomes nomes = new Nomes();
        nomes.setNomes("Samuel");
        nomes.setPreferido("Costa");
        nomes.setSobrenomes("Rocha Costa");
        nomes.setSufixos("Sufixos teste");
        nomes.setTitulos("Sr.");
        nomes.setUsoCondicional("Sim");
        nomes.addRepresentacao(criaRepresentacaoTeste());
        nomes.addUtilizacao(criaUtilizacaoTeste());
        return nomes;
    }
    
    /**
     * Este método cria uma instância da classe Representacao para testes
     * @return instância de Representacao 
    */
    public Representacao criaRepresentacaoTeste(){
        Representacao representacao = new Representacao();
        representacao.setAlternativa("Teste alternativa");
        representacao.setUtilizacao("Teste Utilização");
        return representacao;
    }
    
    /**
     * Este método cria uma instância da classe Comunicacao para testes
     * @return instância de Comunicacao 
    */
    public Comunicacao criaComunicacaoTeste(){
        Comunicacao comunicacao =  new Comunicacao();
        comunicacao.setDetalhe("Detalhe Teste");
        comunicacao.setMeio("Meio teste");
        comunicacao.setPreferencia("PreferÊncia Teste");
        comunicacao.setUso("Uso teste");
        return comunicacao;
    }
}
