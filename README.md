   <h1>Projeto: Sistema de Veículos em Java</h1>  
   <h2>Descrição do Projeto</h2>
    <p>
        Este projeto é uma implementação simples de um sistema de veículos utilizando 
        <strong>Programação Orientada a Objetos (POO)</strong> em Java. Ele apresenta conceitos como 
        herança, sobrescrita de métodos e interação com o usuário através de entrada de dados pelo console.
    </p>
    <h2>Visão Geral do Projeto</h2>
    <p>
        O projeto simula o comportamento de veículos, permitindo que o usuário insira dados de um carro e de uma moto, 
        e veja suas informações e ações. Ele é composto pelas seguintes classes:
    </p>
    <ul>
        <li><strong>Veiculo</strong>: Classe base que define as propriedades e comportamentos comuns a todos os veículos.</li>
        <li><strong>Carro</strong>: Subclasse que especializa a classe <em>Veiculo</em>, representando um carro.</li>
        <li><strong>Moto</strong>: Subclasse que especializa a classe <em>Veiculo</em>, representando uma moto.</li>
        <li><strong>Main</strong>: Classe principal que gerencia a interação com o usuário e executa o programa.</li>
    </ul>    
    <h2>Funcionalidades</h2>
    <h3>Cadastro de Veículos</h3>
    <p>Permite que o usuário insira a marca e o ano de fabricação de um carro e de uma moto.</p>    
    <h3>Aceleração</h3>
    <p>Exibe mensagens específicas ao acelerar um carro ou uma moto, demonstrando o uso de polimorfismo.</p>  
    <h2>Sistema de Classes</h2>
    <p>O sistema é composto por quatro classes principais:</p>
    <ul>
        <li><strong>Veiculo</strong>: Classe base para representar características comuns de veículos.</li>
        <li><strong>Carro</strong>: Classe derivada que representa um tipo específico de veículo.</li>
        <li><strong>Moto</strong>: Outra classe derivada para representar outro tipo de veículo.</li>
        <li><strong>Main</strong>: Classe principal que controla a execução do programa.</li>
    </ul>    
    <h2>Tecnologias Utilizadas</h2>
    <ul>
        <li><strong>Java</strong>: Linguagem principal utilizada no projeto.</li>
        <li><strong>POO (Programação Orientada a Objetos)</strong>: Abordagem de desenvolvimento para modelar classes e objetos.</li>
    </ul>    
    <h2>Exemplos de Aprendizado Demonstrados</h2>
    <ul>
        <li><strong>Herança</strong>: A classe <em>Carro</em> e <em>Moto</em> herdam da classe base <em>Veiculo</em>.</li>
        <li><strong>Polimorfismo</strong>: A sobrescrita do método <code>acelerar()</code> permite que cada subclasse implemente comportamentos específicos.</li>
        <li><strong>Interação com o Usuário</strong>: Entrada de dados é feita via <code>Scanner</code>, facilitando a interação no terminal.</li>
    </ul>
