package model

open class Post {
    var user=""
    var contact=""
    var comments= mutableListOf<String>()
    var likesCount=0
    var commentsCount=0

    fun like(){
        likesCount++
        println("have a new like")
    }
    fun addComment(comment:String){
        comments.add(comment)
        println("have a new comment")
    }

}