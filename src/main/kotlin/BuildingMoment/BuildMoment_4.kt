package BuildingMoment

/*
   * Per poter completare questo esercizio dovrai:

scrivi un ciclo con la parola chiave break per creare una stringa titleResult che sia lunga esattamente 140 caratteri
dovrai prendere i titoli dalla lista headlines e metterli dentro la stringa titleResult  uno dopo l'altro con uno spazio tra un titolo
e l'altro per dividere i vari titoli.
l'output dovrà essere come mostrato sotto
anche per questo esempio avrai bisogno di cercare su internet come poter tagliare le stringhe
usa questo sito per verificare la lunghezza del tuo output (link)

//The output should be like this:
//Ballata dell'usignolo e del serpente Tutti pronti per la scuola primaria! La prova preselettiva del Concorso Ordinario per le Scuole Se scor
   *
   * */

fun main(){
    var titleResult =""

    val headlines = listOf(
        "Ballata dell'usignolo e del serpente",
        "Tutti pronti per la scuola primaria!",
        "La prova preselettiva del Concorso Ordinario per le Scuole",
        "Se scorre il sangue",
        "Profezie: Che cosa ci riserva il futuro",
        "Una notte ho sognato New York",
        "Vado in prima. Attività, giochi, pregrafismi, lettere e numeri"
    )

    for (headline in headlines){
        titleResult += "$headline "
        if(titleResult.length >=140){
            titleResult = titleResult.substring(1..140)
            break
        }
    }

   println(titleResult +" "+titleResult.length)
}