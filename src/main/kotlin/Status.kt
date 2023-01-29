import model.Post

sealed class Status

class Success(var list: List<Post>):Status()

class Loading:Status()

class Failed:Status()
