package one.digitalinnovation.collections

fun main() {
    val igor = Funcionario("Igor", 2000.0, "PJ")
    val marcelo = Funcionario("Marcelo", 3000.0, "CLT")
    val joao = Funcionario("João", 1500.0, "PJ")

    println("-------------LIST-------------")
    val funcionarios = mutableListOf(igor, joao)
    funcionarios.forEach { println(it) }

    println("-------------ADD-------------")
    funcionarios.add(marcelo)
    funcionarios.forEach { println(it) }

    println("-------------REMOVE-------------")
    funcionarios.remove(igor)
    funcionarios.forEach { println(it) }

    println("-------------SET-------------")
    val funcionarioSet = mutableSetOf(igor)
    funcionarioSet.forEach { println(it) }

    println("--------------------------")
    funcionarioSet.add(marcelo)
    funcionarioSet.add(joao)
    funcionarioSet.forEach { println(it) }

    println("--------------------------")
    funcionarioSet.remove(joao)
    funcionarioSet.forEach { println(it) }
}