package RecognizingGenderByName

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.nio.file.Files

fun main() {
    genderByName()
}

fun genderByName() {
    val list1OfStrings: MutableList<String> = ArrayList()
    val list2OfStrings: MutableList<String> = ArrayList()

    // load data from file
    val bf1 = BufferedReader(
        FileReader("/Users/sonaldhage/Advent-Of-Code-2022/src/main/kotlin/RecognizingGenderByName/femaleNames.txt")
    )

    val bf2 = BufferedReader(
        FileReader("/Users/sonaldhage/Advent-Of-Code-2022/src/main/kotlin/RecognizingGenderByName/maleNames.txt")
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

    print("Enter a name: ")
    var input = readLine()

    for (i in array1) {
        if (input == i)
            println("$input is a female name")
    }
    for (i in array2) {
        if (input == i)
            println("$input is a male name")
    }
}