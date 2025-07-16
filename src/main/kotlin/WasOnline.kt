fun main() {

    agoToText(1260)

}

fun minutes(minute: Int): String {
    return when {
        minute in 11..14 -> "минут"
        minute % 10 == 1 -> "минуту"
        minute % 10 in 2..4 -> "минуты"
        else -> "минут"
    }
}

fun hours(hour: Int): String {
    return when {
        hour in 11..14 -> "часов"
        hour % 10 == 1 -> "час"
        hour % 10 in 2..4 -> "часа"
        else -> "часов"
    }
}

fun agoToText(second: Int) {
    val message = when {
        second <= 60 -> "был(а) только что"
        second <= 60 * 60 -> {
            val minute = second / 60
            "был(а) $minute ${minutes(minute)} назад"
        }

        second <= 24 * 60 * 60 -> {
            val hour = second / 3600
            "был(а) $hour ${hours(hour)} назад"
        }

        second <= 48 * 60 * 60 -> "был(а) вчера"
        else -> "был(а) давно"
    }
    println(message)
}