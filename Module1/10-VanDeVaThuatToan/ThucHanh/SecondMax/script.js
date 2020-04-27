function findSecondMax(array) {
  if (array.length <= 1) {
    return -1;
  }
  let maxIndex = 0;
  let secondMaxIndex = 0;
  for (let index = 1; index < array.length; index++) {
    if (array[index] > array[maxIndex]) {
      secondMaxIndex = maxIndex;
      maxIndex = index;
    } else if (array[index] !== array[maxIndex] && array[index] > array[secondMaxIndex]) {
      secondMaxIndex = index;
    }
  }
  if (secondMaxIndex === 0) {
    return -1;
  }
  return secondMaxIndex;
}

const arr1 = [2, 5, 6, 7, 8, 23, 4, 23, 12, 12];
const arr2 = [4];
const arr3 = [5, 5, 5, 5, 5];

console.log(arr1[findSecondMax(arr1)], findSecondMax(arr1));
console.log(arr2[findSecondMax(arr2)], findSecondMax(arr2));
console.log(arr3[findSecondMax(arr3)], findSecondMax(arr3));
