# javaJUnit


## Testes Unitários

* Os teste unitários tem como objetivo pegar uma pequena parte do software, isolando-a do resto do código, para determinar se ela se comporta / funciona conforme esperado.

* Cada unidade é testada separadamente antes de ser integrada aos componentes para testar as interfaces entre as unidades.

* Utiliza-se um processo conhecido como 3A: 
   *   ARRANGE (Preparar o teste) -> Define os requisitos que o código deve atender
   *   ACT (Rodar o teste) -> Executa o teste que dará origem aos resultados que devemos analisar
   *   ASSERT (Verificar as asserções) -> Se comprovam se os resultados obtidos são esperados

* Vantagens dos Testes Unitários:
   * Facilita as mudanças de código: O erro pode ser detectado mais rapidamente, sendo assim mais fácil alterá-lo
   * Fornecem documentação: Ajudam a entender o que o código faz e qual era a intenção ao desenvolvê-lo
   * Encontrar Bugs: Testando coponentes individuais antes da integração, garantindo que eles não afetem outra parte do código.
   * Melhoria de design e qualidade do código: Ao convidar o desenvolvedor a pensar sobre o design antes de escrevê-lo (TDD)


## Testes de Integração

* As unidades individuais são integradas para formar componentes maiores, por exemplo duas unidades que já foram testadas são combinadas em um componente integrado e a interface entre elas é testada.

* Permite cobrir area maior do código, sobre a qual as vezes não temos controle.

* Visa validar a interação entre os módulos do software.
