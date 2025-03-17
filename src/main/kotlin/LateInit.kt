class DataBase {
    //instrucoes

    fun openConnection() {
        println("Connection open")
    }
}

class LateInit {
    lateinit var db: DataBase;

    fun initialize() {
        // Só é alocado na memória quando tem a inicialização
        //db.openConnection();
        if(!::db.isInitialized) {
            db = DataBase()
        }
        db.openConnection();
    }
}

fun main() {
    val server = LateInit();
    server.initialize();
}