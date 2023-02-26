package EFM.EFM_V2

class Dictionnaire {
    var entrées:MutableList<Entree> = mutableListOf()
    //return the number of entrées
    fun nombresEntrées():Int{
        return entrées.size
    }
    //add a entree
    fun ajouter(e: Entree){
        if (entrées.contains(e)){
            throw Exception("already exist")
        }else entrées.add(e)
    }
    //remove one entre from the list of entrées
    fun supprimer(e: Entree):Boolean{
        if(entrées.contains(e)) {
            entrées.remove(e)
            return true
        }else {
            throw Exception("doesn't exist")
            return false
        }
    }
    //remove one entre from the list of entrées by frenchWord
    fun supprimer(motFrench:String):Boolean{
        var etat:Boolean=false
        for (entre in entrées){
            if (entre.français==motFrench){
                entrées.remove(entre)
                etat=true
            }else {
                throw Exception("doesn't exist")
                etat=false
            } }
        return etat
    }
    // retourne une liste contenant les mots français équivalents au mot anglais
    fun anFr(motEnglish:String): MutableList<String> {
        val motsFrançais = mutableListOf<String>()
        for (entree in entrées) {
            if (entree.anglais == motEnglish) {
                motsFrançais.add(entree.français)
            }
        }
        return motsFrançais
    }
    //qui retourne tous les mots anglais (sans doublons) stockés dans le dictionnaire.
    fun motsAnglais(): Set<String> {
        return entrées.map { it.anglais }.toSet()
    }
    fun dictionnaireAnFr():HashMap<String,ArrayList<String>>{
        val dictionnaire = HashMap<String, ArrayList<String>>()
        for (entree in entrées) {
            val motsFrançais = dictionnaire.getOrDefault(entree.anglais, ArrayList())
            motsFrançais.add(entree.français)
            dictionnaire[entree.anglais] = motsFrançais
        }
        return dictionnaire
    }
    override fun toString():String{
        val str = StringBuilder()
        for (entree in entrées) {
            str.append(entree.toString())
            str.append("\n")
        }
        return str.toString()
    }
}