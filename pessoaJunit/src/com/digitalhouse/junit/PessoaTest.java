package com.digitalhouse.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @BeforeAll
    static void doBeforeAll(){
        System.out.println("Inicio do Teste");
        System.out.println(" ");
    }

    @BeforeEach
    void doBeforeEach(){
        System.out.println("Dentro do Before Each");
    }

    @Test
    void adicionarColecao1(){
        System.out.println("Teste 1");
    }

    @Test
    void adicionarColecao2(){
        System.out.println("Teste 2");
    }

    @Test
    @Disabled("Teste 3 não será executado")
    void adicionarColecao3(){
        System.out.println("Teste 3");
    }

    @Test
    void adicionarColecao4(){
        System.out.println("Teste 4");
    }

    @Test
    void adicionarColecao5(){
        System.out.println("Teste 5");
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