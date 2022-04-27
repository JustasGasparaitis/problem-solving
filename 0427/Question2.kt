/*
Write a function to find the longest common prefix from string array (function should
take string as parameter and return a string). For example, input could be [“market”,
“maxima”, “mama”], then longest common prefix would be “ma”. Another example -
[“sale”, “safe”, “sun”], then result would be “s”. If there is no common prefix return an
empty string.
*/

/**
 * This function calculates the longest common prefix of a string array.
 * Algorithm:
 * Iterate through i-th character of each string, checking
 * if i is not out of bounds and
 * if the i-th character of string matches
 *
 * @property stringArray the string array of which the longest common prefix to be calculated
 */
fun longestCommonPrefix(
    stringArray: Array<String>
): String {
    var index = 0
    var prefix = ""
    while (true) {
        for (i in 1 until stringArray.size) {
            if (!(index < stringArray[i - 1].length && stringArray[i - 1][index] == stringArray[i][index])) {
                return prefix
            }
        }
        prefix += stringArray[0][index]
        index++
    }
}