class Matematica {
    var id: Int = 10;

    companion object {
        const val PI = 3.14
        val Teste = "Teste";

        fun help(): String {
            return "Sou a classe matematica!"
        }
    }

    object SUM {
        fun intSum(vararg args: Int): Int {
            return args.sum();
        }
    }
}

fun main() {
    println("PI do método math: ${Math.PI}");
    println("PI da calsse Matemática: ${Matematica.PI}");
    println("Id da classe matemática: ${Matematica().id}");
    println("Help classe matematica: ${Matematica.help()}");
    println("Teste da classe matemática: ${Matematica.Teste}");
    println("SUM.intSUM da classe matemática: ${Matematica.SUM.intSum(10, 20)}");
}