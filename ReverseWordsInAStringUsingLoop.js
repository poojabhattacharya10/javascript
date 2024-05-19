function reverseWords(inputString){
    let words = []
    let word = ''
    for(let i = 0 ; i < inputString.length ; i++){
        let char = inputString[i]
        if(char !== ' '){
            word += char
        }
        else{
            words.push(word)
            word = ''
        }
    }
    words.push(word)

    let reverseString = ''
    for(let i = words.length - 1 ; i >= 0 ; i--){
        reverseString += words[i] + ' '
    }
    return reverseString
}


let inputString = 'How are you';
let outputString = reverseWords(inputString)
console.log(outputString);