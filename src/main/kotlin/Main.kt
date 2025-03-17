import br.com.estudospookotlin.GetterSetterJava

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
}