open class Eletronico(var marca: String, var preco: Double) {
    var ligado: Boolean = false;

    fun ligar() {
        if (!ligado) ligado = true;
        println("Ligando o $marca")
    }
    fun desligar() {
        if (ligado) ligado = false;
        println("Desligando o $marca")
    }
}

class Computador(marca: String, preco: Double): Eletronico(marca, preco) {
    fun instalarSoftware(software: String): Unit {
        if (!super.ligado) super.ligar()
        println("Instalando o software $software");
    }
}

class Microfone(marca: String, preco: Double): Eletronico(marca, preco) {}

fun main() {
    val mic = Microfone("Razer", 200.0);
    println(mic.marca);

    val computador = Computador("Lenovo", 4000.0);
    computador.instalarSoftware("VS Code");
}