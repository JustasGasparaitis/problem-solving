/*
Write a function, that takes an array of Integers and returns filtered array without
duplicates. An example:
Input - [1,1,3,4,5,5]
Output - [1,3,4,5]
 */


/**
 * This function remove duplicates from an IntArray.
 * @param array the int array of which the duplicates to be removed
 * @return IntArray without duplicates
 */
fun removeIntArrayDuplicates(array: IntArray): IntArray {
    return array.distinct().toIntArray()
}