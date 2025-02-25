fun main() {
    try {
        print("Сколько фильмов вы хотите внести: ")
        val n = readln().toInt()
        when
        {
            n <= 0 -> println("Неверно введено количество фильмов")
            else -> {
                val moves = Array(n) { Cinema() }
                for (i in 0 until n)
                {
                    println(i+1)
                    moves[i].Filling()
                }
                while (true) {
                    println("1. Вывести информацию")
                    println("2. Посчитать выручку с фильма")
                    println("3. Закончить")
                    val act = readln().toInt()
                    when (act){
                        1 -> {
                            print("№ фильма: ")
                            val move = readln().toInt()
                            when{
                                (move in 1..n) -> println(moves[move-1].Info())
                                else -> println("Не найдем фильм с таким номером")
                            }
                        }
                        2 -> {
                            print("№ фильма: ")
                            val move = readln().toInt()
                            when{
                                (move in 1..n) -> println(moves[move-1].Revenue())
                                else -> println("Не найдем фильм с таким номером")
                            }
                        }
                        3 -> break
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
