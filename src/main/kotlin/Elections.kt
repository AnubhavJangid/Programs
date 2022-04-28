import java.util.*


fun main(args: Array<String>) = try {

    val reader = Scanner(System.`in`)
    //No of test cases
    val T = reader.nextInt()

    (1..T).forEach { _ ->

        //Available tablets
        val N = reader.nextInt()
        //Chef max price to buy the tablet
        val B = reader.nextInt()

        var minArea = 0

        (1..N).forEach { _ ->

            //Width of the tablet
            val W = reader.nextInt()
            //Height of the tablet
            val H = reader.nextInt()
            //Price of the tablet
            val P = reader.nextInt()

            if (P <= B) {
                //println("$P $B")
                val temp = W * H
                if (temp > minArea) {
                    minArea = temp
                }
                //println("$minArea")
            } else {
                //println("$P $B")
            }

        }

        if (compareValues(minArea, 0) > 0) {
            println("$minArea")
        } else {
            println("no tablet")
        }

    }

} catch (e: Exception) {
    print(e)
}