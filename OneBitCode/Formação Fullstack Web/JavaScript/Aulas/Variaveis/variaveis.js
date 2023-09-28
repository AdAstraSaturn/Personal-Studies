var nome = "var nome"; // Se não me engano, var é usado mais no escopo global do código, já o let, é mais usado em escopos locais como em "for (let index = 0; ...)"

let idade; // Podemos criar variáveis sem valor também, que são do tipo 'undefined'

idade = 21;

let nomeDois = "var nomeDois";

const CONSTANTE = "String"; // const = valor constante, valores que não mudam.

try {
	CONSTANTE = "abc";
} catch {
	(err) => {
		throw new Error(err);
	};
}
