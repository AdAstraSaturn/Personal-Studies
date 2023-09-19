# Estruturas Condicionais if e else

-   Permite criar blocos de código que só executarão se uma determinada operação lógica for verdadeira.
-   SE condição === true (faça algo).
-   Além disso, pode ser usado com o ELSE, para acrescentar um bloco que só executa quando a operação lógica for falsa.
-   SE condição === true (faça algo) SE não (faça outra coisa).

## Exemplo de syntax

```javascript
if (condição) {
	//...
} else {
	//...
}
```

## Exemplo prático

```javascript
if (!userLoggedIn) {
	console.warn(
		"The user currently is not logged in or doesn't have an access token avaliable",
	);
	user.preventAccess();
	let userHasToken = user.verifyLoginToken();
	if (userHasToken == true) {
		stools.saveToLocalStorage(user.token);
	} else {
		user.blockAccess();
	}
}
```

## Operador Ternário

-   É uma forma abreviada e autoavaliada do IF ELSE
-   Exemplo:
    -   ```javascript
        const result = condition ? case_true : case_false;
        ```
