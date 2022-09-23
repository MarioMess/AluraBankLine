import modelo.Cliente
import modelo.Diretor
import modelo.Gerente
import modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1000
    )
    val diretora = Diretor(
        nome = "Fran",
        cpf = "111.111.111-11",
        salario = 2000.0,
        senha = 2000,
        plr = 200.0
    )

    val cliente = Cliente(
        nome = "Gui",
        cpf = "555.555.555-55",
        senha = 1234
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, senha = 1000)
    sistema.entra(diretora, senha = 2000)
    sistema.entra(cliente, senha = 1234)

}