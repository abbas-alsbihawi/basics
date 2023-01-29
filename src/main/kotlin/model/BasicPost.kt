package model

abstract class BasicPost(var user:String, var contact:String) {

    var comments= mutableListOf<String>()
    var likesCount=0
        private set
    var commentsCount=0
        private set
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