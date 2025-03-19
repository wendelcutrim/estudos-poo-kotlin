
// SAM - Single Abstract Method, ocorre quando a interface tem somente 1 método
// Interface funcional. Coloca a palavra fun antes da palavra reservada interface
// Lambda x classe anonima: É a mesma coisa, o que muda é que a lambda simplifca o código.
fun interface Funcionario {
    fun calculaBonus(nome: String, id: Int): Double
}

fun imprimeValorBonus(funcionario: Funcionario) {
    println(funcionario.calculaBonus("Test", 1));
}

fun main() {
    imprimeValorBonus { nome, id ->
        val result = 10.0
        println("Calculando o bônus de $id - $nome R$: $result");
        result;
    }
}