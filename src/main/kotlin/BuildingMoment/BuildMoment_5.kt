package BuildingMoment

/*
* Per poter completare questo esercizio dovrai:

creare un classe Account che dovrà contenere al suo interno un pin e un balance (quanti soldi abbiamo sul conto)
la classe definirà un metodo withdraw() in cui andremo a chiedere quanti soldi vogliamo prelevare e andremo anche
a verificare se il pin corrisponde a 46789
la classe definirà  un metodo deposit() che ci permetterà di inserire soldi all'interno del nostro conto
la classe definirà un metodo check() per verificare i soldi rimamenti nel nostro conto

fun withdraw(amount: Int, pin: Int)
fun deposit(amount: Int)
fun check() : Int
*/

fun main(){
    val myAccount = Account(balance = 2500)

    println("Sul tuo conto ci sono: ${myAccount.check()}");
    myAccount.deposit(500)
    myAccount.withdraw(2000, 46787)

    println(myAccount.check())
}

class Account(private val pin:Int = 46789, private var balance:Int ){

    fun withdraw(amount: Int, pin: Int){
        when{
            check() < amount ->{
                println("Credito insufficiente")
            }
            pin !=this.pin ->{
                println("Pin Errato")
            }
            else -> {
               balance -= amount
            }
        }
    }

    fun deposit(amount: Int){
        this.balance+=amount
    }

    fun check() : Int{
        return balance
    }
}