open class Eletronico(var marca: String, var preco: Double) {
    var ligado: Boolean = false;
    private var correnteEletrica: Boolean = false;

    open fun ligar() {
        if (!ligado) ligado = true;
        correnteEletrica = true;
        println("Ligando o $marca")
    }
    fun desligar() {
        if (ligado) ligado = false;
        correnteEletrica = false;
        println("Desligando o $marca")
    }

}

class Computador(marca: String, preco: Double): Eletronico(marca, preco) {
    fun instalarSoftware(software: String): Unit {
        if (!super.ligado) super.ligar()
        println("Instalando o software $software");
    }

    override fun ligar() {
        super.ligar();
        println("Carregando o sistema operacional...");
    }
}

class Microfone(marca: String, preco: Double): Eletronico(marca, preco) {}

// assinatura do metodo
fun testeOverload() {}
fun testeOverload(params: String) {}
fun testeOverload(params: Int) {}

fun main() {
    val mic = Microfone("Razer", 200.0);
    println(mic.marca);

    val computador = Computador("Lenovo", 4000.0);
    computador.instalarSoftware("VS Code");
    testeOverload();
}