import java.io.File
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter your gender (Male/Female/Transgender):")
    val genderInput = scanner.nextLine()

    var gender = when (genderInput.toLowerCase()) {
        "male" -> Gender.MALE
        "female" -> Gender.FEMALE
        "transgender" -> Gender.TRANSGENDER
        else -> {
            println("Invalid input.")
            return
        }
    }
    val file = when (gender) {
        Gender.MALE -> println("It's a male name")
        Gender.FEMALE -> println("It's a female name")
        Gender.TRANSGENDER -> println("It's a transgender name")
    }

    println("Enter your name:")
    val nameInput = scanner.nextLine()
    println("You entered $nameInput")

}

enum class Gender { MALE, FEMALE, TRANSGENDER }