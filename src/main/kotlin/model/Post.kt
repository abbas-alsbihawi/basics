package model

  class Post(  user:String,contact:String) :BasicPost(user,contact) {
      override fun edit() {
          println("edit new Post")
      }
}