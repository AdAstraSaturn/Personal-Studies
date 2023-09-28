let primeiroNumero = 1;
let segundoNumero = 4;

console.log(primeiroNumero + segundoNumero); // Soma
console.log(primeiroNumero - segundoNumero); // Subtração
console.log(primeiroNumero * segundoNumero); // Multiplicação
console.log(primeiroNumero / segundoNumero); // Divisão
console.log(primeiroNumero % segundoNumero); // Resto da divisão

console.log(
	((primeiroNumero + segundoNumero) / primeiroNumero) * segundoNumero,
);

let variavel = "Olá, Mundo!";
variavel = "Olá";
variavel += ", Mundo!";
console.log(variavel);

function contarAteDez() {
	let contagem = 0;
	for (let index = 0; index <= 10; index++) {
		contagem += index;
		console.log(contagem);
	}
}

contarAteDez();
