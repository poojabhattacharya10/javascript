// Find the minimum distance between the given two words:
//     Input:  [ ‘India, ‘up’, Bharat,  ‘MP, ‘Bharat’ ], word 1: ‘India’, word 2: ‘Bharat’
//     Output will be: 2


function minimumDistance(words , word1 , word2){
    let minDis = Infinity
    let word1Index = -1
    let word2Index = -1

    for(let i = 0 ; i < words.length ; i++){
        if (words[i] == word1){
            word1Index = i
        }
        else if (words[i] == word2){
            word2Index = i
        }

        if(word1Index !== -1 && word2Index !== -1){
            let distance = Math.abs()
        }
    }
}


let words = ['India' , 'Up' , 'Bharat' , 'Mp' , 'India']
let word1 = 'India'
let word2 = 'Bharat'
let output = minimumDistance(words , word1 , word2)
console.log(output , 'output');