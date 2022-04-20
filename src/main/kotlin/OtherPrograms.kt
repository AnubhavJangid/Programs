import java.util.*


fun main(args: Array<String>) {

    try {
        val reader = Scanner(System.`in`)
        //No of test cases
        val n = reader.nextInt()


        //Number of coins
        val arr1 = IntArray(n)
        //Type of workers
        val arr2 = IntArray(n)
        var max = Int.MIN_VALUE

        for (i in 0 until n) {
            arr1[i] = reader.nextInt()
            if (arr1[i] > max) {
                //print(""+arr1[i]) // 13468
                max = arr1[i]
                //print(""+max) // 13468
            }
        }
        var min1 = max
        var min2 = max
        var min3 = max

        for (i in 0 until n) {
            arr2[i] = reader.nextInt()
            if (arr2[i] == 1) {
                if (arr1[i] < min1) {
                    min1 = arr1[i]
                }
                continue
            } else if (arr2[i] == 2) {
                if (arr1[i] < min2) {
                    min2 = arr1[i]
                }
                continue
            } else if (arr2[i] == 3) {
                if (arr1[i] < min3) {
                    min3 = arr1[i]
                }
                continue
            }
        }
        println(Integer.min(min1 + min2, min3))

    } catch (e: Exception) {
        print(e)
    }


}