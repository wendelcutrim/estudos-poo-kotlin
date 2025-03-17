enum class Cargo {
    DIRETOR, GERENTE

}

enum class Prioridade(val id: Int, val descricao: String) {
    BAIXA(1, "baixa"), MEDIA(2, "media"), ALTA(3, "alta");
}