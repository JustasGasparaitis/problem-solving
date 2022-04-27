/*
Write a function “excel sheet column to number” converter, that takes String as a parameter and returns a number of the column. Some examples:
A -> 1
B -> 2
C -> 3
Z -> 26
AA -> 27
AB-> 28
 */

/**
 * This function converts an excel sheet column string to an integer
 * @param string the excel sheet column string
 * @return sheet column number integer
 */
fun excelSheetColumnToInt(string: String): Int {
    var number = 0
    for (c in string) {
        number *= 26
        number += c.upperCaseCharCount()
    }
    return number
}
fun Char.upperCaseCharCount() = this.code - 'A'.code + 1