class Cinema {
    var name: String = "name"
    var session: String = "00:00"
    var price: Int = 0
    var hall: Int = 0
    var spectators = 0

    fun Info(obj: Cinema): String{
        val text: String = "Фильм ${obj.name} начинается в ${obj.session}, стоит ${obj.price} рублей, показывался в зале №${obj.hall}, смотрело ${obj.spectators} человек"
        return text
    }
    fun Revenue(price: Int, spectators: Int) :Int{
        val rev = price * spectators
        return rev
    }
}