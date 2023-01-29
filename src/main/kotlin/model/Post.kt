package model

open class Post(var user:String, var contact:String) {

    var comments= mutableListOf<String>()
    var likesCount=0
    var commentsCount=0
        get() = comments.size

    fun like(){
        likesCount++
        println("have a new like")
    }
    fun addComment(comment:String){
        comments.add(comment)
        println("have a new comment")
    }

}