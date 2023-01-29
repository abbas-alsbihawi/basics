import model.Post
import model.PostVideo
import model.User

fun main() {
//    startVar()
//    rangOption()
//    getResultMark1(490)
//    println(getResultMark2(30))
//    println(getResultMark3(60))
//    println(getResultMark4(50))
//    arrayOperation()
//    forLoop()
//    social()
//    println(toPower(4,3))
//   println( calculateSum(3,5))
//    println( calculateSum(3,5,5))
//    createUser(112,"abbas","25" ,"baghdad",)
//    createUser(
//        useId=112,
//        userName="abbas alsbihawi",
//        useAge="25" ,
//        userAddress="baghdad",
//        )
//    var myFriends= listOf<String>("abbas","ali","mohammed")
//    println(getMyFriendsDetails(myFriends,'a'))
//    println(doOperation(12,43){num1:Int,num2:Int->num1+num2})
//    println(doOperation{num1:Int,num2:Int->num1+num2})
//   println(myFunction(89,78))
//    myFunction(89,78)


    val myUser=User("abbas","abbas97","079975899","baghdad")
    println(myUser.username)
    println(User.counterUser)
    println(Setting.language)
    Setting.logout(myUser)
    Setting.changeLanguageToEnglish()
    println(Setting.language)

    var myPost =PostVideo()
    println( myPost.likesCount)
    myPost.like()
    myPost.like()
    myPost.like()
    myPost.like()
    println( myPost.likesCount)

//    Mans().isMan()
}


//fun getMyFriendsDetails(myFriends:List<String>,firstChar:Char):List<String>{
//   return myFriends.filter { it[0]==firstChar }
//}
fun getMyFriendsDetails(myFriends:List<String>,firstChar:Char)= myFriends.filter { it[0]==firstChar }

// region high order function
fun doOperation(number1: Int, number2: Int, myFunction: (Int,Int)->Int): Int {
    return myFunction(number1,number2)
}

fun doOperation( myFunction: (Int,Int)->Int): Int {
    return myFunction(885,56)
}
//endregion

// region landbas
//var myFunction={num1:Int,num2:Int->
//    "abbas and landbas : ${num1 + num2}"
//}
//var myFunction:(Int,Int)->String={num1,num2->
//    "abbas and landbas : ${num1 + num2}"
//}
var myFunction:(Int,Int)->Unit={num1,num2->
    println("abbas and landbas : ${num1 + num2}")
}
//endregion

// region  overLoading function calculate

/**
 * this function to calculate between two number and summation
 * @author abbas alsbihawi
 * @param number1 any number must be integer
 * @param number2 any number must be integer
 * @return summation between those number must be integer
 * @see calculateSum
 */
fun calculateSum(number1: Int, number2: Int) =number1+number2
fun calculateSum(number1: Int, number2: Int,number3: Int) =number1+number2+number3
//endregion

fun startVar(){
    println("Hello World!")
    var numberText :String? ="null"
    var numberCHar :Char? ='9'
    println("number :${numberText?.length}")
}
fun rangOption(){
    var numberRang=(0..10).step(2)
     numberRang.printAll()
    numberRang=(30.downTo(0)).step(2)
    numberRang.printAll()
    println("Enter of number : ")
    var number= readln()!!.toInt()
    if (number in numberRang){
        println("in rang")
    }
    else{
        println("out rang")
    }

   var charRang=('m'.downTo('a'))//.step(2) not working
//    charRang.printAll() // not working
    println("Enter of char : ")
    var char= readln()!!.toCharArray()[0]
    if (char in charRang){
        println("in rang")
    }
    else{
        println("out rang")
    }
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


fun IntProgression.printAll () {
    this.forEach{
        println("$it")
    }
}

fun arrayOperation(){
    var mutableArrayData= mutableListOf("abbas","ali","mohamed")
    mutableArrayData.add(2,"ali")
    println(mutableArrayData)
    var immmutableArrayData= listOf("abbas","ali","mohamed")
//    immmutableArrayData.add(2,"ali") // not working because immutable list
    println(immmutableArrayData)
    var arrayData= arrayOf("abbas","ali","mohamed")
//    arrayData[3] = "ali" // not working because immutable array

    arrayData.map { println(it) }
}

/**
 * for (element in data){
 *      Operation  on element
 *     }
 */
fun forLoop() {

    for( i in 0..20 step 3){
        println(i)
    }
    for( i in 0 until 20 step 3){
        println(i)
    }
var array= arrayOf("abbas","ali","mohammed")
    for( i in 0 until array.size){
        println(array[i])
    }
    for(element in array){
        println(element)
    }

    loop1@for( i in 1..5 ){
        loop2@ for( j in 1..5 ){
            if (i==2) break@loop2
            print("${i*j} \t")

        }
        println()
    }
 var number=2080
     while (number>2){
         number/=2
         println(number)
    }
    number=2080
    do{
        number/=2
        println(number)
    }while (number>2)
}

var likesCount=0
fun social(){
    var likesCount=0
   SocialCompactFunction().showLikes(likesCount)
    likesCount=SocialCompactFunction().like(likesCount)
    SocialCompactFunction().showLikes(likesCount)
    likesCount=SocialCompactFunction().like(likesCount)
    SocialCompactFunction().showLikes(likesCount)
    likesCount=SocialCompactFunction().disLike(likesCount)
    SocialCompactFunction().showLikes(likesCount)
    likesCount=SocialCompactFunction().like(likesCount)
    SocialCompactFunction().showLikes(likesCount)
    likesCount=SocialCompactFunction().disLike(likesCount)
    SocialCompactFunction().showLikes(likesCount)
}

fun toPower(number: Int=1,pow:Int=2): Int {
    var result=number
    for (i in 1 until pow){
        result *= number
    }
     return result
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

// region Social
/**
 * Compact Function
 * */
class SocialCompactFunction{
    fun like(oldLikesCount:Int)= oldLikesCount+1
    fun disLike(oldLikesCount:Int)= oldLikesCount+1
    private fun getLikeDetails(likesCount:Int):String="likes : $likesCount"
    fun showLikes(likesCount:Int)= println(getLikeDetails(likesCount))
}

class Social{
    fun like(){
        likesCount++
    }
    fun disLike(){
        likesCount--
    }
    fun getLikeDetails():String{
        return "likes : $likesCount"
    }

    fun showLikes(){
        println(getLikeDetails())
    }
}

//endregion

//region Create User
/**
 * this function to create user and store in database
 * @param userId int ,require and unieq
 * @param userName string
 * @param userAge int age the person must large 18
 * @param userAdsress string
 * */
fun createUser(useId:Int,userName:String,useAge:String ,userAddress:String){
    // create user and store database

    displayUser(userName)

}

fun displayUser(userName: String) {
   println(userName)
}
//endregion