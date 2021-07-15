package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Vitor"
    nomes[1] = "Jether"
    nomes[2] = "Igor"

    for (nome in nomes) {
        println("$nome ")
    }

    println("\n--------------------------")
    nomes.sort()
    nomes.forEach { println("$it ") }

    println("\n--------------------------" +
            "\nUtilizando arrayOf de String")
    val nomes2 = arrayOf("Neilor", "Malomar", "Alberto")
    nomes.sort()
    nomes2.forEach { println("$it ") }
}