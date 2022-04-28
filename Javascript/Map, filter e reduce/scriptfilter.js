function filterPares(arr){
    return arr .filter(callback)
}

function callback(item){
    return item % 2 !== 0;
}

const meuArray = [23, 77, 9, 8, 22 , 40];

console.log(filterPares(meuArray));