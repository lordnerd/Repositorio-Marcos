const precoCombustivel = 5.25;
const distanciaKm = 340;
const kmPorLitro = 10;

const consumoViagem = distanciaKm / kmPorLitro;
const precoViagem = consumoViagem * precoCombustivel;

console.log(precoViagem.toFixed(2));




