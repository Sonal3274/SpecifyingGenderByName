import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter
import java.io.PrintWriter
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
        println("Please register your name:")

        println("Enter your gender (Male/Female/Transgender):")
        val newUserGender = scanner.nextLine()

        val genderNew = when (newUserGender.toLowerCase()) {
            "male" -> Gender.MALE
            "female" -> Gender.FEMALE
            "transgender" -> Gender.TRANSGENDER
            else -> {
                println("Invalid input.")
                return
            }
        }

        println("Enter your name:")
        if(genderNew == Gender.MALE){
            // Create a new File object with the file path and name
            val file = File("src/main/kotlin/SpecifyingGenderByName/maleNames.txt")

            // Open the file for writing using a PrintWriter object
            // val writer = PrintWriter(file)
            val writer = BufferedWriter(FileWriter(file, true))

            // Write some Kotlin code to the file
            val newUserName = scanner.nextLine()
            writer.newLine()
            writer.write(newUserName)

            // Close the PrintWriter object to save the changes to the file
            writer.close()

            // Print a message to the console to confirm that the file was written successfully
            println("Congratulations!!! You are successfully registered! : ${file.absolutePath}")
        } else if (genderNew == Gender.FEMALE){

            val file = File("src/main/kotlin/SpecifyingGenderByName/femaleNames.txt")

            val writer = BufferedWriter(FileWriter(file, true))

            val newUserName = scanner.nextLine()
            writer.write(newUserName)

            writer.close()

            println("Congratulations!!! You are successfully registered! : ${file.absolutePath}")
        } else {

            val file = File("src/main/kotlin/SpecifyingGenderByName/transNames.txt")

            val writer = BufferedWriter(FileWriter(file, true))

            val newUserName = scanner.nextLine()
            writer.newLine()
            writer.write(newUserName)

            writer.close()

            println("Congratulations!!! You are successfully registered! : ${file.absolutePath}")
        }
    }
}

enum class Gender { MALE, FEMALE, TRANSGENDER }
