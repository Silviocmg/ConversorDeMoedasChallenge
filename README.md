<h1 align="center">🌐 Conversor de Moedas</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java"/>
  <img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white" alt="Maven"/>
  <img src="https://img.shields.io/badge/Gson-00979D?style=for-the-badge&logo=google&logoColor=white" alt="Gson"/>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Versão-1.0-blue" alt="Versão"/>
  <img src="https://img.shields.io/badge/Licença-MIT-green" alt="Licença"/>
</p>

<hr>

## 📋 Sobre o Projeto

<p align="center">
  <b>Uma solução elegante para conversão de moedas internacionais em tempo real</b>
</p>

Este projeto é um **Conversor de Moedas** robusto e intuitivo que permite aos usuários realizar conversões precisas entre diversas moedas internacionais. A aplicação utiliza a biblioteca **Gson** para processar e interpretar dados de taxas de câmbio em formato JSON, proporcionando resultados atualizados e confiáveis.

<hr>

## ✨ Funcionalidades

<table>
  <tr>
    <td>✅ Conversão entre múltiplas moedas internacionais</td>
    <td>✅ Taxas de câmbio atualizadas</td>
  </tr>
  <tr>
    <td>✅ Interface simples e intuitiva</td>
    <td>✅ Histórico de conversões</td>
  </tr>
  <tr>
    <td>✅ Resultados formatados por localidade</td>
    <td>✅ Modo offline com taxas armazenadas</td>
  </tr>
</table>

<hr>

## 🛠️ Tecnologias Utilizadas

<details open>
<summary><b>Principais tecnologias</b></summary>

- **Java**: Linguagem de programação principal
- **Maven**: Gerenciador de dependências e build do projeto
- **Gson 2.11.0**: Biblioteca para manipulação de dados JSON de taxas de câmbio
</details>

<hr>

## 🚀 Configuração do Projeto

### Pré-requisitos

- JDK 8 ou superior
- Maven 3.6 ou superior

### Estrutura do Projeto

```
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
```

### Dependências

O projeto utiliza Maven para gerenciar suas dependências. A principal dependência é a biblioteca Gson:

```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.11.0</version>
</dependency>
```

<hr>

## 📥 Instalação e Execução

<details>
<summary><b>Passo a passo detalhado</b></summary>

### Clonando o Repositório

```bash
git clone https://github.com/seu-usuario/conversor-moedas.git
cd conversor-moedas
```

### Compilando o Projeto

```bash
mvn clean install
```

### Executando a Aplicação

```bash
mvn exec:java -Dexec.mainClass="com.conversor.Main"
```
</details>

<hr>

## 📘 Guia de Uso

<ol>
  <li>Inicie a aplicação conforme as instruções acima</li>
  <li>Selecione a moeda de origem no menu dropdown</li>
  <li>Selecione a moeda de destino no segundo menu dropdown</li>
  <li>Insira o valor a ser convertido no campo de texto</li>
  <li>Clique no botão "Converter"</li>
  <li>O resultado da conversão será exibido na tela com a formatação adequada</li>
</ol>

<hr>

## 💱 Moedas Suportadas

<table>
  <tr>
    <th>Moeda</th>
    <th>Código</th>
    <th>Moeda</th>
    <th>Código</th>
  </tr>
  <tr>
    <td>Real Brasileiro</td>
    <td>BRL</td>
    <td>Dólar Americano</td>
    <td>USD</td>
  </tr>
  <tr>
    <td>Euro</td>
    <td>EUR</td>
    <td>Libra Esterlina</td>
    <td>GBP</td>
  </tr>
  <tr>
    <td>Iene Japonês</td>
    <td>JPY</td>
    <td>Franco Suíço</td>
    <td>CHF</td>
  </tr>
  <tr>
    <td>Dólar Canadense</td>
    <td>CAD</td>
    <td>Dólar Australiano</td>
    <td>AUD</td>
  </tr>
  <tr>
    <td>Yuan Chinês</td>
    <td>CNY</td>
    <td>Peso Mexicano</td>
    <td>MXN</td>
  </tr>
</table>

<p align="center"><i>E muitas outras moedas internacionais...</i></p>

<hr>

## ⚙️ Funcionamento Interno

<div align="center">
  <img src="https://img.shields.io/badge/Gson-Processamento_JSON-00979D" alt="Gson Process"/>
</div>

<br>

O Conversor de Moedas utiliza a biblioteca **Gson** para processar dados de taxas de câmbio armazenados em formato JSON. Quando o usuário solicita uma conversão, a aplicação:

1. **Carrega** o arquivo de taxas de câmbio usando Gson
2. **Interpreta** os dados JSON em objetos Java
3. **Identifica** as taxas das moedas selecionadas
4. **Calcula** a conversão com precisão
5. **Formata** e exibe o resultado para o usuário

<hr>

## 📚 Recursos Adicionais

- [Documentação oficial do Gson](https://github.com/google/gson/blob/master/UserGuide.md)
- [Maven Repository - Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson)

<hr>

## 📝 Licença

Este projeto está licenciado sob a licença [MIT](LICENSE).

<hr>

<p align="center">
  Desenvolvido com ❤️ por <a href="https://github.com/seu-usuario">Seu Nome</a>
</p>
