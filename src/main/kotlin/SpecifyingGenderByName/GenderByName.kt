import java.io.File
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter your gender (Male/Female/Transgender):")
    val genderInput = scanner.nextLine()

    val gender = when (genderInput.toLowerCase()) {
        "male" -> Gender.MALE
        "female" -> Gender.FEMALE
        "transgender" -> Gender.TRANSGENDER
        else -> {
            println("Invalid input.")
            return
        }
    }

    val fileName = when (gender) {
        Gender.MALE -> "src/main/kotlin/SpecifyingGenderByName/maleNames.txt"
        Gender.FEMALE -> "src/main/kotlin/SpecifyingGenderByName/femaleNames.txt"
        Gender.TRANSGENDER -> "src/main/kotlin/SpecifyingGenderByName/transNames.txt"
    }

    val nameList = mutableListOf<String>()
    val file = File(fileName)
    file.forEachLine { nameList.add(it) }

    println("Enter your name:")
    val nameInput = scanner.nextLine()

    if (nameList.contains(nameInput)) {
        println("Hello $nameInput, You are already registered!!!")
    } else {
        println("Hello $nameInput, you are not registered.")
    }
}

enum class Gender { MALE, FEMALE, TRANSGENDER }
