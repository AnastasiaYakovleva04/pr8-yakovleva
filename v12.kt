fun main() {
    try {
        print("Сколько фильмов вы хотите внести: ")
        val n = readLine()!!.toInt()
        when
        {
            n <= 0 -> println("Неверно введено количество фильмов")
            else -> {
                val moves = Array(n) { Cinema() } //Массив объектов(фильмов)
                for (i in 0 until n)
                {
                    println(i+1)
                    moves[i].Filling()
                }
                while (true) {
                    println("1. Вывести информацию")
                    println("2. Посчитать выручку с фильма")
                    println("3. Список фильмов")
                    println("4. Посчитать цену для покупки m биетов")
                    println("5. Закончить")
                    val act = readLine()!!.toInt()
                    when (act){
                        1 -> {
                            print("№ фильма: ")
                            val move = readLine()!!.toInt()
                            when{
                                (move in 1..n) -> println(moves[move-1].Info())
                                else -> println("Не найдем фильм с таким номером")
                            }
                        }
                        2 -> {
                            print("№ фильма: ")
                            val move = readLine()!!.toInt()
                            when{
                                (move in 1..n) -> println(moves[move-1].Revenue())
                                else -> println("Не найдем фильм с таким номером")
                            }
                        }
                        3 -> {
                            println(moves[0].MoveList(moves))
                        }
                        4 -> {
                            print("Введите номер фильма: ")
                            val move = readLine()!!.toInt()
                            when {
                                (move in 1..n) ->{
                                    print("Введите количество билетов: ")
                                    val ticket = readLine()!!.toUInt()
                                    when {
                                        (ticket == 0u) -> println("Неверно введено количество билетов")
                                        else -> println(moves[move-1].Pay(moves[move-1].price, ticket))
                                    }
                                }
                                else -> println("Не найдем фильм с таким номером")
                            }
                        }
                        5 -> break
                        else -> println("Неизвестная команда")
                    }
                }
                println("Успешно завершено")
            }
        }
    }
    catch (e: Exception)
    {
        println("Неверный формат данных")
    }
}
