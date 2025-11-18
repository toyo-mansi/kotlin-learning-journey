fun main(){
    val busName: List<String> = listOf("Starliner1", "Jac Liner2", "Dela Rosa3", "HM Transport4", "Kersteen5")
    println("These are the 5 buses $busName")
    println("First bus is ${busName.first()}")
    println("Last bus is ${busName.last()}")

    for (name in busName){
        println(name)
    }

    val filter2 = busName.filter { it.contains("2") }
    println("The number 2 is $filter2")

    val mapUppercase = busName.map { it.uppercase() }
    println("Bus Name Uppercase: $mapUppercase")

    val busNameUpdate = busName.toMutableList()
    busNameUpdate.add("Don Aldrin")
    println("$busNameUpdate")

    busNameUpdate.remove("HM Transport4")
    println("$busNameUpdate")
}
