## Desafio Proposto

1. Criar o projeto `contaBanco` que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo.
2. Dentro do projeto, crie a classe [ContaTerminal.java] para realizar toda a codificação do nosso programa.

### Regras de Declaração de Variáveis

| **ATRIBUTO**    | **TIPO** | **EXEMPLO**   |
| --------------- | -------- | ------------- |
| Número          | Inteiro  | 1021          |
| Agência         | Texto    | 067-8         |
| Nome do Cliente | Texto    | MARIO ANDRADE |
| Saldo           | Decimal  | 237.48        |

### Inserção de Dados via Terminal

1. Permita que os dados sejam inseridos via terminal, onde o usuário receberá a mensagem sobre qual informação será solicitada, por exemplo:
    - Programa: "Por favor, digite o número da Agência: ".
    - Usuário: 1021 (Pressione ENTER para o próximo campo).

### Concatenação e Classe String com Método Concat

1. Após a inserção de todas as informações, o sistema deverá exibir a seguinte mensagem:

"Olá [Nome do Cliente], obrigado por criar uma conta em nosso banco. Sua agência é [Agência], conta [Número], e seu saldo [Saldo] já está disponível para saque."
