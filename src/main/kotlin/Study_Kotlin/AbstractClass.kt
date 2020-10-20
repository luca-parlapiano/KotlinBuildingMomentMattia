package Study_Kotlin

//Una classe Astratta non può essere istanziata, quindi è l'ideale come radice delle classi che devono ereditarla
//perchè non si può istanziarla per errore. Ci garantisce in questo modo un codice più robusto, è un errore in meno
//che può essere fatto

abstract class Animal(var food:String){
    protected open fun eat(){
        println("I'm Eating $food")
    }
}

class Lion(var name:String,food:String) : Animal(food){
    fun info(){
        println("The animal's name is $name")
    }

    override fun eat() {
        super.eat()
    }
}

fun main(){
    val animal = Lion("ds","Carne")

}