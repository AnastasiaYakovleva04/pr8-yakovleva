class Cinema constructor() {
    var name: String = "name" //название фильма
    var session: String = "24:00" //время начала сеанса
    var price: UInt = 0u //цена
    var hall: UInt = 0u //зал
    var spectators: UInt = 0u //количество мест для зрителей

    //Ввести информацию о фильме
    fun Filling(){
        try {
            print("Название фильма: ")
            name = readLine()!!.toString()
            print("Сеанс: ")
            session = readLine()!!.toString()
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
            hall = readLine()!!.toUInt()
            if (hall == 0u) {
                println("Неверно введен номер зала")
                return
            }
            print("Цена: ")
            price = readLine()!!.toUInt()
            if (price == 0u) {
                println("Неверно введена цена")
                return
            }
            print("Количество мест: ")
            spectators = readLine()!!.toUInt()
            if (spectators == 0u){
                println("Неверно введено коичество мест для зрителей")
                return
            }
            println()
        }
        catch (e: Exception) {
            println("Неверный формат данных")
        }
    }

    //Вывести информацию о фильме
    fun Info(): String{
        var inf: String = ""
        if (session == "24:00" || price == 0u || hall == 0u || spectators == 0u){
            inf = "Информация была введена некорректно"
        }
        else {
            inf = "Фильм \"$name\" начинается в $session, стоит $price рублей, показывается в зале №$hall, $spectators мест"
        }
        return inf
    }

    //Подсчет выручки
    fun Revenue() :UInt{
        val rev = price * spectators
        return rev
    }

    //Список названий фильмов
    fun MoveList(moves: Array<Cinema>): String{
        var list: String = ""
        for (i in 0 until moves.size)
        {
            list += "\"${moves[i].name}\" "
        }
        return list
    }

    //Подсчет стоимости для m билетов
    fun Pay(price: UInt, m: UInt):UInt{
        val totalPrice = price * m
        return  totalPrice
    }
}
