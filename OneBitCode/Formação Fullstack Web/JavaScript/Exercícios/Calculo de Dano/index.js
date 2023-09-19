var primeiroPersonagem = {
	nome: "",
	poderDeAtaque: 0,
	pontosDeVida: 0,
	poderDeDefesa: 0,
	possuiEscudo: false,
};

var segundoPersonagem = {
	nome: "",
	poderDeAtaque: 0,
	pontosDeVida: 0,
	poderDeDefesa: 0,
};

primeiroPersonagem.nome = prompt("Insira o nome do primeiro personagem");
primeiroPersonagem.poderDeAtaque = parseFloat(
	prompt("Insira o poder de ataque do primeiro personagem"),
);
primeiroPersonagem.pontosDeVida = parseFloat(
	prompt("Insira a quantidade de pontos de vida do primeiro personagem"),
);
primeiroPersonagem.poderDeDefesa = parseFloat(
	prompt("Insira o poder de defesa do primeiro personagem"),
);

segundoPersonagem.nome = prompt("Insira o nome do segundo personagem");
segundoPersonagem.poderDeAtaque = parseFloat(
	prompt("Insira o poder de ataque do segundo personagem"),
);
segundoPersonagem.pontosDeVida = parseFloat(
	prompt("Insira a quantidade de pontos de vida do segundo personagem"),
);
segundoPersonagem.poderDeDefesa = parseFloat(
	prompt("Insira o poder de defesa do segundo personagem"),
);

if (primeiroPersonagem.poderDeAtaque > segundoPersonagem.poderDeDefesa) {
	let diferenca =
		primeiroPersonagem.poderDeAtaque - segundoPersonagem.poderDeDefesa;
	segundoPersonagem.pontosDeVida -= diferenca;
	alert(`Causou ${diferenca} de dano`);
} else {
	alert("Causou 0 de Dano");
}
