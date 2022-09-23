package modelo

abstract open class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    fun deposito(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
    }
}