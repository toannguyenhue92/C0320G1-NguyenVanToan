class Rat {
  constructor(name, weight, speed, alive) {
    this.name = name;
    this.weight = weight;
    this.speed = speed;
    this.alive = alive;
  }
  say() {
    console.log('Chit chit');
  }
  toString() {
    return `Rat - name: ${this.name} - speed: ${this.speed} - weight: ${this.weight} - alive: ${this.alive}`;
  }
}

class Cat {
  constructor(name, weight, speed) {
    this.name = name;
    this.weight = weight;
    this.speed = speed;
  }
  say() {
    console.log('Meo meo');
  }
  catchRat(rat) {
    if (this.speed > rat.speed) {
      console.log(`Caught a rat named ${rat.name}`);
      rat.alive = false;
      this.weight += rat.weight;
    }
  }
  toString() {
    return `Cat - name: ${this.name} - speed: ${this.speed} - weight: ${this.weight}`;
  }
}

function demo() {
  const rat = new Rat('Jerry', 2, 3, true);
  const cat = new Cat('Tom', 5, 10);
  console.log(rat.toString());
  rat.say();
  console.log(cat.toString());
  cat.say();
  cat.catchRat(rat);
  console.log('After');
  console.log(rat.toString());
  console.log(cat.toString());
}

demo();
