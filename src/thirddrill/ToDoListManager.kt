fun main(){
    println("=======To Do List Manager======")

    println("1. Add Task")
    println("2. Remove Task")
    println("3. View Tasks")
    println("4. Exit")
    println("Choose an Option: ")

    val option: String? = readLine()
    val userOption = option?.toIntOrNull()?:0

    val addTask = 1
    val removeTask = 2
    val viewTask = 3
    val exit = 4

    if (userOption == addTask){
        val enterTask: String? = readLine()
        println("Enter task: $enterTask")
        println("Task Added: ")
    }
}