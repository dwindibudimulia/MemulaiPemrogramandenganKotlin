class User(val name : String, val age : Int)

data class DataUser(val name : String, val age : Int)

fun main(){
    val user = User("Dwindi", 17)
    val dataUser = DataUser("Dwindi", 17)

    println(user)
    println(dataUser)
}