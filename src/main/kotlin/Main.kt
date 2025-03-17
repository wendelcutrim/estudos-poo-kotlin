import br.com.estudospookotlin.GetterSetterJava

/*fun calculaBonus(cargo: String): Float {
    when (cargo) {
        "diretor" -> return 5000F
        "gerente" -> return 3000F
        else -> return 2000F
    }
}*/

fun calculaBonus(cargo: Cargo): Float {
    when (cargo) {
        Cargo.DIRETOR -> return 5000F
        Cargo.GERENTE -> return 3000F
        else -> return 2000F
    }
}

fun main() {
    var pessoa: Pessoa = Pessoa("Wendel", "1998");
    pessoa.abc = "abc";
    println(pessoa.acordar());
    println(pessoa.abc);

    var getterSetterJava = GetterSetterJava();
    getterSetterJava.id = 1;
    println(getterSetterJava.id)

    var animal: Animal = Animal();
    animal.nome = "Cachorro";
    println(animal.nome);

    println(calculaBonus(Cargo.DIRETOR));
    println(Prioridade.ALTA);
    println(Prioridade.ALTA.id);
    println(Prioridade.ALTA.descricao);
}