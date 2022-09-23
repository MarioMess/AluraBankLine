import modelo.*

fun testaFuncionarios() {
    val alex = Analista(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salário ${alex.salario}")
    println("bonificação ${alex.bonificacao}")

    val maria = Analista(
        nome = "maria",
        cpf = "444.444.444-44",
        salario = 3000.0
    )

    println("nome ${maria.nome}")
    println("cpf ${maria.cpf}")
    println("salário ${maria.salario}")
    println("bonificação ${maria.bonificacao}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salário ${fran.salario}")
    println("bonificação ${fran.bonificacao}")

    if (fran.autentica(senha = 1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 1234,
        plr = 200.0
    )

    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salário ${gui.salario}")
    println("bonificação ${gui.bonificacao}")
    println("Participação de lucro ${gui.plr}")

    if (gui.autentica(senha = 1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("total de bonificação: ${calculadora.total}")
}