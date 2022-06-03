import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)
    val t = reader.nextInt()

    repeat(t) {
        val n = reader.nextInt()

        val intArray = IntArray(n)
        repeat(n){
            intArray[it] = reader.nextInt()
        }

        var count = 0
        var temp = 0
        var onceSorted = false
        for (start in 0 until n-1)
        {
            if (intArray[start] > intArray[start+1])
            {
                temp = intArray[start]
                intArray[start] = intArray[start+1]
                intArray[start+1] = temp
                count++
                onceSorted = true
            }
            if (onceSorted)
                break
        }

        if (onceSorted)
        {
            for (i in 0 until n-1)
            {
                if (intArray[i] > intArray[i+1])
                {
                    count++
                }

                if (count == 2)
                    break

            }
        }

        if (count == 2){
            println("NO")
        }else{
            println("YES")
        }

    }
}
