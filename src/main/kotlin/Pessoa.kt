class Pessoa(var nome: String, var anoNascimento: String) {
    var abc: String? = null;
    var doc: String? = null;

    constructor(nome: String, anoNascimento: String, doc: String):  this(nome, anoNascimento) {
        if (doc == "") {
            throw IllegalArgumentException("Documento não informado!");
        }

        this.doc = doc;
    }

    fun acordar(): String {
        return "Acorda ${this.nome}";
    }
}

// Classe que não pode ser instanciada.
//class Pessoa2 private constructor() {}

//fun main() {
//    var pessoa: Pessoa = Pessoa("Wendel", "1998");
//    pessoa.abc = "abc";
//    println(pessoa.acordar());
//    println(pessoa.abc);
//
////    var pessoa2 = Pessoa2()
//}