import java.util.*


fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)
    val t = reader.nextInt()

    repeat(t) {

        val n = reader.nextInt()

        val intArrayP = IntArray(n)
        val intArrayS = IntArray(n)

        repeat(n) {
            intArrayP[it] = reader.nextInt()
            intArrayS[it] = reader.nextInt()
        }

        val intArrayZ = IntArray(12)

        var count = 0

        for (i in 0 until  n) {
            if (intArrayP[i] <= 8)
            {
                intArrayZ[intArrayP[i]] = intArrayZ[intArrayP[i]].coerceAtLeast(intArrayS[i])
            }
        }

        for (j in 0..11)
        {
            count += intArrayZ[j]
        }

        println("$count")

    }

}