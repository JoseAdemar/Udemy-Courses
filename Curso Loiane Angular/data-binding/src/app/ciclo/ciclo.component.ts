import {
  AfterContentChecked,
  AfterContentInit,
  AfterViewChecked,
  AfterViewInit,
  Component,
  DoCheck,
  Input,
  OnChanges,
  OnDestroy,
  OnInit,
} from '@angular/core';

@Component({
  selector: 'app-ciclo',
  templateUrl: './ciclo.component.html',
  styleUrl: './ciclo.component.less',
})
export class CicloComponent
  implements
    OnChanges,
    OnInit,
    DoCheck,
    AfterContentInit,
    AfterContentChecked,
    AfterViewInit,
    AfterViewChecked,
    OnDestroy
{
  @Input() valorIncial: number = 10;

  constructor() {
    this.log('constructor');
  }

  ngOnChanges(): void {
    this.log('ngOnChanges');
  }

  ngOnInit(): void {
    this.log('ngOnInit');
  }

  ngDoCheck() {
    this.log('ngDoCheck');
  }

  ngAfterContentInit(): void {
    this.log('AfterContentInit');
  }

  ngAfterContentChecked(): void {
    this.log('AfterContentChecked');
  }

  ngAfterViewInit(): void {
    this.log('AfterViewInit');
  }

  ngAfterViewChecked(): void {
    this.log('AfterViewChecked');
  }

  ngOnDestroy(): void {
    this.log('OnDestroy');
  }

  private log(hook: string) {
    console.log(hook);
  }
}
