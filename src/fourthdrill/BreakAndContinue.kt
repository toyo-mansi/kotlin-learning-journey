fun main(){
    var number = 1

    //Loop 1-10, skip at 5, continue at 8//
    while (number <= 10) {
        if (number == 5) {
            number++
            continue
        }else if (number == 8) {
            break
        }
        println(number)
        number++
    }
}