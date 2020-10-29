data class Data(
    val number: Int,
    val name : String
)

fun doubleSortList(list : List<Data>) : List<Data>{
    return list.sortedWith(compareBy(Data::number, Data::name))
}


fun main(args: Array<String>){
    val list : List<Data> = listOf(
        Data(1, "C"),
        Data(1, "A"),
        Data(2, "D"),
        Data(1, "E"),
        Data(2, "B")
        )
    println(list)
    println(doubleSortList(list))
}