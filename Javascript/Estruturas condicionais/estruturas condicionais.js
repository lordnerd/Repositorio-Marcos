const precoGasolina = 5.25;
const precoEtanol = 3.43;
const distanciaKm = 340;
const kmPorLitro = 10;
const tipoCombustivel = 'Gasolina';

const consumoViagem = distanciaKm / kmPorLitro;
let precoViagem

if(tipoCombustivel === 'Etanol'){
    precoViagem = consumoViagem * precoEtanol;
    console.log(precoViagem.toFixed(2));
}else if(tipoCombustivel === 'Gasolina'){
    precoViagem = consumoViagem * precoGasolina;
    console.log(precoViagem.toFixed(2));
}else{
    console.log('Tipo de combustível não encontrado');
}





