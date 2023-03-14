package br.com.dio.desafio;

import java.time.LocalDate;
import java.util.*;

public class Estagio {

    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(115);
    private Set<Aluno> devsInscritos = new  HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Aluno> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Aluno> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estagio estagio = (Estagio) o;
        return Objects.equals(nome, estagio.nome) && Objects.equals(descricao, estagio.descricao) && Objects.equals(dataInicial, estagio.dataInicial) && Objects.equals(dataFinal, estagio.dataFinal) && Objects.equals(devsInscritos, estagio.devsInscritos) && Objects.equals(conteudos, estagio.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }

}
