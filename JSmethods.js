// var months = ['jan' , 'feb' , 'mar' , 'apr' , 'may']

// var indexOfMonth = months.indexOf('dec');
// if(indexOfMonth != -1){
//     months.splice(indexOfMonth , 1 , 'Dec')
//     console.log(months);
// }
// else{
//     console.log(indexOfMonth);
// }



// var months = ['jan' , 'feb' , 'mar' , 'apr' , 'may']

// var indexOfMonth = months.indexOf('mar');
// if(indexOfMonth != -1){
//     months.splice(indexOfMonth , Infinity)
//     console.log(months);
// }
// else{
//     console.log(indexOfMonth);
// }




// var arr = [1,4,9,16,25]
// let newArr = arr.map((ele , i , arr) => {
//     return ele > 9
// })
// console.log(arr); // [ 1, 4, 9, 16, 25 ]
// console.log(newArr); // [ false, false, false, true, true ]




//  var arr1 = [1,4,9,16,25]
// let newArr = arr1.filter((ele , i , arr1) => {
//     return ele > 9
// })
// console.log(arr1); // [ 1, 4, 9, 16, 25 ]
// console.log(newArr) // [16, 25]




// var tax = [10 ,20 ,30]
// let gstTax = tax.map((ele) => {
//     return ele*100
// })
// console.log(tax); // [ 10, 20, 30 ]
// console.log(gstTax); // [ 1000, 2000, 3000 ]



var tax = [10 ,20 ,30]
let gstTax = tax.filter((ele) => {
    return (ele*100)
})
console.log(tax);  // [ 10, 20, 30 ]
console.log(gstTax);  // [ 10, 20, 30 ]