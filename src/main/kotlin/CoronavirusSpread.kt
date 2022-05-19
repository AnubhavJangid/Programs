import java.util.*


fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    val t = scanner.nextInt()

    repeat(t) {
        var n = scanner.nextInt()

        val arr = arrayListOf<Int>()
        while (n-- > 0) {
            arr.add(scanner.nextInt())
        }

        arr.sort()

        var max = 1
        var min = Int.MAX_VALUE
        var count = 1
        for (index in 1 until arr.size) {

            if (arr[index] - arr[index - 1] <= 2) {
                count++
            } else {
                max = max.coerceAtLeast(count)
                min = min.coerceAtMost(count)

                count = 1
            }
        }
        max = max.coerceAtLeast(count)
        min = min.coerceAtMost(count)

        println("$min $max")
    }
}