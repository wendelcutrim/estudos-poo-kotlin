class Pessoa(var nome: String, var anoNascimento: String) {
    var abc: String? = null;

    fun acordar(): String {
        return "Acorda ${this.nome}";
    }
}