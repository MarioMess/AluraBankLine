import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {

    val contaAlex = ContaCorrente(titular = "Alex", numero = 1000)
    contaAlex.deposito(150.0)

    val contaMateus = ContaPoupanca(titular = "Mateus", numero = 1001)
    contaMateus.deposito(200.0)

    println("depositando na conta do Alex")
    contaAlex.deposito(valor = 50.0)
    println(contaAlex.saldo)

    println("depositando na conta do Mateus")
    contaMateus.deposito(valor = 70.0)
    println(contaMateus.saldo)

    println("sacando na conta do Alex")
    contaAlex.saca(valor = 120.0)
    println(contaAlex.saldo)

    println("sacando na conta do Mateus")
    contaMateus.saca(valor = 80.0)
    println(contaMateus.saldo)

    println("saque em excesso na conta do Alex")
    contaAlex.saca(valor = 250.0)
    println(contaAlex.saldo)

    println("saque em excesso na conta do Mateus")
    contaMateus.saca(valor = 500.0)
    println(contaMateus.saldo)

    println("transferência da conta do Alex para o Mateus")

    if (contaAlex.transfere(destino = contaMateus, valor = 65.0)) {
        println("transferência sucedida")
    } else {
        println("falha na transferência")
    }

    println(contaAlex.saldo)
    println(contaMateus.saldo)
}