package BuildingMoment

/*
* Per poter completare questo esercizio dovrai:

Determina se il trinagolo è equilatero, isoscele o scaleno

* Equilatero = ha tutti i lati della stessa lunghezza

* Isoscele = ha almeno 2 lati della stessa lunghezza
*
Scaleno = ha tutti i lati differenti uno dall'altro
*
* */
/*
* lato 1 = lato 2 // SICURAMENTE NON SCALENO
* lato 2 = lato 3 // Equilatero
* if
* lato 2 ! lato 3 // Isoscele
*
* */
fun main(){
    var triangolo = triangolo(10.0,10.0,10.0)

    triangolo.getTriangoloInfo()
}

class triangolo(private val a:Double, private val b:Double, private val c:Double){
   init{

       doubleArrayOf(a, b, c).run {
           forEachIndexed { i, side ->
               require(side > 0) {
                   "Side ${i+1} has value $side <= 0" //throw an exception
               }
           }
       }
   }

    var isIsoscele = a == b || a == c || b == c
    var isEquilatero =  a==b && a ==c && a > 0
    var isScaleno = a!=b && a!=b && a!=c

    fun getTriangoloInfo(){
        when{
            isIsoscele -> println("Triangolo Isoscele")
            isEquilatero -> println("Triangolo Equilatero")
            isScaleno -> println("Triangolo Scaleno")
        }
    }

}