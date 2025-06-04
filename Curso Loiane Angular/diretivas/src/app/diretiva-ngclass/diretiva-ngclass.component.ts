import { Component, OnChanges, OnInit, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-diretiva-ngclass',
  templateUrl: './diretiva-ngclass.component.html',
  styleUrl: './diretiva-ngclass.component.less',
})
export class DiretivaNgclassComponent implements OnInit {
  darLike1: boolean = false;
  darLike2: boolean = false;
  darLike3: boolean = false;

  ngOnInit(): void {}

  onClick1() {
    if ((this.darLike1 === true && this.darLike2 === true) || this.darLike3 === true) {
      this.darLike1 = true;
    } else {
      this.darLike1 = !this.darLike1;
    }
  }

  onClick2() {
    if (this.darLike1 === true && this.darLike2 === true && this.darLike3 === true) {
      this.darLike2 = true;
    } else if (this.darLike1 === false ) {
      this.darLike2 = false;
    }else{
      this.darLike2 = !this.darLike2;
    }
  }

  onClick3() {
    if (this.darLike1 === true && this.darLike2 === true) {
      this.darLike3 = !this.darLike3;
    }
  }
}
