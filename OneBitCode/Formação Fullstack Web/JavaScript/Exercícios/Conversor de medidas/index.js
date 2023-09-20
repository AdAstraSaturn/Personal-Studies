const medida = parseFloat(prompt("Insira uma medida em metros"));

const unidade = prompt(
	`
  Selecione a unidade de conversão:
  1. milímetros (mm)
  2. centímetros (cm)
  3. decímetros (dm)
  4. decâmetros (dam)
  5. hectômetros (hm)
  6. quilômetros (km)
  `,
);

switch (unidade) {
	case "1":
		alert("Resultado " + medida * 1000);
		break;
	case "2":
		alert("Resultado " + medida * 100);
		break;
	case "3":
		alert("Resultado " + medida * 10);
		break;
	case "4":
		alert("Resultado " + medida / 10);
		break;
	case "5":
		alert("Resultado " + medida / 100);
		break;
	case "6":
		alert("Resultado " + medida / 1000);
		break;
	default:
		alert("Selecione uma opção válida!");
}
