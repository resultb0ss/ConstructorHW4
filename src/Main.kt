fun main() {
    var num = 13


    if (num > 0 && num % 2 == 0) {
        println("Положительное четное число")
    } else if (num > 0 && num % 2 != 0){
        println("Положительное нечетное число")
    } else if (num < 0 && num % 2 == 0){
        println("Отрицательное четное число")
    } else if (num < 0 && num % 2 != 0){
        println("Отрицательное нечетное число")
    } else if (num == 0){
        println("Нулевое число")
    } else {
        println("Такого не знаю")
    }
}