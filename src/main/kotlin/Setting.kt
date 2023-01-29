import model.User

object Setting {

    var language=Language.ARABIC
       private set
    var theme=Theme.DARK
        private set

    fun logout(user: User){
        println("user ${user.username}  logout")
    }
    fun changeLanguageToEnglish(){  language=Language.ENGLISH }
    fun changeLanguageToArabic(){  language=Language.ARABIC }

    fun changeLanguageToDark(){  theme=Theme.DARK}
    fun changeLanguageToLight(){  theme=Theme.LIGHT}
}