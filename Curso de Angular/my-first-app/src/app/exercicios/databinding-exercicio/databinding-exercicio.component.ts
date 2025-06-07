import { Component } from '@angular/core';

@Component({
  selector: 'app-databinding-exercicio',
  templateUrl: './databinding-exercicio.component.html',
  styleUrls: ['./databinding-exercicio.component.css']
})
export class DatabindingExercicioComponent {

  name: string = '';
  showSecret: boolean;
  showDetailsLog = [];

  isInputNameEmpty(name: String){
    name = this.name;
    name === '' ? true : false
    return !name;
  }

  clearInput(name: string){
    name =  this.name = '';
  }

  onAddToggleDetails(){
    this.showSecret = !this.showSecret;
    this.showDetailsLog.push(new Date());
  }
}
