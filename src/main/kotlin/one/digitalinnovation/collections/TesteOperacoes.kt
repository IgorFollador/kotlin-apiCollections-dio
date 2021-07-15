package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0, 10000.0)

    for (salario in salarios) {
        println(salario)
    }

    println("--------------------------")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")

    println("--------------------------")
    val salariosMaiorQue2500 = salarios.filter{ it > 2500.0 }
    salariosMaiorQue2500.forEach { println(it) }

    println("--------------------------\n" +
            "Quantos valores estão no range entre 2000.0 e 5000.0")
    println(salarios.count {it in 2000.0..5000.0})

    println("--------------------------\n" +
            "Utilizando Find")
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 10.0 })

    println("--------------------------\n" +
            "Utilizando Any")
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 500.0 })

}