package com.digitalhouse.junit;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private LocalDate dataNascimento;
    private String nome;
    private String sobrenome;

    List<String> colecao = new ArrayList<>();

    static List<String> colecaoEstatica = new ArrayList<>();

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public void adicionarNomes(Pessoa pessoa){
        int nomeTamanho = pessoa.getNome().length();
        int idade = pessoa.converterIdade();

        if(nomeTamanho >= 5 && idade >= 18){
            colecao.add(pessoa.getNome());
            System.out.println(colecao);
        }
    }

    public void adicionarNomesEmColecaoEstatica(Pessoa pessoa){
        int nomeTamanho = pessoa.getNome().length();
        int idade = pessoa.converterIdade();

        if(nomeTamanho >= 5 && idade >= 18){
            colecaoEstatica.add(pessoa.getNome());
            System.out.println(colecaoEstatica);
        }
    }

    public int converterIdade(){
        int idade = Period.between(this.dataNascimento,LocalDate.now()).getYears();
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<String> getColecao() {
        return colecao;
    }

    public void setColecao(List<String> colecao) {
        this.colecao = colecao;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "dataNascimento=" + dataNascimento +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }
}
