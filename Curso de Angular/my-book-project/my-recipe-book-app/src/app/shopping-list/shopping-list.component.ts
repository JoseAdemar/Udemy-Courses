import { Component } from '@angular/core';
import { Ingredient } from '../shared/ingredient.model';

@Component({
  selector: 'app-shopping-list',
  templateUrl: './shopping-list.component.html',
  styleUrls: ['./shopping-list.component.css']
})
export class ShoppingListComponent {
  ingredients: Ingredient[] = [
    new Ingredient("Apple",5),
    new Ingredient("Tomatoes",10),
  ];
  constructor(){

  }
  ngOnInit(){

  }
}
