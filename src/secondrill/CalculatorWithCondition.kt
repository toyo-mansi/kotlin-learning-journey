package secondrill

fun main() {
    println("========Calculator with Condition===========")

    println("Enter first number: ")
    val firstNumber = readLine()
    val firstToInt = firstNumber?.toDoubleOrNull() ?: 0.0

    println("Enter operator: ")
    val operator = readLine()


    println("Enter second number: ")
    val secondNumber = readLine()
    val secondToInt = secondNumber?.toDoubleOrNull() ?: 0.0

    val addition = firstToInt + secondToInt
    val subtraction = firstToInt - secondToInt
    val multiplication = firstToInt * secondToInt
    val division = firstToInt / secondToInt

    if (operator == "+"){
        println("The sum is: $addition")
    } else if (operator == "-"){
        println("The difference is: $subtraction")
    } else if (operator == "*"){
        println("The product is: $multiplication")
    } else if (secondToInt == 0.0){
        println("Cannot divide by zero")
    } else if (operator == "/"){
        println("The quotient: $division")
    }else{
        println("Invalid operator")
    }
}
