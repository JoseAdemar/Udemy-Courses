import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrl: './data-binding.component.less'
})
export class DataBindingComponent implements OnInit{
   
    url = "http:loiane.trainning.com.br";
    cursoAngular = true;
    imgCarro = "https://cdn.motor1.com/images/mgl/AkB8vL/s3/fiat-mobi-2023.jpg";
    valorAtual = 'AB';
    valorSalvo = '';
    isMouseOver = false;
    public nome: string = 'ABC';

    nomeDoCurso = 'Angular';
    valorInicial = 15;
    valorVindoDoEvento: string = '';

    ngOnInit(): void {
      console.log('Chamou construtor PAI')
    }

    capturarNomeChange(novoNome: any){
     this.valorVindoDoEvento = novoNome;
    }

    onMudouValor(evento: any){
      console.log(evento.novoValor);
    }


    getValor(): number{
      return 10;
    }

    getCurtir(){
      return true;
    }

    botaoClicado(){
      alert('Botão clicado!');
    }

    onKeyUp(evento: KeyboardEvent){
      this.valorAtual = ((<HTMLInputElement>evento.target).value);
      
    }

    salvarValor(valor: any){
      this.valorSalvo = valor.target.value;
    }

    onMouseOverOut(){
      this.isMouseOver = !this.isMouseOver;
    }

    getNome(nome: any){
      this.nome = nome.target.value;
    }
}
