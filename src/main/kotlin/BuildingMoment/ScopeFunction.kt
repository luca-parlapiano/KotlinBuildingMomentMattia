package BuildingMoment

class Person {
    var name:String ="Marco"
    var contactNumber:String ="1316546"
    fun displayInfo()=println("\nName: $name\n Contactg: $contactNumber")
}
fun main(){
    //METODO NORMALE, nessun gestione dei NULL
    //Notiamo per riscrivere i valori dobbiamo
    // ogni volta richiamare l'oggetto
    val friend = Person()
        friend.contactNumber ="789456123"
        friend.name="Standard assignment"
        friend.displayInfo()

    //SCOPING FUNCTION RUN
    //ritorna il body direttamente nel oggetto che lo richiama
    //Mettendo il punto di domanda possiamo gestire i null
    //se ci sono null non viene eseguito,
    Person().run {
        contactNumber ="1223456"
        name="Run"
        displayInfo()
    }
    //RUN e WITH non ritornano un oggetto, ISTANZIANO quello che diamo nel body,
    //RICHIAMANO QUELLA ISTANZA E LA MODIFICANO
    //Molto simile a RUN ma sintatticamente completamente diverso
    //nativamente non è in grado di gestire i null, tranne se usiamo i this
    //ma a questo punto è uguale al metodo standard
    //Normalmente non conviene
    with(Person()){
        this?.name ="With"
        contactNumber ="7987987979"
        displayInfo()
    }

    val string ="abc"
    string.let {
        print("Originale $it")
        it.reversed()
    }.let {
        print("$it")
    }
    //APPLY ci consente di ottenere un nuovo oggetto partendo
    //da quello dato in ingresso
    var nuovaPersona = Person().apply {
        name="Antonomasia"
        contactNumber="646465"
    }
    nuovaPersona.displayInfo()
}

