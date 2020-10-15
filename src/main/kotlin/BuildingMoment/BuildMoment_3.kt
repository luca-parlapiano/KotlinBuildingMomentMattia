package BuildingMoment

/*
   * Per completare questo esercizio dovrai:

utilizzare un ciclo per poter prendere i nomi dalla lista names

dovrai successivamente sostituire lo spazio tra i nomi con un "_" e sistemare le lettere in modo che siano tutte minuscole.
Il risultato dovrebbe essere com quello mostrato all'interno della lista usernames

val names = listOf("Marco Rossi", "Alfredo Andrei", "John Mayer", "Justin Biber")

//The output should be like this:
usernames = [marco_rossi, alfredo_andrei, john_mayer, justin_biber]
Per completare quesot task dovrai cercare su internet come sostituire i caratteri all'interno delle stringhe con altri e come rendere tutte le lettere minuscole.
   * */

fun main(){
    val names = listOf("Marco Rossi", "Alfredo Andrei", "John Mayer", "Justin Biber")
    var usernames: MutableList<String> = mutableListOf()


    for (name in names)
        usernames.add(name.replace(" ","_").toLowerCase())

    println(usernames)

}