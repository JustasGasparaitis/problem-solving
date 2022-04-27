/*
We have theoretical shop object (see example bellow) with working hours schedule for the week. Each day contains optional “WorkHours” object. If it is null - then shop is closed for that day.
Your main task is to display shops working hours sorted by weekdays and time.
If several days in succession have exact same time, those days should be grouped
together (Monday-Wednesday in the example below).
If shop is closed, then instead of time show “Closed” (Friday in the example below).

For example:
I-III 09:00 - 21:00
IV 10:00 - 21:00
V Closed
VI-VII 09:00 - 21:00

obj Shop {
    name: String
    adress: String
    workSchedule: String

    obj WorkSchedule {
        monday: WorkHours?
        tuesday: WorkHours?
        wednesday: WorkHours?
        thursday: WorkHours?
        friday: WorkHours?
        saturay: WorkHours?
        sunday: WorkHours?
    }

    obj WorkHours {
        from: String
        to: String
    }
}
*/


// Theoretical model
data class WorkSchedule(
    val monday: WorkHours? = null,
    val tuesday: WorkHours? = null,
    val wednesday: WorkHours? = null,
    val thursday: WorkHours? = null,
    val friday: WorkHours? = null,
    val saturday: WorkHours? = null,
    val sunday: WorkHours? = null
)

data class WorkHours(
    val from: String,
    val to: String
)

data class Shop(
    val name: String,
    val address: String,
    val workSchedule: WorkSchedule
) {
    /**
     * This function prints the Shop's work schedule sorted and grouped by weekdays and time.
     *
     * Example:
     * I-III 09:00 - 21:00
     * IV 10:00 - 21:00
     * V Closed
     * VI-VII 09:00 - 21:00
     */
    fun printWorkScheduleSortedByWeekdaysAndTime() {
        // Variables into list
        val daySymbolList = listOf(
            "I", "II", "III", "IV", "V", "VI", "VII"
        )
        val days = listOf(
            Pair(daySymbolList[0], workSchedule.monday),
            Pair(daySymbolList[1], workSchedule.tuesday),
            Pair(daySymbolList[2], workSchedule.wednesday),
            Pair(daySymbolList[3], workSchedule.thursday),
            Pair(daySymbolList[4], workSchedule.friday),
            Pair(daySymbolList[5], workSchedule.saturday),
            Pair(daySymbolList[6], workSchedule.sunday)
        )

        // Group days by work hours into lists
        val daysGrouped = mutableListOf<List<Pair<String, WorkHours?>>>()
        val list = mutableListOf<Pair<String, WorkHours?>>()
        for (i in 1 until days.size) {
            list.add(days[i - 1])
            if (days[i - 1].second != days[i].second) {
                daysGrouped.add(list.toList())
                list.clear()
            }
        }
        list.add(days[days.size - 1])
        daysGrouped.add(list.toList())

        // Print grouped weekdays
        daysGrouped.forEach { lst ->
            if (lst.size == 1) {
                if (lst[0].second == null) {
                    println("${lst[0].first} Closed")
                } else {
                    println("${lst[0].first} ${lst[0].second?.from} - ${lst[0].second?.to}")
                }
            } else {
                println("${lst.first().first}-${lst.last().first} ${lst.first().second?.from} - ${lst.last().second?.to}")
            }
        }
    }
}