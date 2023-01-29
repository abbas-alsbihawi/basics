package model

open class PostVideo(user:String,  contact:String) : BasicPost(user,contact)  {
    protected var videoLink360=""
    override fun edit() {

    }
    fun fromClass(){
        videoLink360="abbas"
    }
}