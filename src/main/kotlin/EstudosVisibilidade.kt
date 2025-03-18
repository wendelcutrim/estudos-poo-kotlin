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

    // Nested class (interna)
    private class NestedClass() {
    // Classes nested não tem acessos aos atributos da classe externa. Porém a classe externa, tem acesso aos atributos da classe interna
        var id: Int = 0;
        fun test() {
            println("NestedClass");
        }
    }

    fun printNestedClassTest() {
        println(NestedClass().id)
    }

    private inner class NestedInnerClass() {
        fun printNomeClasseExterna() {
            println(_nome);
        }
    }
}

fun main() {
    val visibilidade = Visibilidade();
    visibilidade.nome = "Wendel";
    println(visibilidade.nome)
}