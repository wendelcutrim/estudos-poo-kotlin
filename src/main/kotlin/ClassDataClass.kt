class Endereco(var rua: String, var cidade: String) {
    override fun toString(): String {
        return "Endereço: rua:${this.rua} - cidade: ${this.cidade}"
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        return (other is Endereco) && (this.rua == other.rua && this.cidade == other.cidade);
    }
}
data class DataEndereco(var rua: String, var cidade: String) {}

//fun endereco(rua: String, cep: String, cidade: String, numero: String) {}
fun endereco(endereco: Endereco) {}

fun main() {
    val a1 = DataEndereco("Rua 1", "cidade 1");
    val a2 = DataEndereco("Rua 1", "cidade 1");

    println(a1.toString());
    println(a1.hashCode());
    println(a1.equals(a2));

    val a3 = a1.copy();
    a3.rua = "Alteracao";
    println("A3: ${a3.toString()}");
    println("A1: ${a1.toString()}");
}