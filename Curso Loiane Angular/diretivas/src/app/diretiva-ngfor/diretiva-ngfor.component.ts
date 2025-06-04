import { Component } from '@angular/core';

@Component({
  selector: 'app-diretiva-ngfor',
  templateUrl: './diretiva-ngfor.component.html',
  styleUrl: './diretiva-ngfor.component.less'
})
export class DiretivaNgforComponent {

  cursos: string[] = ['Angular', 'Java', 'Phonegap'];
}
