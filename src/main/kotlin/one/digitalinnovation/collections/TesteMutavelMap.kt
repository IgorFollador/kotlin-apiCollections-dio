package one.digitalinnovation.collections

fun main() {
    val igor = Funcionario("Igor", 2000.0, "PJ")
    val marcelo = Funcionario("Marcelo", 3000.0, "CLT")
    val joao = Funcionario("João", 1500.0, "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(igor.nome, igor)
    repositorio.create(marcelo.nome, marcelo)
    repositorio.create(joao.nome, joao)

    println(repositorio.findById(igor.nome))

    println("--------------------------")
    repositorio.findAll().forEach { println(it) }

    println("--------------------------")
    repositorio.remove(igor.nome)
    repositorio.findAll().forEach { println(it) }

}