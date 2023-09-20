# Estruturas condicionais SWITCH

-   Permite criar blocos condicionais como o IF, porém com uma estrutura que avalia uma expressão e testa o resultado contra vários casos, executando os casos correspondentes.
-   É possível definir um caso padrão, que sempre é executado.
-   Também é possível parar a execução após algum dos casos.
-   Exemplo:
    -   ```javascript
        switch (expressão) {
        	case "a":
        	//...
        	case "b":
        	//...
        	case "c":
        		//...
        		break;
        	default:
        	//...
        }
        ```
