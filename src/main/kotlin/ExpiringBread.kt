import java.util.*


fun main() {

    try {
        val reader = Scanner(System.`in`)
        //No of test cases
        var t = reader.nextInt()

        while (t-- > 0) {

            //the number of loaves of bread
            val n = reader.nextInt()
            //number of days after which all the breads will expire
            val m = reader.nextInt()
            //number of loaves of bread can eat in a day
            val k = reader.nextInt()

            val totalBreads = k * m

            if (totalBreads >= n)
            {
                println("YES")
            }else{
                println("NO")
            }

        }

    } catch (e: Exception) {
        print(e)
    }


}