// main function
fun main() {
    val user = setUser("Dwindi", 19)
    println(user)

    printUser("Dwindi")
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String) {
    println("Your name is $name")
}