import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DatabindingExercicioComponent } from './databinding-exercicio.component';

describe('DatabindingExercicioComponent', () => {
  let component: DatabindingExercicioComponent;
  let fixture: ComponentFixture<DatabindingExercicioComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DatabindingExercicioComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DatabindingExercicioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
