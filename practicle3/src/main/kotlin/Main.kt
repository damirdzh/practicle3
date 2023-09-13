import kotlin.random.Random

fun main(args: Array<String>) {
    val myAge = 18
    val isTeenager = 13 < myAge && myAge < 19  //проверка возраста на тинейджера
    println(isTeenager) //true


//z2
val theirAge = 30;
val bothTeenagers = 13 <= 19 && 19 >= 30 //проверка "являются ли оба человека подростками"
println(bothTeenagers) // false

    //3
    val reader = "Damir"
    val author = "Richard Lucas"
    val authorIsReader  = reader == author  //проверка равенства строк в reader и author
    println(authorIsReader) //false

    //4
    val readerBeforeAuthor = reader < author  //проверка следует ли reader перед author по алфавиту
    println(readerBeforeAuthor) //true

    //5
    val myAge2 = 18
    if (myAge2 > 13 && myAge2 < 19)
        println("подросток") //если возраст меньше 19
    else
        println("не подросток")  //если возраст больше 19

    //6
    val answer = if ( myAge2 > 13 && myAge2 < 19) "подросток" else "не подросток"
    println(answer)

    //7
    var counter = 0
    while (counter < 10) {
        counter  += 1
    println("counter is $counter")}

    //8
    counter = 0 //обнуляем счетчик
    var roll = 0

    do {
        roll = Random.nextInt(6)
        counter ++
        println("после $counter бросков, roll равен $roll")
    } while (roll !=0)

    //9
    val range = 1..10
    //вывод квадратов каждого числа
    for (i in range){
        val square= i * i
        println("квадрат числа $i равен $square")
    }

    //10
    for (i in range) {
        val squareRoot = Math.sqrt(i.toDouble())
        println("квадратный корень числа $i = $squareRoot")
    }
}