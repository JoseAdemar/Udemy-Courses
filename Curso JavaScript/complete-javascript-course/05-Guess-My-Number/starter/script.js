'use strict';

const secretNumber = Math.trunc(Math.random() * 20) + 1;
let score = 20;
let highScore = 0;

document.querySelector('.check').addEventListener('click', function () {
    const guess = Number(document.querySelector('.guess').value);
    if (!guess) {
        displayMessage('⛔ Invalid Number!');
    } else if (guess === secretNumber) {
        displayMessage('✅ Correct Number, Congratulations!');
        document.querySelector('body').style.backgroundColor = '#60b347';
        document.querySelector('.number').style.width = '30rem';
        document.querySelector('.number').textContent = secretNumber;
        toValidHighScore();

    } else if (guess !== secretNumber) {
        displayMessage(guess > secretNumber ? '📈 Too high!' : '📉 Too low!');
        score--;
        document.querySelector('.score').textContent = score;
    }

    toValidScore();
});


//bellow private methods

const displayMessage = function (message) {
    document.querySelector('.message').textContent = message;
}

const toValidScore = function () {
    if (score === 0) {
        document.querySelector('.message').textContent = '💥😕 You lost the game!';
    }
}

const toValidHighScore = function () {
    if (score > highScore) {
        highScore = score;
        document.querySelector('.highscore').textContent = highScore;
    }
}

document.querySelector('.again').addEventListener('click', function () {
    document.querySelector('.number').textContent = '?';
    document.querySelector('.message').textContent = 'Start guessing...';
    document.querySelector('.score').textContent = '20';
    document.querySelector('.guess').value = '';
    document.querySelector('body').style.backgroundColor = '#222';
});