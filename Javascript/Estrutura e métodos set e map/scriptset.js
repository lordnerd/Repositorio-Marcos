const meuArray = [40,40,50,7,288,2077,3080,7];

function valoresUnicos(arr){
    const mySet = new Set(arr);

    return [...mySet];
}

console.log(valoresUnicos(meuArray));