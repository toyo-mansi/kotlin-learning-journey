fun main() {
    println("==== MENU ====")

    val running = true

    while (running){
    println("1. Calculator")
    println("2. Grade Evaluator")
    println("3. Clean Data")
    println("4. Filter Even Numbers")
    println("5. Exit")

    println("Choose option: ")
    val chooseOption: String? = readLine()
    val intOptions = chooseOption?.toIntOrNull() ?: 0

        when (intOptions){
            1 -> ""
        }

    }
}