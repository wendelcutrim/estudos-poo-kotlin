fun main() {
    var pessoa: Pessoa = Pessoa("Wendel", "1998");
    pessoa.abc = "abc";
    println(pessoa.acordar());
    println(pessoa.abc);
}