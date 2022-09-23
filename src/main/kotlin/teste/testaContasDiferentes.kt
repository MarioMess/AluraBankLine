import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )

    contaCorrente.deposito(valor = 1000.0)
    contaPoupanca.deposito(valor = 1000.0)

    println("saldo conta corrente: ${contaCorrente.saldo}")
    println("saldo conta poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(valor = 100.0)
    contaPoupanca.saca(valor = 100.0)

    println("saldo conta após saque corrente: ${contaCorrente.saldo}")
    println("saldo conta após saque poupança: ${contaPoupanca.saldo}")

    contaCorrente.transfere(valor = 100.0, contaPoupanca)

    println("saldo conta corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo conta poupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(valor = 200.0, contaCorrente)

    println("saldo conta poupança após transferir para corrente: ${contaPoupanca.saldo}")
    println("saldo conta corrente após receber transferência: ${contaCorrente.saldo}")
}