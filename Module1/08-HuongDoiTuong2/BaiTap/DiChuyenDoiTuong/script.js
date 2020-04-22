/**
 * Created by nhatnk on 4/26/17.
 */

function Hero(image, top, left, size, speed) {
  this.image = image;
  this.top = top;
  this.left = left;
  this.size = size;
  this.speed = speed;

  this.getHeroElement = function () {
    return '<img width="' + this.size + '"' +
      ' height="' + this.size + '"' +
      ' src="' + this.image + '"' +
      ' style="top: ' + this.top + 'px; left:' + this.left + 'px;position:absolute;" />';
  }

  this.moveRight = function () {
    this.left += this.speed;
    console.log('ok: ' + this.left);
  }

  this.moveLeft = function () {
    this.left -= this.speed;
  }

  this.moveDown = function () {
    this.top += this.speed;
  }

  this.moveUp = function () {
    this.top -= this.speed;
  }
}

let hero = new Hero('pika2.jpg', 20, 30, 200, 50);

function start() {
  if (hero.left < window.innerWidth - hero.size) {
    hero.moveRight();
  }
  document.getElementById('game').innerHTML = hero.getHeroElement();
  setTimeout(start, 500)
}

let gameScreen = document.getElementById('game');

gameScreen.innerHTML = hero.getHeroElement();

function move(hero, event) {
  switch (event.keyCode) {
    case 37:
      hero.moveLeft();
      break;
    case 38:
      hero.moveUp();
      break;
    case 39:
      hero.moveRight();
      break;
    case 40:
      hero.moveDown();
      break;
  }
  gameScreen.innerHTML = hero.getHeroElement();
}

document.addEventListener('keyup', function (event) {
  move(hero, event);
});