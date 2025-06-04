import { Component, Input, OnInit, Output, EventEmitter } from '@angular/core';


@Component({
  selector: 'app-curso',
  templateUrl: './input-property.component.html',
  styleUrl: './input-property.component.less'
})
export class InputPropertyComponent implements OnInit{
 
 @Input() nome: string = "";
 @Output() nomeChange: EventEmitter<string> = new EventEmitter<string>();

 emitirNomeChange(){
  this.nomeChange.emit(this.nome);
 }

 ngOnInit(): void {
  console.log('Chamou construtor FILHO');
}
}
