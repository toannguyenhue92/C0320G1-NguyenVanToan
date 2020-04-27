function randomArrayNumber() {
  const result = [];
  for (let index = 0; index < 50; index++) {
    result.push(Math.round(Math.random() * 100));
  }
  return result;
}

function linearSearch(array, number) {
  let loopTimes = 0;
  for (let index = 0; index < array.length; index++) {
    if (number === array[index]) {
      return { index, loopTimes };
    }
    loopTimes++;
  }
  return { index: -1, loopTimes };
}

function binarySearch(sortedArray, number) {
  let left = 0;
  let right = sortedArray.length - 1;
  let loopTimes = 0;
  while (left <= right) {
    const middle = Math.floor(left + (right - left) / 2);
    if (sortedArray[middle] === number) {
      return { index: middle, loopTimes };
    }
    if (sortedArray[middle] < number) {
      left = middle + 1;
    } else {
      right = middle - 1;
    }
    loopTimes++;
  }
  return { index: -1, loopTimes };
}

let arrayNumber = randomArrayNumber();
console.log(`Random numbers: ${arrayNumber.join(", ")}`);
console.log(linearSearch(arrayNumber, 10));
arrayNumber = arrayNumber.sort();
console.log(`These numbers after sorted: ${arrayNumber.join(", ")}`);
console.log(binarySearch(arrayNumber, 10));
