package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    println("Utilizando forIn")
    for(valor in values) {
        print("$valor ")
    }

    println("\nUtilizando forEach")

    values.forEach { valor ->
        print("$valor ")
    }

    println("\nUtilizando forIn com índice")

    for(index in values.indices) {
        print("${values[index]} ")
    }

    println("\nOrdenando Valores")

    values.sort()
    for(index in values.indices) {
        print("${values[index]} ")
    }
}