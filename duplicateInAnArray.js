const arr = [1,2,8,9,2,9,8]
const duplicate = arr.filter((e,i,a)=>a.indexOf(e)!=i)
console.log(duplicate)
