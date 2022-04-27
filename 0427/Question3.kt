/*
In given a sentence return last words length (characters count). For example “Today is
sunny” - answer is 5, because “sunny” has 5 letters. Write a function that takes a
string as parameter and returns number.
*/


/**
 * This function calculates the last word length in a string.
 * @param string the string of which the last word length to be calculated
 * @return length of the last word of a string
 */
fun lastWordLength(string: String): Int {
    return string.substringAfterLast(' ').length
}