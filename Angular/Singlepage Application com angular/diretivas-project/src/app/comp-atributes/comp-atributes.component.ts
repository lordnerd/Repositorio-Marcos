import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-comp-atributes',
  templateUrl: './comp-atributes.component.html',
  styleUrls: ['./comp-atributes.component.css']
})
export class CompAtributesComponent implements OnInit {
	estilo:string = "disable"
	corFundo:string = "red"
	corDaFonte:string = "green"
	item:string = ""
	lista:string[] = []
	isEnableBlock:boolean = true

	adicionarLista(){
		this.lista.push(this.item)
	}

  constructor() { }

  ngOnInit(): void {
  }

	trocar(){
		if(this.estilo == "disable"){
			this.estilo = "enable"
		}else{
			this.estilo = "disable"
		}
	}

}
