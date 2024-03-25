package com.unsiw.utspemrogramanmobile
// data class Club
data class Club(
    val name: String,
    val epl: Int,
    val fa: Int,
    val efl: Int,
    val ucl: Int,
    val uel: Int,
) {
    val totalTrophy: Int
        get() = epl + fa + efl + ucl +  uel
}

// extension function recap
fun Club.recap(): String {
    return "${this.name} berhasil meraih " +
            "${this.epl} trofi Liga Primer Inggris, " +
            "${this.fa} trofi FA, " +
            "${this.efl} trofi EFL, " +
            "${this.ucl} trofi Liga Champions, " +
            "dan ${this.uel} trofi Liga Eropa UEFA"
}