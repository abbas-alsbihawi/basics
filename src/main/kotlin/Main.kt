fun main() {
    println("Hello World!")
    var numberText :String? ="null"
    var numberCHar :Char? ='9'
    println("number :${numberText?.length}")

   var numberRang=10..50
//    numberRang.printAll()
    getResultMark1(490)
    println(getResultMark2(30))
    println(getResultMark3(60))
    println(getResultMark4(50))
//    numberText.length
//    Mans().isMan()
}
fun getResultMark1(mark:Int){
    if (mark<50&&mark>=0) {
        println('F')
    }else if (mark>=50&&mark<60) {
        println('E')
    }else if (mark>=60&&mark<70) {
        println('D')
    }else if (mark>=70&&mark<80) {
    println('C')
    }else if (mark>=80&&mark<90) {
    println('B')
    }else if (mark>=90&&mark<=100) {
        println('A')
    }
    else println("not Found")

}
fun getResultMark2(mark:Int): String {
    if (mark<50&&mark>=0) {
        return "F"
    }else if (mark>=50&&mark<60) {
        return "E"
    }else if (mark>=60&&mark<70) {
        return "D"
    }else if (mark>=70&&mark<80) {
        return "C"
    }else if (mark>=80&&mark<90) {
        return "B"
    }else if (mark>=90&&mark<=100) {
        return "A"
    }
    return "not Found"

}
fun getResultMark3(mark:Int): String {
    if (mark in 0..49) return "F"
    else if (mark in 50..59) return "E"
    else if (mark in 60..69) return "D"
    else if (mark in 70..79) return "C"
    else if (mark in 80..89) return "B"
    else if (mark in 90..100) return "A"
    return "not Found"
}
fun getResultMark4(mark:Int)= when (mark) {
    in 0..49 ->  "F"
    in 50..59 ->  "E"
    in 60..69 ->  "D"
    in 70..79 ->  "C"
    in 80..89 ->  "B"
    in 90..100 ->  "A"
    else -> "not Found"
}

//class Mans :Man{
//    override fun isMan() {
//       println("is Man")
//    }
//
//}
//
//interface Man{
//    fun  isMan();
//}
fun IntProgression.printAll () {
    this.forEach{
        println("$it")
    }
}
