package com.digitalhouse.junit;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    static Pessoa p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;

    List<String> colecao = new ArrayList<>();

    @BeforeAll
    static void doBeforeAll(){
        System.out.println("====  Inicio do Teste ====");
        System.out.println(" ");
        System.out.println("Instanciando as Pessoas dentro do BeforeAll");
        System.out.println(" ");

        p1 = new Pessoa("Ivo", "Ganda");
        p1.setDataNascimento(LocalDate.of(2016,3,23));

        p2 = new Pessoa("Ana", "Pascoal");
        p2.setDataNascimento(LocalDate.of(2010,3,20));

        p3 = new Pessoa("Jose", "Silva");
        p3.setDataNascimento(LocalDate.of(2014,1,13));

        p4 = new Pessoa("Lucas", "Mendes");
        p4.setDataNascimento(LocalDate.of(1998,5,30));

        p5 = new Pessoa("Marina", "Flores");
        p5.setDataNascimento(LocalDate.of(1977,12,1));

        p6 = new Pessoa("Geraldo", "Cha");
        p6.setDataNascimento(LocalDate.of(1966,10,10));

        p7 = new Pessoa("Roberto", "Alvaro");
        p7.setDataNascimento(LocalDate.of(2005,3,23));

        p8 = new Pessoa("Malu", "Tuo");
        p8.setDataNascimento(LocalDate.of(2008,3,23));

        p9 = new Pessoa("Anna", "Laura");
        p9.setDataNascimento(LocalDate.of(2013,8,11));

        p10 = new Pessoa("Iana", "Souza");
        p10.setDataNascimento(LocalDate.of(2007,12,23));
    }

    @BeforeEach
    void doBeforeEach(){
        System.out.println("Dentro do Before Each");
        System.out.println(" ");
    }

    @Test
    void imprimindoPessoasCriadas(){
        System.out.println("Teste 1 - Apenas imprimindo as Pessoas Criadas");
        System.out.println(" ");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println(p6.toString());
        System.out.println(p7.toString());
        System.out.println(p8.toString());
        System.out.println(p9.toString());
        System.out.println(p10.toString());
    }

    @Test
    void testandoP1ListaVAzia(){
        p1.adicionarNomes(p1);
        Assertions.assertEquals(0, p1.colecao.size());
    }

    @Test
    @Disabled("Teste 3 não será executado")
    void testeDisable(){
        System.out.println("Teste 3");
    }

    @Test
    void adicionarP6ListaComPessoa(){
        p6.adicionarNomes(p6);
        Assertions.assertEquals(1, p6.colecao.size());
    }

    @Test
    void imprimirColecaoEstatica(){
        p1.adicionarNomesEmColecaoEstatica(p1);
        p2.adicionarNomesEmColecaoEstatica(p2);
        p3.adicionarNomesEmColecaoEstatica(p3);
        p4.adicionarNomesEmColecaoEstatica(p4);
        p5.adicionarNomesEmColecaoEstatica(p5);
        p6.adicionarNomesEmColecaoEstatica(p6);
        p7.adicionarNomesEmColecaoEstatica(p7);
        p8.adicionarNomesEmColecaoEstatica(p8);
        p9.adicionarNomesEmColecaoEstatica(p9);
        p10.adicionarNomesEmColecaoEstatica(p10);

        System.out.println(Pessoa.colecaoEstatica);

        Assertions.assertEquals(3, Pessoa.colecaoEstatica.size());
    }


    @AfterEach
    void doAfterEach(){
        System.out.println("Final de Cada Teste");
        System.out.println(" ");
    }

    @AfterAll
    static void doAfterAll(){
        System.out.println("Fim do Teste");
    }
}