import {
	Component,
	OnInit,
	DoCheck,
	AfterContentChecked,
	AfterContentInit,
	AfterViewChecked,
	AfterViewInit,
	OnDestroy
} from '@angular/core';

@Component({
  selector: 'app-check-sample',
  templateUrl: './check-sample.component.html',
  styleUrls: ['./check-sample.component.css']
})
export class CheckSampleComponent implements OnInit,
																							DoCheck,
																							AfterContentChecked,
																							AfterContentInit,
																							AfterViewChecked,
																							AfterViewInit,
																							OnDestroy {

	quantidade:number = 0

  constructor() {
		console.log("Constructor")
	}

	incrementar(){
		this.quantidade += 1
	}

	decrementar(){
		this.quantidade -= 1
	}

	//checked -> content -> view

	//quando o primeiro conteúdo é iniciado
	ngAfterContentInit(): void {
		console.log("AfterContentInit")
	}

	//depois da inicialização da view
	ngAfterViewInit(): void {
		console.log("AfterViewInit")
	}

	//após alguma alteração, verifica o conteúdo
	ngAfterContentChecked(): void {
		console.log("AfterContentChecked")
	}

	//após alguma alteração, verifica a view
	ngAfterViewChecked(): void {
		console.log("AfterViewChecked")
	}
	ngDoCheck(): void {
		console.log("DoChecked")
	}
	ngOnInit(): void {
		console.log("OnInit")
  }
	ngOnDestroy(): void {
		console.log("Adeus mundo cruel!")
	}

}
