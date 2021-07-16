package one.digitalinnovation.collections

fun main() {
    val igor = Funcionario("Igor", 2000.0, "PJ")
    val marcelo = Funcionario("Marcelo", 3000.0, "CLT")
    val joao = Funcionario("João", 1500.0, "PJ")

    val funcionarios = listOf(igor, marcelo, joao)

    funcionarios.forEach { println(it) }

    println("--------------------------\n" + "Buscando apenas o funcionário João")
    print(funcionarios.find { it.nome == "João" })

    println("--------------------------\n" + "SortedBy")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("--------------------------\n" + "GroupBy")
    funcionarios
        .groupBy { it.tipoContracacao }
        .forEach { println(it) }
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContracacao :String
) {
    override fun toString(): String =
        """
            Nome: $nome
            Salário: $salario
            
        """.trimIndent()
}