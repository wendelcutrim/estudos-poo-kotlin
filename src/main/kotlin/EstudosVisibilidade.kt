open class Visibilidade {
    var str: String? = null;
    private var _nome: String = "";
    var nome: String
        get() {
            if(_nome != null) {
                return _nome;
            }
            return "";
        }
        set(value) {
            if(value != null) _nome = value;
        }

    fun abc() {
        println("ABC")
    }

    protected fun teste() {
        println("Teste")
    }
}

fun main() {
    val visibilidade = Visibilidade();
    visibilidade.nome = "Wendel";
    println(visibilidade.nome)
}