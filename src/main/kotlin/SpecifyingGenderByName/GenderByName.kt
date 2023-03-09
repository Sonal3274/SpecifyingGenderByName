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


    //println("Your gender is $gender")

    val list1OfStrings: MutableList<String> = ArrayList()
    val list2OfStrings: MutableList<String> = ArrayList()
    val list3OfStrings: MutableList<String> = ArrayList()

    val bf1 = BufferedReader(
        FileReader("src/main/kotlin/SpecifyingGenderByName/maleNames.txt")
    )

    val bf2 = BufferedReader(
        FileReader("src/main/kotlin/SpecifyingGenderByName/femaleNames.txt")
    )

    val bf3 = BufferedReader(
        FileReader("src/main/kotlin/SpecifyingGenderByName/trans.txt")
    )


    var line1 = bf1.readLine()
    var line2 = bf2.readLine()
    var line3 = bf2.readLine()

    while (line1 != null) {
        list1OfStrings.add(line1)
        line1 = bf1.readLine()
    }
    while (line2 != null) {
        list2OfStrings.add(line2)
        line2 = bf2.readLine()
    }
    while (line3 != null) {
        list2OfStrings.add(line2)
        line2 = bf2.readLine()
    }
    list1OfStrings.add("")
    // closing bufferreader object
    bf1.close()

    // storing the data in arraylist to array
    val array1 = list1OfStrings.toTypedArray()

    list2OfStrings.add("")
    // closing bufferreader object
    bf2.close()

    // storing the data in arraylist to array
    val array2 = list2OfStrings.toTypedArray()

    list3OfStrings.add("")
    // closing bufferreader object
    bf3.close()

    // storing the data in arraylist to array
    val array3 = list3OfStrings.toTypedArray()


    println("Enter your name:")
    val name = scanner.nextLine()
    for (i in array1) {
        if (name == i)
            println("$name is a male name")
    }
    for (i in array2) {
        if (name == i)
            println("$name is a female name")
    }
    for (i in array3) {
        if (name == i)
            println("$name is a transgender name")
    }






    val file = when (gender) {
        Gender.MALE -> File("src/main/kotlin/SpecifyingGenderByName/male.txt")
        Gender.FEMALE-> File("src/main/kotlin/SpecifyingGenderByName/female.txt")
        Gender.TRANSGENDER-> File("src/main/kotlin/SpecifyingGenderByName/trans.txt")
    }

    file.appendText("$name\n")
}

enum class Gender { MALE, FEMALE, TRANSGENDER }







/*

print("Enter a name: ")
var name = readLine()

print("Enter a name: ")
var gender = readLine()

for (i in array1) {
    if (name == i)
        println("$name is a female name")
}
for (i in array2) {
    if (name == i)
        println("$name is a male name")
}
}



val list1OfStrings: MutableList<String> = ArrayList()
val list2OfStrings: MutableList<String> = ArrayList()

// load data from file
val bf1 = BufferedReader(
    FileReader("src/main/kotlin/SpecifyingGenderByName/femaleNames.txt")
)

val bf2 = BufferedReader(
    FileReader("src/main/kotlin/SpecifyingGenderByName/maleNames.txt")
)
var line1 = bf1.readLine()
var line2 = bf2.readLine()

while (line1 != null) {
    list1OfStrings.add(line1)
    line1 = bf1.readLine()
}
while (line2 != null) {
    list2OfStrings.add(line2)
    line2 = bf2.readLine()
}
list1OfStrings.add("")
// closing bufferreader object
bf1.close()

// storing the data in arraylist to array
val array1 = list1OfStrings.toTypedArray()

list2OfStrings.add("")
// closing bufferreader object
bf2.close()

// storing the data in arraylist to array
val array2 = list2OfStrings.toTypedArray()
*/


