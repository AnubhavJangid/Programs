import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)
    val t = reader.nextInt()

    repeat(t)
    {
        val n = reader.nextInt()
        val s = reader.next()

        var ans = 0
        var j = 0
        for (i in s.indices)
        {
            if (j != 0)
            {
                ans++
                if (s[i-1] == s[i])
                {
                    j = 0
                }
            }else{
                j=1
            }
        }

        println(ans+j)


    }

}

