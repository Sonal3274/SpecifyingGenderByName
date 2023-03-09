import java.io.BufferedReader
import java.io.File
import java.io.FileReader
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
        Gender.MALE -> File("src/main/kotlin/SpecifyingGenderByName/male.txt")
        Gender.FEMALE-> File("src/main/kotlin/SpecifyingGenderByName/female.txt")
        Gender.TRANSGENDER-> File("src/main/kotlin/SpecifyingGenderByName/trans.txt")
    }
}

enum class Gender { MALE, FEMALE, TRANSGENDER }