


function reverse(sent)
{

const words = sent.split(' ');

const reversedWords = words.map(word => reverseWord(word));
const reversed = reversedWords.join(' ');

return reversed;
}

function reverseWord(word) {
    
    return word.split('').reverse().join('');
}

const sentence="This is a sunny day"
const reversed=reverse(sentence);


console.log(" Sentence: " + sentence);
console.log("Reversed : " + reversed);