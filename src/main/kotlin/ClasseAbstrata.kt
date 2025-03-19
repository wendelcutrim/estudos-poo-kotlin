interface Selvagem {
    fun atacar(): String;

}

abstract class Mamifero(var nome: String) {
    abstract fun falar(): String

    fun acordar() {
        println("${this.nome} acordou!");
    }

    fun dormir() {}
}

class Cachorro(nome: String): Mamifero(nome), Selvagem {
    override fun falar(): String {
        return "Au au";
    }

    override fun atacar(): String {
        return "${this.nome} está atacando!";
    }
}

class Gato(nome: String): Mamifero(nome) {
    override fun falar(): String {
        return "miau";
    }
}

fun main() {
    val cachorro = Cachorro("Rex");
    println(cachorro.falar());
    println(cachorro.acordar());
}

