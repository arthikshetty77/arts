let numbers = [10,32,70,20];


numbers.sort(function(a, b)
 {
    return b - a;
});

console.log("Sorted in descending order: " + numbers);