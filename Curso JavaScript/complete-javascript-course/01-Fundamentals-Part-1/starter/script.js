/*
let js = 'Amazing';
console.log(40 + 8 + 23 - 10);

console.log('Junior');
console.log(23);

let firstName = 'Junior';
console.log(firstName);
console.log(firstName);
console.log(firstName);

// Variable name convention

let PI = 3.1415;

let myFirstJob = 'Programmer';
let myCureentJob = 'Teacher';

let job1 = "Programmer";
let job2 = "Teacher";

let javaScriptIsFun = true
console.log( typeof javaScriptIsFun);
console.log(typeof true);
console.log(typeof 23);
console.log(typeof 'Junior');

javaScriptIsFun = 'Yes!';

let year;
console.log(year);
console.log(typeof year);

console.log(typeof null);

let test = "";
console.log(typeof test);
*/
/*
let age = 30;
age = 32;

const birthYear = 1990;
// birthYear = 1990; I can't do that because it's a constant
// const job; I can't do that because a constant must be inicialized

lastName = 'Oliveira';  // This is possible to declare an atribute from a variable without declare the type
console.log(lastName);
*/
/*
const now = 2037;
const ageJonas = now - 1991;
const ageSarah = now - 2018;
console.log(ageJonas, ageSarah);

console.log(ageJonas * 2, ageJonas / 10, 2 ** 3);

const firstName = "José";
const lastName = "Junior";
console.log(firstName + " " + lastName);

let x = 10 + 5;
x += 10;
x*= 4;
x++;
x--;
x--;
console.log(x);

console.log(ageSarah > ageJonas);
console.log(ageSarah >= 18);

console.log(now - 1991 > now - 2018);
*/

/*
const now = 2037;
const ageJonas = now - 1991;
const ageSarah = now - 2018;

console.log(now - 1991 > now - 2018);

let x, y;
x = y = 25 - 10 -5;
console.log(x,y);

const averageAge = (ageJonas + ageSarah) / 2;
console.log('age = ' + ageJonas, 'age = ' + ageSarah, 'average = ' + averageAge);
*/

//EXERCICE

/*
let markMass = 78;
let markHeight = 1.69;

let JohnMass = 92;
let johnHeight = 1.95;

const BMIMARK = markMass / markHeight  ** 2;
const BMIJOHN = JohnMass / johnHeight ** 2;
console.log(BMIMARK,BMIJOHN)

let markHigherBMI = BMIMARK > BMIJOHN;
console.log(markHigherBMI);
*/
/*
const firstName = 'Junior';
const job = 'Developer';
const birthYear = 1990;
const year = 2037;

const junior = "I'm" + firstName + " a " + (year - birthYear) + " years old " + job + " ! ";
console.log(junior);

const junior2 = `I'm ${firstName}, a ${year - birthYear}  years old ${job}! `;
                console.log(junior2);

*/

/*
const age = 15;

if(age >= 18){
    console.log('Sarah can start driving license 🚗');
}else{
    const yearsLeft = 18 - age;
    console.log(`Sarah can not driving she is to young .
     Wait another ${yearsLeft} years 😧`);
}


let markMass = 78;
let markHeight = 1.69;

let JohnMass = 120;
let johnHeight = 1.95;

const BMIMARK = markMass / markHeight  ** 2;
const BMIJOHN = JohnMass / johnHeight ** 2;

if(BMIMARK > BMIJOHN){
    console.log(`Mark has the BMI bigger than Jhon
                 the BMI of Mark is:  ${BMIMARK}`)
}else{
    console.log(`Jhon has the BMI bigger than Mark
                 the BMI of Jhon is:  ${BMIJOHN}`)
}
console.log(BMIMARK,BMIJOHN);

*/

// Convertion and coersion
// NaN é a number porém um tipo de número invalido

/*
const inputYear = '1991';
console.log(Number(inputYear), inputYear);  //Convertendo string para numero

console.log(Number(inputYear) + 18);

valor = 23;
console.log(String(valor) + 1); //Convertendo número para string

console.log('23' - '10' - 3); //Quando temos string com o operador de menos as strings é convertida em número e a subtração é realizada.
*/

// 5 tipos falso do javascript
// valores:  0, '', undefined, null, NaN

/*
console.log(Boolean(0))
console.log(Boolean(undefined))
console.log(Boolean('Jonas'))
console.log(Boolean({}))
console.log(Boolean(''))

const money = 0;
if(money){
    console.log("Don't spend it all");
}else{
    console.log("You should get a job");
}

let height;
if(height){
    console.log("yay! height is defined");
}else{
    console.log("height is undefined");
}
*/

/*
const age = 18;
if(age === 18){
    console.log('You just became an adult')
}

const age2 = '18';
if(age2 === 18){
   console.log('You just became an adult')
}else{
    console.log('You still not an adult')
}

const age3 = '18';
if(age3 == 18){
    console.log('You just became an adult')
 }else{
     console.log('You still not an adult')
 }

 let favourite = prompt("what's your favourite number ?");

 if(Number(favourite) === 7){
    console.log(`Coll! ${favourite} is an amazing number!`)
 }
*/

/*
let scoreDolphins1 = 101;
let scoreDolphins2 = 100;
let scoreDolphins3 = 100;
let scoreDolphins =  (scoreDolphins1 + scoreDolphins2 + scoreDolphins3) / 3;


let scoreKoalas1 = 100;
let scoreKoalas2 = 100;
let scoreKoalas3 = 100;
let scoreKoalas = (scoreKoalas1 + scoreKoalas2 + scoreKoalas3) / 3;

console.log(scoreDolphins, scoreKoalas);

if(scoreDolphins == scoreKoalas){
    console.log("Both win the trophy");
    console.log('score = ' + scoreDolphins);
    console.log('score = ' + scoreKoalas)
}else if(scoreDolphins > scoreKoalas){
    console.log('Dolphins win the trophy');
    console.log('score = ' + scoreDolphins);
}else{
    console.log("Koalas win the trophy");
    console.log('score = ' + scoreKoalas);
}

*/


//switch no javaScript

/*
const day = 'saturday';

switch(day){
    case 'monday':
        console.log('Plan course structure');
        console.log('Go to code meetup');
        break;
    case 'tuesday':
        console.log('Prepare theory videos');
        break;
    case 'wednesday':
        console.log('Write code examples');
        break;
    case 'friday':
        console.log('Record videos');
        break;
    case 'saturday':
    case 'sunday':
        console.log('Enjoy the weekend');
        break;
    default:
        console.log('Not a valid day!')
}

if(day === 'monday'){
    console.log('Plan course structure');
    console.log('Go to code meetup');
}else if(day === 'tuesday'){
    console.log('Prepare theory videos');
}else if(day === 'wednesday'){
    console.log('Write code examples');
}else if(day === 'friday'){
    console.log('Record videos');
}else if((day === 'saturday') || (day ==='sunday')){
    console.log('Enjoy the weekend');
}else{
    console.log('Not a valid day!');
}

*/

// Ternarios


let age = 23;
age >= 23 ? console.log('I like to drink wine 🍹') : console('I like to drink water 🥃');

const drink = age >= 30 ? 'Drink 🍹🍹' : 'water🥃🥃';
console.log(drink);

/*
let tip = 0;
let bill = 275;
let totalBill = 0;

let getBillPorcentage = bill >= 50 || bill <=300 ? tip = 15 : tip = 20

let percentage = (getBillPorcentage / 100) * bill
console.log(`The bill was ${bill}, the tip was ${percentage}, and the total value ${percentage+bill} `);
*/

const bill = 275;

/* Write your code below. Good luck! 🙂 */

let tip = bill >= 50 || bill <=300 ? (15/100) * bill : (20/100 ) * bill;

let totalValue = tip + bill;

console.log(`The bill was ${bill}, the tip was ${tip}, and the total value ${totalValue}`);