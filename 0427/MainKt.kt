class MainKt {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            question1()
            question2()
            question3()
            question4()
            question5()
            question6()
            question7()
        }

        private fun question1() {
            val from9to21 = WorkHours(
                from = "09:00", to = "21:00"
            )
            val from10to21 = WorkHours(
                from = "10:00", to = "21:00"
            )
            val shop = Shop(
                name = "Shop",
                address = "Vilnius",
                workSchedule = WorkSchedule(
                    monday = from9to21,
                    tuesday = from9to21,
                    wednesday = from9to21,
                    thursday = from10to21,
                    saturday = from9to21,
                    sunday = from9to21
                )
            )
            shop.printWorkScheduleSortedByWeekdaysAndTime()
        }

        private fun question2() {
            val stringArray = arrayOf(
                "market", "maxima", "mama"
            )
            val answer = longestCommonPrefix(stringArray)
            println(answer)
        }

        private fun question3() {
            val string = "Today is sunny"
            val answer = lastWordLength(string)
            println(answer)
        }

        private fun question4() {
            val intArray = intArrayOf(
                1, 1, 3, 4, 5, 5
            )
            val answer = removeIntArrayDuplicates(intArray)
            var answerString = "["
            for (i in answer) {
                answerString += "$i,"
            }
            answerString = answerString.dropLast(1)
            answerString += ']'
            println(answerString)
        }

        private fun question5() {
            val string = "EXCEL"
            val answer = excelSheetColumnToInt(string)
            println(answer)
        }

        private fun question6() {
            val number = 36
            val answer = intToRoman(number)
            println(answer)
        }

        private fun question7() {
            val answer = smallestTimeDifference(
                first = "13:45",
                second = "14:00"
            )
            println(answer)
        }
    }
}