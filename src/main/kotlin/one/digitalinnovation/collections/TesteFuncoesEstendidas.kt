package one.digitalinnovation.collections

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "6000".toBigDecimal()
    )
    println("-------------FUNÇÃO SOMATÓRIA-------------")
    println(salarios.somatoria())

    println("-------------FUNÇÃO MEDIA-------------")
    println(salarios.media())
}