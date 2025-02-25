fun main() {
    try {
            val move: Cinema = Cinema()
            print("Название: ")
            move.name = readln()
           print("Сеанс: ")
            move.session = readln()
            print("Залл: ")
            move.hall = readln().toInt()
            print("Цена: ")
            move.price = readln().toInt()
            print("Количество зврителей: ")
            move.spectators = readln().toInt()
            println(move.Info(move))
            println("Выручка с сеанса = ${move.Revenue(move.price, move.spectators)}")
    }
    catch (e: Exception)
    {
        println("Неверный формат данных")
    }
}