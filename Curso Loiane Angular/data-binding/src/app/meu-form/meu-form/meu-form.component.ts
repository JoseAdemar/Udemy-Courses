import { Component } from '@angular/core';

@Component({
  selector: 'app-meu-form',
  templateUrl: './meu-form.component.html',
  styleUrl: './meu-form.component.less'
})
export class MeuFormComponent {

  public nome: string = 'ABC';

  getNome(nome: any){
    this.nome = nome.target.value;
  }
}
