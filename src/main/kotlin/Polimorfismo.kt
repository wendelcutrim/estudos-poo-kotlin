interface Funcionario {
    fun calculaBonus(): Double
}

fun imprimeValorBonus(funcionario: Funcionario) {
    println(funcionario.calculaBonus());
}

fun main() {
    imprimeValorBonus(object : Funcionario {
        override fun calculaBonus(): Double {
            return 1000.0
        }
    });
}