package model

class PostImage(user:String,  contact:String) : Post(user,contact)  {

    var imageLink=""
    override fun editPost() {
        super.editPost()
        println("upload new Image")
    }
}