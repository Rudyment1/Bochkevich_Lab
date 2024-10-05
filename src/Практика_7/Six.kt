package Практика_7

import kotlin.random.Random
fun main(){
    val cards= mapOf("Туз черви" to 11 , "Туз буби" to 11, "Туз крести" to 11, "Туз пики" to 11,
        "Король крести" to 4, "Король буби" to 4, "Король черви" to 4, "Король пики" to 4,
        "Дама буби" to 3,"Дама крести" to 3,"Дама пики" to 3,"Дама черви" to 3,
        "Валет буби" to 2,"Валет крести" to 2,"Валет пики" to 2,"Валет черви" to 2,
        "Десять буби" to 10,"Десять крести" to 10,"Десять черви" to 10,"Десять пики" to 10,
        "Девять буби" to 9,"Девять крести" to 9,"Девять пики" to 9,"Девять черви" to 9,
        "Восемь буби" to 8,"Восемь крести" to 8,"Восемь пики" to 8,"Восемь черви" to 8,
        "Семь крести" to 7,"Семь буби" to 7,"Семь пики" to 7, "Семь черви" to 7,
        "Шесть буби" to 6,"Шесть крести" to 6,"Шесть черви" to 6,"Шесть пики" to 6,
        "Пять буби" to 5,"Пять крести" to 5,"Пять пики" to 5,"Пять черви" to 5,
        "Четыре буби" to 4,"Четыре крести" to 4,"Четыре пики" to 4,"Четыре черви" to 4,
        "Три буби" to 3,"Три крести" to 3,"Три пики" to 3,"Три черви" to 3,
        "Два буби" to 2,"Два крести" to 2,"Два пики" to 2,"Два черви" to 2)
    println("Вы хотите играть? yes или no")
    if (readln() == "yes") {
        val cardNames = cards.keys.toMutableList()
        var scopedealer = 0
        var score = 0
        val hand: MutableList<String> = mutableListOf()
        val handdealer: MutableList<String> = mutableListOf()

        // Сначала раздаем 2 карты
        for (i in 1..2) {
            if (cardNames.isNotEmpty()) {
                val index = Random.nextInt(cardNames.size)
                hand.add(cardNames[index])
                score += cards[cardNames[index]] ?: 0
                cardNames.removeAt(index)

                if (cardNames.isNotEmpty()) {
                    val index2 = Random.nextInt(cardNames.size)
                    handdealer.add(cardNames[index2])
                    scopedealer += cards[cardNames[index2]] ?: 0
                    cardNames.removeAt(index2)
                }
            }
        }

        println("Первая карта дилера: ${handdealer[0]}")
        println("Ваши карты: $hand")
        println("Ваш счет: $score")

        while (true) {
            if (cardNames.isEmpty()) {
                println("Карты закончились!")
                break
            }

            if (score < 21) {
                println("Хотите взять еще карту? yes или no")
                val response = readln()
                if (response == "n") {
                    while (scopedealer < 17) {
                        if (cardNames.isNotEmpty()) {
                            val index2 = Random.nextInt(cardNames.size)
                            handdealer.add(cardNames[index2])
                            scopedealer += cards[cardNames[index2]] ?: 0
                            cardNames.removeAt(index2)
                        }
                    }
                    println("Ваш итоговый счет: $score, счет дилера: $scopedealer")
                    println("Карты дилера ${handdealer}")
                    if (scopedealer > 21 || score > scopedealer) {
                        println("Вы выиграли!")
                        println("Вы хотите играть еще")
                        val answer= readln()
                        if (answer=="y"){
                            score=0
                            scopedealer=0
                            handdealer.clear()
                            hand.clear()
                            for (i in 1..2) {
                                if (cardNames.isNotEmpty()) {
                                    val index = Random.nextInt(cardNames.size)
                                    hand.add(cardNames[index])
                                    score += cards[cardNames[index]] ?: 0
                                    cardNames.removeAt(index)

                                    if (cardNames.isNotEmpty()) {
                                        val index2 = Random.nextInt(cardNames.size)
                                        handdealer.add(cardNames[index2])
                                        scopedealer += cards[cardNames[index2]] ?: 0
                                        cardNames.removeAt(index2)
                                    }
                                }
                            }

                            println("Первая карта дилера: ${handdealer[0]}")
                            println("Ваши карты: $hand")
                            println("Ваш счет: $score")
                        }
                        else break
                    } else if (score < scopedealer) {
                        println("Вы проиграли!")
                        println("Вы хотите играть еще")
                        val answer= readln()
                        if (answer=="y"){
                            score=0
                            scopedealer=0
                            handdealer.clear()
                            hand.clear()
                            for (i in 1..2) {
                                if (cardNames.isNotEmpty()) {
                                    val index = Random.nextInt(cardNames.size)
                                    hand.add(cardNames[index])
                                    score += cards[cardNames[index]] ?: 0
                                    cardNames.removeAt(index)

                                    if (cardNames.isNotEmpty()) {
                                        val index2 = Random.nextInt(cardNames.size)
                                        handdealer.add(cardNames[index2])
                                        scopedealer += cards[cardNames[index2]] ?: 0
                                        cardNames.removeAt(index2)
                                    }
                                }
                            }

                            println("Первая карта дилера: ${handdealer[0]}")
                            println("Ваши карты: $hand")
                            println("Ваш счет: $score")
                        }
                        else break
                    } else {
                        println("Ничья!")
                        println("Вы хотите играть еще")
                        val answer= readln()
                        if (answer=="y"){
                            score=0
                            scopedealer=0
                            handdealer.clear()
                            hand.clear()
                            for (i in 1..2) {
                                if (cardNames.isNotEmpty()) {
                                    val index = Random.nextInt(cardNames.size)
                                    hand.add(cardNames[index])
                                    score += cards[cardNames[index]] ?: 0
                                    cardNames.removeAt(index)

                                    if (cardNames.isNotEmpty()) {
                                        val index2 = Random.nextInt(cardNames.size)
                                        handdealer.add(cardNames[index2])
                                        scopedealer += cards[cardNames[index2]] ?: 0
                                        cardNames.removeAt(index2)
                                    }
                                }
                            }

                            println("Первая карта дилера: ${handdealer[0]}")
                            println("Ваши карты: $hand")
                            println("Ваш счет: $score")
                        }
                        else break
                    }

                } else if (response == "y") {
                    val index = Random.nextInt(cardNames.size)
                    hand.add(cardNames[index])
                    score += cards[cardNames[index]] ?: 0
                    cardNames.removeAt(index)

                    println("Ваши карты: $hand")
                    println("Ваш счет: $score")

                    if (score > 21) {
                        println("Вы проиграли!")
                        println("Вы хотите играть еще")
                        val answer= readln()
                        if (answer=="y"){
                            score=0
                            scopedealer=0
                            handdealer.clear()
                            hand.clear()
                            for (i in 1..2) {
                                if (cardNames.isNotEmpty()) {
                                    val index = Random.nextInt(cardNames.size)
                                    hand.add(cardNames[index])
                                    score += cards[cardNames[index]] ?: 0
                                    cardNames.removeAt(index)

                                    if (cardNames.isNotEmpty()) {
                                        val index2 = Random.nextInt(cardNames.size)
                                        handdealer.add(cardNames[index2])
                                        scopedealer += cards[cardNames[index2]] ?: 0
                                        cardNames.removeAt(index2)
                                    }
                                }
                            }

                            println("Первая карта дилера: ${handdealer[0]}")
                            println("Ваши карты: $hand")
                            println("Ваш счет: $score")
                        }
                        else break
                    } else if (score == 21) {
                        println("Вы выиграли!")
                        println("Вы хотите играть еще")
                        val answer= readln()
                        if (answer=="y"){
                            score=0
                            scopedealer=0
                            handdealer.clear()
                            hand.clear()
                            for (i in 1..2) {
                                if (cardNames.isNotEmpty()) {
                                    val index = Random.nextInt(cardNames.size)
                                    hand.add(cardNames[index])
                                    score += cards[cardNames[index]] ?: 0
                                    cardNames.removeAt(index)

                                    if (cardNames.isNotEmpty()) {
                                        val index2 = Random.nextInt(cardNames.size)
                                        handdealer.add(cardNames[index2])
                                        scopedealer += cards[cardNames[index2]] ?: 0
                                        cardNames.removeAt(index2)
                                    }
                                }
                            }

                            println("Первая карта дилера: ${handdealer[0]}")
                            println("Ваши карты: $hand")
                            println("Ваш счет: $score")
                        }
                        else break
                    }
                } else {
                    println("Неверный ввод, попробуйте снова.")
                }
            } else if (score == 21) {
                println("Вы выиграли!")
                println("Вы хотите играть еще")
                var answer= readln()
                if (answer=="y"){
                    score=0
                    scopedealer=0
                    handdealer.clear()
                    hand.clear()
                    for (i in 1..2) {
                        if (cardNames.isNotEmpty()) {
                            val index = Random.nextInt(cardNames.size)
                            hand.add(cardNames[index])
                            score += cards[cardNames[index]] ?: 0
                            cardNames.removeAt(index)

                            if (cardNames.isNotEmpty()) {
                                val index2 = Random.nextInt(cardNames.size)
                                handdealer.add(cardNames[index2])
                                scopedealer += cards[cardNames[index2]] ?: 0
                                cardNames.removeAt(index2)
                            }
                        }
                    }

                    println("Первая карта дилера: ${handdealer[0]}")
                    println("Ваши карты: $hand")
                    println("Ваш счет: $score")
                }
                else break
            } else if (score > 21) {
                println("Вы проиграли!")
                println("Вы хотите играть еще")
                val answer= readln()
                if (answer=="y"){
                    score=0
                    scopedealer=0
                    handdealer.clear()
                    hand.clear()
                    for (i in 1..2) {
                        if (cardNames.isNotEmpty()) {
                            val index = Random.nextInt(cardNames.size)
                            hand.add(cardNames[index])
                            score += cards[cardNames[index]] ?: 0
                            cardNames.removeAt(index)

                            if (cardNames.isNotEmpty()) {
                                val index2 = Random.nextInt(cardNames.size)
                                handdealer.add(cardNames[index2])
                                scopedealer += cards[cardNames[index2]] ?: 0
                                cardNames.removeAt(index2)
                            }
                        }
                    }

                    println("Первая карта дилера: ${handdealer[0]}")
                    println("Ваши карты: $hand")
                    println("Ваш счет: $score")
                }
                else break
            }
        }
    } else {
        println("Ну че тогда пришел, кыш!")
    }
}