package sealed

/* Classes sealed permitem herança, porém somente dentro do pacote em que ela está */
sealed class Result {}

class Success: Result() {}
class Failure: Result() {}


fun main() {
    var success: Success = Success();
    var failure: Failure = Failure();
}