package model

class PostImage(user:String,  contact:String)  :BasicPost(user,contact) {
    var imageLink=""
    override fun edit() {
        println("upload new Image")
    }
}