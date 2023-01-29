import model.User

object Setting {

    var language="Arabic"
       private set
    var theme="Dark"
        private set

    fun logout(user: User){
        println("user ${user.username}  logout")
    }
    fun changeLanguageToEnglish(){  language="English" }
    fun changeLanguageToArabic(){  language="Arabic" }

    fun changeLanguageToDark(){  theme="Dark" }
    fun changeLanguageToLight(){  theme="Light" }
}