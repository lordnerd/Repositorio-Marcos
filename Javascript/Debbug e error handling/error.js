function validaArray(arr, num){
    try{
        if(!arr && !num) throw new ReferenceError("Envie os parâmetros");

        if(typeof arr !== 'object') throw new TypeError("O Array tem que ser do tipo object");

        if(typeof num !== 'number') throw new TypeError("O Num tem que ser do tipo number");

        if(arr.lenght !== 'num' ) throw new RangeError("O tamanho inserido não consta com o tamanho da Array");
        
        return arr;
    }
catch(e){
    if(e instanceof ReferenceError){
        console.log('Este é um ReferenceError');
        console.log(e .message)
    } else if(e instanceof TypeError){
        console.log('Este é um TypeError');
        console.log(e .message)
    }else if(e instanceof RangeError){
        console.log('Este é um RangeError');
        console.log(e .message)
    }else{
        console.log('Erro inesperado: ' + e);
    }
}
}

console.log(validaArray());