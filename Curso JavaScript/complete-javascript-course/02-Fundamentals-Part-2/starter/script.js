"use strict";

/*
let hasDriersLicense = false;
const passTest = true;

if(passTest){
    hasDriersLicense = true;
}

if(hasDriersLicense){
    console.log('I can drive :D');
}

//const interface = 'Audio';
//const private = 534;
*/

/*
function logger(){
    console.log('My name is José');
}

logger();
logger();

function fruitProcessor(applesQuantity, orangesQuantity){
    console.log(applesQuantity,orangesQuantity);
    const juice = `Juice with ${applesQuantity} apples and ${orangesQuantity} oranges.`
    return juice;
}

fruitProcessor(5,0)

const appleJuice = fruitProcessor(5,0);
console.log(appleJuice);

const appleOrange = fruitProcessor(2,4);
console.log(appleOrange);

const num = Number('23'); // a função Number converte a string para número.
console.log(num);
*/

/*
//Function declaration
function calcAge1(birthYear){
    return 2037 - birthYear;
}

const age1 = calcAge1(1991);
console.log(age1);

//Function expression
const calAge2 = function(birthYear){
    return 2037 - birthYear;
}
const age2 = calAge2(1991);
console.log(age2);
*/

/* Qual a diferença entre função de declaração e função de expressão ?
   A diferença é que na função de declaração eu posso chamar a função antes dela
   já na função de expressão eu tenho que chamar depois dela.
*/

// Em arow function o que tem antes da arow seria os parametros do método a arow é o que
// se espera de ReadableByteStreamController.
/*
const calAge3 = birthYear => 2037 - birthYear;
const age3 = calAge3(1991);
console.log(" A idade é " + age3);
console.log(" A idade é " + calAge3(1990));

// Quando eu tenho mais de dois parametros em uma arow function eu deixo eles entre parenteses
const yearsUntilRetirement = (birthYear,firstName) => {
    const currentYear = new Date().getFullYear();
    const age = currentYear - birthYear;
    const retirement = 65 - age;
    return (`${firstName} retires in ${retirement} years`);
}

console.log(yearsUntilRetirement (1990,'JUNIOR'));
console.log(yearsUntilRetirement(1988,'MARIA'));
*/

/*
function cutFruitPieces(fruit){
    return fruit * 4;
}

function fruitProcessor(apples, oranges){
    const applePieces = cutFruitPieces(apples);
    const orangePieces = cutFruitPieces(oranges);

    const juice = `Juice with  ${applePieces} piece of apple and ${orangePieces} pieces of orange.`;
    return juice;
}

console.log(fruitProcessor(2,3));
*/

/*
const calAge = function(birthYear){
    return 2037 - birthYear;
}

const yearsUntilRetirement = function(birthYear,firstName){
    const age = calAge(birthYear);
    const retirement = 65-age;

    if(retirement > 0){
        console.log(`${firstName} retires in ${retirement} years`);
        return retirement;
    }else{
        console.log(`${firstName} has already retired 🤩`);
        return -1;
    }

}

console.log(yearsUntilRetirement(1991, 'Junior'));
console.log(yearsUntilRetirement(1950, 'Mike'));
*/

/* Write your code below. Good luck! 🙂 */

/*const calcAverage = (score1,score2,score3) =>{
    let average = (score1 + score2 + score3) / 3;
    return average;
}

let scoreDolphins = calcAverage(44, 23, 71);
let scoreKoalas = calcAverage(65, 54, 49);

const checkWinner  = function(avgDolphins , avgKoalas){
      let result = (avgDolphins - avgKoalas);
      if(result > 0 && result >= avgKoalas){
        console.log("Dolphins win (" + avgDolphins + " vs. " + avgKoalas);
      }else{
        result = (avgKoalas - avgDolphins);
        if(result > 0 && result >= avgDolphins){
            console.log("Koalas win (" + avgKoalas + " vs. " + avgDolphins);
          }else{
            console.log('No team wins...');
          }
      }
}

checkWinner(scoreDolphins,scoreKoalas);
checkWinner(576,111); */

/*
const calcAverage = (score1,score2,score3) => {
    let average = (score1 + score2 + score3) / 3;
    return average;
}

let scoreDolphins = calcAverage(44, 23, 71);
let scoreKoalas = calcAverage(65, 54, 49);

const checkWinner  = function(avgDolphins , avgKoalas){
      if(avgDolphins >=  avgKoalas * 2){
        console.log("Dolphins win 🏆 (" + avgDolphins + " vs. " + avgKoalas +")");
      }else if(avgKoalas >=  avgDolphins * 2){
            console.log("Koalas win 🏆 (" + avgKoalas + " vs. " + avgDolphins +")");
          }else{
            console.log('No team wins...');
          }
      }


checkWinner(scoreDolphins,scoreKoalas);
checkWinner(576,111);

scoreDolphins = calcAverage(85, 54, 41);
scoreKoalas = calcAverage(23, 34, 27);

checkWinner(scoreDolphins,scoreKoalas);
*/

/*const friends = ['Michael','Steven','Peter'];
console.log(friends.length);
console.log(friends[0]);

const year = new Array(1991, 1984, 2008, 2020);
console.log(year[0]);

// Exercice

const calAge = function(birthYeah){
    return 2037 - birthYeah;
}

const years = [1990, 1967, 2002, 2010, 2018];

const age1 = calAge(years[0]);
const age2 = calAge(years[1]);
const age3 = calAge(years[years.length - 1]);

console.log(age1,age2,age3);

const ages = [calAge(years[0]), calAge(years[1]), calAge(years[years.length - 1])];
console.log(ages);*/

// Adiciona elementos
/*
const friends = ['Michael', 'Steven', 'Peter'];
friends.push('Jey');
console.log(friends);
friends.unshift('Jonh');
console.log(friends);

// Remove elementos

friends.pop(); //Remove o ultimo elemento do array
console.log(friends);

friends.shift(); //Remove o primeiro elemento do array
console.log(friends);

console.log(friends.indexOf('Steven')); //pega a posição do array para Steven
console.log(friends.includes('Steven'));
console.log(friends.includes('José')); //Includes verifica se o elemento está ou não no array como um boleano.

if (friends.includes('Peter')) {
    console.log('Você tem um amigo chamado Peter');
}
*/
/*
const calTip1 = bill => bill >= 50 && bill <= 300 ? bill * 0.15 : bill * 0.2;

const calTip2 = (bill) => {
    return bill >= 50 && bill <= 300 ? bill * 0.15 : bill * 0.2;
};

const calTip = function (bill) {
    return bill >= 50 && bill <= 300 ? bill * 0.15 : bill * 0.2;
}

const bills = [125, 555, 44];
const tips = [calTip(bills[0]), calTip(bills[1]), calTip(bills[2])];
console.log(bills, tips);

const totals = [bills[0] + tips[0], bills[1] + tips[1], bills[2] + tips[2]];
console.log(totals);
*/

/*
const junior = {
    firstName: "José",
    lastName: "Junior",
    age: 2023 - 1990,
    job: "Developer",
    friends: ["Michael", "Peter", "Steven"],
};

console.log(junior.firName, "age =", junior.age, junior.friends);

junior.firstName = "Pedro";

console.log(junior.firName, "age =", junior.age, junior.friends);

console.log("#############################################");
console.log(junior);
console.log(junior["firName"]);
console.log("=========================================================");

const interestedIn = prompt(
    "What do you want to know about Junior ? Choose between firstName, lastName, age, job, and friends"
);

if (junior[interestedIn]) {
    console.log(junior[interestedIn]);
} else {
    console.log(" Wrong request!! What do you want to know about Junior ? Choose between firName, lastName, age, job, and friends");
}

console.log('##############################################');


const showMessage = function () {
    console.log(`${junior.firstName} has ${junior.friends.length} , and his best friend is called ${junior.friends[0]}`)
}

const bestFriend = prompt('What is Junior best friend ?');

if (junior[bestFriend]) {
    if (junior.firstName == 'Pedro') {
        showMessage();
    }

}
*/

/*
const junior = {
    firstName: "José",
    lastName: "Junior",
    birthYear: 1990,
    job: "Developer",
    friends: ["Michael", "Peter", "Steven"],
    hasDriversLicense: true,
    //calcAge: function (birthYeah) {
    //return 2037 - birthYeah;
    //}
    //calcAge: function () {
    //console.log(this);
    //return 2037 - this.birthYear;
    //}

    calcAge: function () {
        this.age = 2037 - this.birthYear;
        return this.age;
    },

    getSummary: function () {
        this.hasDriversLicense = true;
        /*if (this.hasDriversLicense) {
                return this.message = `${junior.firstName} is a ${junior.calcAge()} old teacheer, and he has a driver's licence`;
            } else {
                return this.message = `${junior.firstName} is a ${junior.calcAge()} old teacheer, and he does not have a driver's licence`;
            }*/

// return (this.message = `${junior.firstName} is a 
//${junior.calcAge()} old teacheer, and he has 
//${this.hasDriversLicense ? "a" : "no"
//  } driver's licence`);
//},
//};

/*
console.log(junior.calcAge());
console.log(junior.age);
console.log("####################################");
console.log(junior.getSummary());
console.log(junior.message);
//console.log(junior['calcAge']());

*/


/*

const mark = {
    fullName: 'Mark Miller',
    mass: 78,
    height: 1.69,
    calcBMI: function () {
        this.bmi = this.mass / (this.height * this.height);
        return this.bmi.toFixed(2);
    },
};

const John = {
    fullName: 'John Smith',
    mass: 92,
    height: 1.95,
    calcBMI: function () {
        this.bmi = this.mass / (this.height * this.height);
        return this.bmi.toFixed(2);
    },
};

if (mark.calcBMI() > John.calcBMI()) {
    console.log(mark.fullName + "'s " + 'BMI (' + mark.bmi.toFixed(2) + ')' + ' is higher than ' + John.fullName + "'s " + 'BMI (' + John.bmi.toFixed(2) + ') ');
} else {
    console.log(John.fullName + "'s " + 'BMI (' + John.bmi.toFixed(2) + ') ' + ' is higher than ' + mark.fullName + '(' + mark.bmi.toFixed(2) + ')');
}

//console.log(mark.calcBMI() > John.calcBMI() ? mark.fullName + "'s " + 'BMI (' + mark.bmi.toFixed(2) + ')' + ' is higher than ' + John.fullName + "'s " + 'BMI (' + John.bmi.toFixed(2) + ') ' :
//John.fullName + "'s " + 'BMI (' + John.bmi.toFixed(2) + ') ' + ' is higher than ' + mark.fullName + '(' + mark.bmi.toFixed(2) + ')');

*/

/*
for (let i = 1; i <= 10; i++) {
    console.log('Lifting weights repetition' + i + ' 🏋️‍♂️');
}
*/

/*
const types = [];

const jonas = ['Jonas', 'Schmedtmann', 2037 - 1991, 'teacher', ['Michael', 'Peter', 'Steven'], true];

for (let i = 0; jonas.length > i; i++) {
    console.log(jonas[i], typeof jonas[i]);
    //types.push(typeof jonas[i]);
    types[i] = typeof jonas[i];
}

console.log(types);


const years = [1991, 2007, 1969, 2020];
const ages = [];

for (let i = 0; i < years.length; i++) {
    //ages[i] = 2037 - years[i];
    ages.push(2037 - years[i]);

}

console.log(ages);

// continue and break

console.log('-------ONLY STRINGS--------------');
for (let i = 0; i < jonas.length; i++) {
    if (typeof jonas[i] !== 'string') continue;
    console.log(jonas[i], typeof jonas[i]);
    types[i] = typeof jonas[i];
}

console.log('-------BREAK WITH NUMBER--------------');
for (let i = 0; i < jonas.length; i++) {
    if (typeof jonas[i] === 'number') break;
    console.log(jonas[i], typeof jonas[i]);
    types[i] = typeof jonas[i];
}
*/

/*const jonas = ['Jonas', 'Schmedtmann', 2037 - 1991, 'teacher', ['Michael', 'Peter', 'Steven'], true];

for (let i = jonas.length - 1; i >= 0; i--) {
    console.log(i, jonas[i]);
}*/

/*
for (let exercice = 1; exercice < 4; exercice++) {
    console.log(`-------Starting exercice  ${exercice}`);
    for (let rep = 1; rep < 6; rep++) {
        console.log(`Exercice ${exercice}: Lifting weight repetition ${rep} 🏋️‍♂️`);
    }
}*/

/*
let dice = Math.trunc(Math.random() * 6) + 1;

while (dice !== 6) {
    console.log(`you rolled a ${dice}`);
    dice = Math.trunc(Math.random() * 6) + 1;
    if (dice == 6) {
        console.log('Loop ended with ' + dice);
    }
}
*/

/*
const calcTip = function (bill) {
    return bill >= 50 && bill <= 300 ? bill * 0.15 : bill * 0.2;
}

let bills = [22, 295, 176, 440, 37, 105, 10, 1100, 86, 52];

let tips = [];
let totals = [];

for (let i = 0; i < bills.length; i++) {
    const tip = calcTip(bills[1]);
    tips.push(tip);
    totals.push(tip + bills[i]);

    console.log(bills, tips, totals);
}

*/

const calcAverage = function (arr) {
    let sum = 0;
    for (let i = 0; i < arr.length; i++) {
        sum += arr[i];
    }

    return sum / arr.length;
}

console.log(calcAverage([2, 3, 7]));




