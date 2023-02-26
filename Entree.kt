package EFM.EFM_V2

import java.lang.Exception

class Entree (var français:String,var anglais:String) {
    init{
        if (français.isEmpty() || français.isBlank()) throw Exception("le mot français peut pas etre empty ou blank")
        if (anglais.isEmpty() || anglais.isBlank()) throw Exception("le mot anglais peut pas etre empty ou blank")
    }
    override fun toString(): String {
        return "$français : $anglais"
    }
    fun equals(other: Entree): Boolean {
        if (this.français==other.français)
            return true
        else return false
    }
}