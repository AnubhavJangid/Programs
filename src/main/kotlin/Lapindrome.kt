import java.util.*


fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    repeat(n) {

        val string = scanner.next()

        val hashMap1:HashMap<Char,Int> = HashMap()
        val hashMap2 : HashMap<Char, Int> = HashMap()

        var splitString1 = ""
        var splitString2 = ""

        if (string.count() % 2 == 0) {
            val index = string.count() / 2

            string.splitAtIndex(index).also { (first, second) ->
                splitString1 = first
                splitString2 = second
            }

        } else {
            //Remove the middle character from the string using the string builder steps
            val sb: StringBuilder = StringBuilder(string)
            val newString = sb.deleteCharAt(string.length / 2)
            val index = newString.count() / 2

            newString.toString().splitAtIndex(index).also { (first, second) ->
                splitString1 = first
                splitString2 = second
            }
        }

        splitString1.forEach { i ->
            val count1 = countStringCharacters(splitString1, i)
            hashMap1[i] = count1
        }

        splitString2.forEach { i ->
            val count2 = countStringCharacters(splitString2, i)
            hashMap2[i] = count2
        }

        var booleanString = ""

        //Manipulating the data with hashmap
        hashMap1.forEach {i ->
            hashMap2.forEach { j->
                booleanString = if (i.key == j.key) {
                    if (i.value == j.value) {
                        "YES"
                    }else {
                        "NO"
                    }
                }else{
                    "NO"
                }
            }
        }

        println(booleanString)

    }
}

//Count each characters count in the string
fun countStringCharacters(s: String, ch: Char): Int {
    return s.count { it == ch }
}

//Split the string into two string by using this method
fun String.splitAtIndex(index: Int) = when {
    index < 0 -> 0
    index > length -> length
    else -> index
}.let {
    take(it) to substring(it)
}


//2nd Approach for the Lapindrome Probelm

fun main(args: Array<String>) {
    // your code goes here
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()
    repeat(t) {
        val s = sc.next()
        var f = ""
        var l = ""
        f = s.substring(0, s.length / 2)
        l = if (s.length % 2 == 0) {
            s.substring(s.length / 2)
        } else {
            s.substring(s.length / 2 + 1)
        }
        val a = f.toCharArray()
        val b = l.toCharArray()
        Arrays.sort(a)
        Arrays.sort(b)
        val s1 = String(a)
        val s2 = String(b)
        if (s1 == s2) {
            println("YES")
        } else {
            println("NO")
        }
    }
}

