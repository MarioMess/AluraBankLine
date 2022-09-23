import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaCopiasEReferencias() {

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = ContaCorrente(titular = "João", numero = 1002)
    contaJoao.titular = "João"
    var contaMaria = ContaPoupanca(titular = "Maria", numero = 1003)
    contaJoao.titular = "João"
    contaMaria.titular = "Maria"

    println("titular conta João: ${contaJoao.titular}")
    println("titular conta Maria: ${contaMaria.titular}")

    println(contaMaria)
    println(contaJoao)

}