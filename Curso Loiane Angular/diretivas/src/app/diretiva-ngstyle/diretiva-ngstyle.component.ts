import { Component } from '@angular/core';

@Component({
  selector: 'app-diretiva-ngstyle',
  templateUrl: './diretiva-ngstyle.component.html',
  styleUrl: './diretiva-ngstyle.component.less'
})
export class DiretivaNgstyleComponent {

  ativo: boolean = false;
  tamanhoDaFonte: number = 10;

  mudarAtivo(){
    this.ativo = !this.ativo;
  }
}
