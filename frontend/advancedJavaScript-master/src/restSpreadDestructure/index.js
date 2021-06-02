// ********************  Rest - geriye kalanlar demek ******************** 

//params - c# daki karşılığı
//varArgs - java daki karşılığı
//bir değişkene fonksiyon atıya biliyoruz
let showProducts=function (id,...products) {
    //console.log(id);
    //console.log(products[0][1]);
}

//console.log(typeof showProducts)
//showProducts(10,["Elma","Armut","Karpuz"])



// ********************  Spread - ayrıştırmak ******************** 

let points=[1,2,3,4,50,60,14]
//console.log(...points);
//console.log(Math.max(...points)); // en büyük sayıyı gösterir
//console.log(..."ABC","D",..."EFG","H");




// ********************  Destructuring - parçalamak ********************

//elimizdeki arrayin değerlerini değişkenlere atama yöntemi
let populations = [10000,20000,30000,[40000,100000]]
let [small,medium,high,[veryHigh,maximum]] = populations
/*console.log(small)
console.log(medium)
console.log(high)
console.log(veryHigh)
console.log(maximum)*/

function someFunction([small1],number) {
    console.log(small1)
}

//someFunction(populations)

let category = {id:1, name:"İçecek"}
//console.log(category.id)
//bu iki satır aynı şey
//console.log(category["name"])
//console.log(category.name)

let {id,name} = category
console.log(id)
console.log(name)
