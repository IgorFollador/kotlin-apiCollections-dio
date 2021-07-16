package one.digitalinnovation.collections

fun main() {
    val igor = Funcionario("Igor", 2000.0, "PJ")
    val marcelo = Funcionario("Marcelo", 3000.0, "CLT")
    val joao = Funcionario("João", 1500.0, "PJ")

    val funcionarios1 = setOf(igor, marcelo)
    val funcionarios2 = setOf(joao)

    println("Union")
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("--------------------------\n" + "Subtract")
    val funcionarios3 = setOf(igor, marcelo, joao)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("--------------------------\n" + "Intersect")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }

}