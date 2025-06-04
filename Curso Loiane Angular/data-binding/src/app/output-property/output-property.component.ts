import { Component, EventEmitter, Input, Output, ViewChild, ElementRef } from '@angular/core';

@Component({
  selector: 'app-contador',
  templateUrl: './output-property.component.html',
  styleUrl: './output-property.component.less'
})
export class OutputPropertyComponent {

 @Input() valor = 0;
 @Output() mudouValor = new EventEmitter();
 @ViewChild('campoInput',{static: false}) campoValorInput!: ElementRef;

  incrementa(){
    //console.log(this.campoValorInput.nativeElement.value);
    //this.valor ++;
    this.campoValorInput.nativeElement.value ++;
    this.mudouValor.emit({novoValor: this.valor});
  }

  decrementa(){
    //this.valor --;
    this.campoValorInput.nativeElement.value --;
    this.mudouValor.emit({novoValor: this.valor});
  }


}
