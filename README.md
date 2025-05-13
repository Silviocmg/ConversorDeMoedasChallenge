Conversor de Moedas
Sobre o Projeto
Este projeto é um Conversor de Moedas que permite aos usuários realizar conversões entre diferentes moedas internacionais. A aplicação utiliza a biblioteca Gson para processar dados de taxas de câmbio em formato JSON, proporcionando conversões precisas e atualizadas.
Funcionalidades

Conversão entre múltiplas moedas internacionais
Interface simples e intuitiva
Resultados de conversão precisos e formatados
Suporte para as principais moedas mundiais

Tecnologias Utilizadas

Java: Linguagem de programação principal
Maven: Gerenciador de dependências e build do projeto
Gson 2.11.0: Biblioteca para manipulação de dados JSON de taxas de câmbio

Configuração do Projeto
Pré-requisitos

JDK 8 ou superior
Maven 3.6 ou superior

Estrutura do Projeto
conversor-moedas/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── conversor/
│   │   │           ├── model/
│   │   │           ├── controller/
│   │   │           ├── view/
│   │   │           └── Main.java
│   │   └── resources/
│   │       └── taxas-cambio.json
│   └── test/
│       └── java/
├── pom.xml
└── README.md
Dependências
O projeto utiliza Maven para gerenciar suas dependências. A principal dependência é a biblioteca Gson, que foi adicionada no arquivo pom.xml:
xml<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.11.0</version>
</dependency>
Como Usar
Clonando o Repositório
bashgit clone https://github.com/seu-usuario/conversor-moedas.git
cd conversor-moedas
Compilando o Projeto
bashmvn clean install
Executando a Aplicação
bashmvn exec:java -Dexec.mainClass="com.conversor.Main"
Guia de Uso

Inicie a aplicação conforme as instruções acima
Selecione a moeda de origem
Selecione a moeda de destino
Insira o valor a ser convertido
Clique no botão "Converter"
O resultado da conversão será exibido na tela

Moedas Suportadas

Real Brasileiro (BRL)
Dólar Americano (USD)
Euro (EUR)
Libra Esterlina (GBP)
Iene Japonês (JPY)
Franco Suíço (CHF)
Dólar Canadense (CAD)
Dólar Australiano (AUD)
Yuan Chinês (CNY)
E muitas outras...

Funcionamento Interno
O Conversor de Moedas utiliza a biblioteca Gson para processar dados de taxas de câmbio armazenados em formato JSON. Quando o usuário solicita uma conversão, a aplicação:

Carrega o arquivo de taxas de câmbio usando Gson
Identifica as taxas das moedas selecionadas
Realiza o cálculo da conversão
Formata e exibe o resultado para o usuário

Recursos Adicionais

Documentação oficial do Gson
Maven Repository - Gson

Licença
Este projeto está licenciado sob a licença MIT - veja o arquivo LICENSE para mais detalhes.
