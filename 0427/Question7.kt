/*
Calculate smallest time difference. Function should take 2 strings in “hh:mm” format
(hours:minutes) and return a difference in minutes. For example:
Input - [“13:45”, ”12:45”], output 60
Input - [“13:45”, ”14:00”], output 15
 */

/**
 * This function calculates the smallest time difference between two time strings.
 * @param first first time string
 * @param second second time string
 * @return time difference between two times in minutes
 */
fun smallestTimeDifference(first: String, second: String): Int {
    val firstTime = (first.substringBefore(':').toInt() * 60) + (first.substringAfter(':').toInt())
    val secondTime = (second.substringBefore(':').toInt() * 60) + (second.substringAfter(':').toInt())

    val diff = firstTime - secondTime
    return if (diff < 0) {
        -diff
    } else {
        diff
    }
}