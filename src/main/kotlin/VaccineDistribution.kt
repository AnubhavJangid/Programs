import java.util.*


fun main(args: Array<String>) {

    try {
        val reader = Scanner(System.`in`)
        //No of test cases
        var t = reader.nextInt()

        while (t-- > 0) {

            var count = 0
            var temp = 0
            //Total Number of people
            var n = reader.nextInt()
            //How many people will vaccinate in one day
            val K = reader.nextInt()

            while (n-- > 0) {
                //People with their age
                val k = reader.nextInt()

                if (k >= 80 || k <= 9) {
                    //Risk
                    temp++
                } else {
                    //Not Risk
                    count++
                }
            }

            var RPDays = 0
            var NRPDays = 0
            var TotalDays = 0

            RPDays = if( temp % K == 0)
                temp/K
            else
                temp/K + 1

            NRPDays = if( count % K == 0)
                count/K
            else
                count/K + 1

            TotalDays = RPDays + NRPDays
            println(TotalDays)

        }

    } catch (e: Exception) {
        print(e)
    }


}