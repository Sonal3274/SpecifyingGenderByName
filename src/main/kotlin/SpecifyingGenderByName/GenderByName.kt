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

        //println("Your gender is $gender")
        println("Enter your name:")
        val nameInput = scanner.nextLine()

        val file = when (gender) {
            Gender.MALE -> File("src/main/kotlin/SpecifyingGenderByName/male.txt")
            Gender.FEMALE-> File("src/main/kotlin/SpecifyingGenderByName/female.txt")
            Gender.TRANSGENDER-> File("src/main/kotlin/SpecifyingGenderByName/trans.txt")
        }

        file.appendText("$nameInput\n")
}

enum class Gender { MALE, FEMALE, TRANSGENDER }

