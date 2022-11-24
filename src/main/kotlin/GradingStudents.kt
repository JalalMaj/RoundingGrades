import java.security.DrbgParameters.NextBytes

fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here
    var gradeList : MutableList<Int> = ArrayList()
    grades.forEach() { item ->
        if  (item >= 38 && item % 5 > 2 ) {
            val total = item + (5 - item % 5)
            gradeList.add(total)
        } else {
            gradeList.add(item)
        }
    }
    return gradeList.toTypedArray()

}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
