fun main() {
    println("Введите вес в кг.: ")
    var input = readLine()
    val weight = input!!.toDouble()

    println("Введите рост в см.: ")
    input = readLine()
    val height = input!!.toDouble() * 0.01

    val index = bodyMassIndex(weight, height)

    val verdict = when (index){
        in 0.0..16.0 -> "Выраженный дефицит массы тела"
        in 16.0..18.5 -> "Недостаточная (дефицит) масса тела"
        in 18.5..25.0 -> "Норма"
        in 25.0..30.0 -> "Избыточная масса тела (предожирение)"
        in 30.0..35.0 -> "Ожирение"
        in 35.0..40.0 -> "Ожирение резкое"
        in 40.0..Double.MAX_VALUE  -> "Очень резкое ожирение"
        else -> "Неверные данные"
    }


    print("BMI = ")
    val solution:Double = Math.round(index * 100.0) / 100.0
    println(solution)
    println(verdict)
}

fun bodyMassIndex(weight:Double, height:Double ): Double {
    val bmi = weight / ( height * height)
    return bmi
}