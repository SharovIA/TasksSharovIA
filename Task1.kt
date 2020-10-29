fun isPermutation(a : String, b : String) : Boolean? {
    if(a.isEmpty() && b.isEmpty()){
        return null
    }
    if (a.length != b.length )
        return false
    val arrayA = a.toCharArray()
    val arrayB = b.toCharArray()
    arrayA.sort()
    arrayB.sort()
    for (i in a.indices)
        if (arrayA[i] != arrayB[i])
            return false
    return true
}

fun main(args: Array<String>){
    println("Enter first string: ")
    val a = readLine() as String
    println("Enter second string: ")
    val b = readLine() as String
    val res = isPermutation(a, b)
    if(res != null) {
        println("Result: $res")
    } else {
        println("The entered lines are empty!")
    }
}