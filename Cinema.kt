class Cinema {
    var name: String = "name"
    var session: String = "00:00"
    var price: UInt = 0u
    var hall: UInt = 0u
    var spectators: UInt = 0u
    fun Filling(){
        try {
            print("Название фильма: ")
            name = readln()
            print("Сеанс: ")
            session = readln()
            if (session.length != 5 ||
                (!session[0].isDigit() || session[0] != '0' && session[0] != '1' && session[0] != '2')
                || !session[1].isDigit() || (session[0] == '2'
                && (session[1] == '5' || session[1] == '6' || session[1] == '7' || session[1] == '8' || session[1] == '9'))
                || session[2] != ':'
                || !session[3].isDigit() || session[3] == '6' || session[3] == '7' || session[3] == '8' || session[3] == '9'
                || !session[4].isDigit()
            ) {
                println("Неверно введено время начала сеанса")
                return
            }
            print("Зал: ")
            hall = readln().toUInt()
            print("Цена: ")
            price = readln().toUInt()
            print("Количество мест: ")
            spectators = readln().toUInt()
            println()
        }
        catch (e: Exception) {
            println("Неверный формат данных")
        }
    }
    fun Info(): String{
        return "Фильм ${name} начинается в ${session}, стоит ${price} рублей, показывается в зале №${hall}, ${spectators} мест"
    }
    fun Revenue() :UInt{
        val rev = price * spectators
        return rev
    }
}
