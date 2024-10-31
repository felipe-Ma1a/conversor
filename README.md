# Conversor de Moeda

Este projeto é um conversor de moeda que utiliza a Exchange Rate API para obter as taxas de câmbio em tempo real. O objetivo é permitir a conversão de valores entre diferentes moedas de forma simples e rápida.

### Tecnologias Utilizadas

Este projeto foi desenvolvido utilizando as seguintes tecnologias:

* Java
* Exchange Rate API (para obter as taxas de câmbio)
* Biblioteca Gson (para manipulação de JSON)
* HttpClient do Java (para fazer requisições HTTP)

## Dependências e Versões Necessárias

As dependências e versões utilizadas no projeto são:

* Java JDK 11 ou superior
* Biblioteca Gson - Versão: 2.8.x

## Como rodar o projeto ✅

Para rodar o projeto, siga os passos abaixo:

1. Clone o repositório:
```
git clone https://github.com/seu-usuario/conversor-moeda.git
```

2. Adicione sua chave de API:

* Crie uma conta na Exchange Rate API e obtenha uma chave de API.
* No terminal, defina a variável de ambiente com sua chave de API:

```
export EXCHANGE_RATE_API_KEY="sua-chave-aqui"
```

3. Compile o projeto:

```
javac ConversorMoeda.java
```

4. Execute o projeto:

```
java ConversorMoeda
```

## 📌 Informações importantes sobre a aplicação

Este projeto utiliza a Exchange Rate API para buscar as taxas de câmbio em tempo real. Certifique-se de ter uma conexão ativa com a internet ao executar a aplicação.

### Endpoints da API

Para converter valores, a aplicação utiliza o endpoint /latest/ da API, que retorna as taxas de câmbio para a moeda de origem especificada. É possível configurar a moeda de origem e a moeda de destino diretamente na execução da aplicação.


## ⚠️ Problemas enfrentados

### Problema 1: Erro na requisição para a API de câmbio
Descrição: O projeto apresentou um erro ao tentar obter as taxas de câmbio, devido à ausência de uma chave de API válida.

Como solucionar: Certifique-se de que a variável de ambiente EXCHANGE_RATE_API_KEY está configurada corretamente no seu sistema. Verifique também se você não ultrapassou o limite de requisições da API.

### Problema 2: Moeda não suportada
Descrição: A API retornou um erro informando que a moeda especificada não é suportada.

Como solucionar: Verifique se as moedas de origem e destino estão corretas e suportadas pela API. Consulte a documentação da API para obter uma lista de moedas válidas.

## ⏭️ Próximos passos

* Implementar uma interface gráfica para facilitar a interação com o usuário.
* Adicionar suporte para múltiplas APIs de câmbio para maior precisão e redundância.
* Implementar testes unitários mais abrangentes para verificar a robustez da aplicação.