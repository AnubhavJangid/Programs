import java.util.*


fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)
    val t = reader.nextInt()

    repeat(t) {
        val n = reader.nextInt()

        val s = reader.next()
        val r = reader.next()

        val count1= countOccurrences(s, '1')
        val count2 = countOccurrences(r, '1')

        if (count1 == count2)
        {
            println("YES")
        }else{
            println("NO")
        }
    }


}

fun countOccurrences(s: String, ch: Char): Int {
    return s.count { it == ch }
}