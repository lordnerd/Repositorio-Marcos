class Carros{
    marca;
    cor;
    gastoMedioKm;

    constructor(marca, cor, gastoMedioKm){
        this.marca = marca;
        this.cor = cor;
        this.gastoMedioKm = gastoMedioKm; 
    }

    calcularGastoPercurso(distanciaKm, precoCombustível){
        return distanciaKm * this.gastoMedioKm * precoCombustível;
    }
}

const celta = new Carros('Chevrolet', 'Preto', 1/22);
console.log(celta.calcularGastoPercurso(45, 10));

const gallardo = new Carros('Lamborghini', 'Laranja', 1/12);
console.log(gallardo.calcularGastoPercurso(45, 10));
