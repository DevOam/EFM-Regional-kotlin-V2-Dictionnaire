package EFM.EFM_V2

fun String.estVideOuBlanche(){
    if (isEmpty()){ println("is empty") }
    if(isBlank()) { println("is blank") }
}

fun String.sigle(): String {
    val mots= this.split(" ").filter { it.isNotBlank() }
    val sigle = StringBuilder()
    for (mot in mots) {
        sigle.append(mot[0].toUpperCase())
    }
    return sigle.toString()
}