var firstVehicleName = prompt("Insira o nome do primeiro veículo");
var firstVehicleSpeed = parseFloat(
	prompt("Insira a velocidade do primeiro veiculo"),
);
var secondVehicleName = prompt("Insira o nome do segundo veículo");
var secondVehicleSpeed = parseFloat(
	prompt("Insira a velocidade do segundo veiculo"),
);

if (firstVehicleSpeed > secondVehicleSpeed) {
	alert(`${firstVehicleName} é mais rápido`);
} else if (firstVehicleSpeed < secondVehicleSpeed) {
	alert(`${secondVehicleName} é mais rápido`);
} else {
	alert(`Ambos possuem a mesma velocidade`);
}
