import br.com.estudospookotlin.GetterSetterJava
import sealed.Result

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

//class TentandoHerdarClasseSealedDeOutroPacote: Result() {} // Não será possível pois Result é uma classe sealed e ela só pode ser herdada dentro do seu própio pacote e aqui estmos fora do pacote sealed

fun main() {
    var pessoa: Pessoa = Pessoa("Wendel", "1998");
    pessoa.abc = "abc";
//    println(pessoa.acordar());
//    println(pessoa.abc);
    with(pessoa) {
        println(acordar());
        println(abc);
    }

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