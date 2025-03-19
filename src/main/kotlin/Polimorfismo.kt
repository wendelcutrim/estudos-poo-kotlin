abstract class Funcionario {
    abstract fun calculaBonus(): Double
}

class Gerente: Funcionario() {
    override fun calculaBonus(): Double {
        return 5000.0;
    }
}

class Analista: Funcionario() {
    override fun calculaBonus(): Double {
        return 3000.0;
    }
}

//fun imprimeValorBonos(gerente: Gerente) {
//    println(gerente.calculaBonus());
//}
//
//fun imprimeValorBonos(analista: Analista) {
//    println(analista.calculaBonus());
//}

fun imprimeValorBonus(funcionario: Funcionario) {
    println(funcionario.calculaBonus());
}

fun main() {
    imprimeValorBonus(Gerente());
    imprimeValorBonus(Analista());
}