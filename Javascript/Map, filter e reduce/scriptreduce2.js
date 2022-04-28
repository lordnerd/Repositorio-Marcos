const lista = [
    {
        name: 'detergente',
        preco: 1.30,
    },
    {
        name: 'Nescau',
        preco: 3,
    },
    {
        name: 'Chinelo',
        preco: 10,
    },
];

const saldoDisponivel = 40;

function calculaSaldo(saldoDisponivel, lista){
    return lista.reduce(function(prev, current, index){
        console.log('rodada', index + 1);
        console.log((prev));
        console.log((current));
        return prev - current .preco;
    },saldoDisponivel);
}

console.log(calculaSaldo(saldoDisponivel, lista));