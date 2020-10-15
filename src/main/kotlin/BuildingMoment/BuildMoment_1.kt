package BuildingMoment

import java.util.*

/*
* Creare un un algoritmo in grado di calcolare la tua età.

Per fare questo dovrai poter inserire solo l'anno in cui sei nato.

Non potrai scrivere a mano l'anno corrente ma dovrai prenderlo tramite delle classi Koltin o Java (cerca su Internet come fare)
* */

fun main(){
    var anno:String;

    println("Scrivi la tua data di nascita")
    anno = readLine().toString();

    if(anno.isNotEmpty()){
        print(Controlladata(anno.toInt()))
    }else{
        println("campo vuoto")
    }
}

fun Controlladata(anno: Int):String{
    var annoCorrente = Calendar.getInstance().get(Calendar.YEAR);
    return "La tua età è di ${annoCorrente-anno}"
}