import java.util.*


fun main() {

    try {
        val reader = Scanner(System.`in`)
        //No of test cases
        var n = reader.nextInt()

        while (n-- > 0) {

            //Number of Days
            val days = reader.nextInt()

            //Represents the status of day
            val statusDays = reader.next()

            //Iterate every single string element to check the status
            /*for (element in statusDays) {
                //println(element)
                if (element == '1')
                {
                    count++
                }
            }*/

            val count = statusDays.count { it == '1' }

            //class attend by total days
            val totalDays = 120 - days + count
            val totalAttendance = totalDays / 120.toDouble() * 100

            if (totalAttendance > 75)
            {
                print("YES")
            }else
            {
                print("NO")
            }


        }

    } catch (e: Exception) {
        print(e)
    }


}