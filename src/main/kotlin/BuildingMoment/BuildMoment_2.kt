package BuildingMoment

/*
* Per completare questo esercizio dovrai:

Saper utilizzare i map (sezione 14)
confrontare la lista fruits con basketItems  (scritte sotto)
sommare solo la quantità dei frutti nel carrello
stampare quanti frutti ci sono nel carrello

val basketItems = mapOf("apples" to 4, "oranges" to 19, "kites" to 3, "sandwiches" to 8)
val fruits = listOf("apples", "oranges", "pears", "grapes", "bananas")

//The output should be like this:
//There are 23 fruits in the basket
* */

fun main(){

    val basketItems = mapOf("apples" to 4, "oranges" to 19, "kites" to 3, "sandwiches" to 8)
    val fruits = listOf("apples", "oranges", "pears", "grapes", "bananas")
    var total =0

    // In questo caso abbiamo la possibilità di null, dato che iniziamo da un array che presenta
    // valori che non sono presenti nel secondo array

    for (key in fruits){
       if(basketItems.containsKey(key)){
           total += basketItems.getValue(key)
       }
    }


    /*
    *   for ((item, number) in basketItems) {
        println(number)
        if (item in fruits) result += number
    }
    * */
    print(total)

}