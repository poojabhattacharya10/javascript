// Reverse the string word by word;
//         Input:   India is a great country
//        Output:  Country great a is India

function reverseWords(inputString){
    // split the input string into individual words
    let words = inputString.split(' ');
    // console.log(typeof(words));  // object
    // console.log(words instanceof Array);  // true
    // return words
    let reverseWords = words.reverse();
    // console.log(typeof(reverseWords));   // object
    // console.log(reverseWords instanceof Array);   // true
    // return reverseWords;
    let reverseString = reverseWords.join(' ')
    return reverseString
}

let inputString = 'India is a great country'
let outputString = reverseWords(inputString)
console.log('outputString : ', outputString);