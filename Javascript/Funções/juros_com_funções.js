function aplicarDesconto(valor, desconto){
    return (valor - (valor * (desconto/100)));
}

function aplicarJuros(valor, juros){
    return(valor + (valor * (juros/100)));
}

let precoEtiqueta = 65;
let formaPagamento = 1;

if(formaPagamento === 1){
    console.log(aplicarDesconto(precoEtiqueta, 10));
}else if(formaPagamento === 2){
    console.log(aplicarDesconto(precoEtiqueta, 15));
}else if(formaPagamento === 3){
    console.log(precoEtiqueta);
}else if(formaPagamento === 4){
    console.log(aplicarJuros(precoEtiqueta, 10));
}else{
    console.log('Opção inválida');
}