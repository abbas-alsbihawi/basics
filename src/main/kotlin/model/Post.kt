package model

import Interface.EditablePost

class Post(  user:String,contact:String) :BasicPost(user,contact), EditablePost {
      override fun edit() {
          println("edit new Post")
      }

    var postHeader="Header"
  inner  class MyClass{
        fun foo(){
            println("nested class ")
            postHeader="nested class Header"
        }
    }
}