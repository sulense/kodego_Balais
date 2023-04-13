package activity05_d

import kotlin.random.Random


//Coverage : OOP Inheritance, Encapsulation, Polymorphism, Abstraction
//You are tasked to create a game.
//The game is snake and ladders.
//Identify and create the class that will be needed to implement Snakes and ladders.
//Hint:
//You will need an array to represent the board.
//You will need snakes, ladders and players.
//Use all OOP concepts.



//Unit test for this



class Player(val name: String) {//Encapsulation
    var currentPosition = 0

    fun rollDice(): Int {
        return Random.nextInt(1, 7)
    }
}

class Game(private val numPlayers: Int, private val boardSize: Int) { //ABSTRACTION
    private val players = mutableListOf<Player>()
    private val board = Board(boardSize)

    init {
        board.addSnake(Snake(17, 7))
        board.addSnake(Snake(54, 34))
        board.addSnake(Snake(62, 19))
        board.addSnake(Snake(64, 60))
        board.addSnake(Snake(87, 36))
        board.addSnake(Snake(93, 73))
        board.addSnake(Snake(95, 75))
        board.addSnake(Snake(99, 78))

        board.addLadder(Ladder(4, 14))
        board.addLadder(Ladder(9, 31))
        board.addLadder(Ladder(20, 38))
        board.addLadder(Ladder(28, 84))
        board.addLadder(Ladder(40, 59))
        board.addLadder(Ladder(51, 67))
        board.addLadder(Ladder(63, 81))
        board.addLadder(Ladder(71, 91))

        for (i in 1..numPlayers) {
            players.add(Player("Player $i"))
        }
    }



    fun playGame() { // POLYMORPHISM

        var currentPlayerIndex = 0

        while (true) {
            val currentPlayer = players[currentPlayerIndex]
            val diceValue = currentPlayer.rollDice()

            println("${currentPlayer.name} rolls a $diceValue.")

            currentPlayer.currentPosition += diceValue

            if (currentPlayer.currentPosition >= boardSize) {
                println("${currentPlayer.name} wins!")
                break
            }

            currentPlayer.currentPosition = board.getNextPosition(currentPlayer.currentPosition)

            println("${currentPlayer.name} is now at position ${currentPlayer.currentPosition}.")

            currentPlayerIndex = (currentPlayerIndex + 1) % numPlayers
        }
    }
}

//INHERITANCE
open class BoardElement(val start: Int, val end: Int)

class Snake(start: Int, end: Int) : BoardElement(start, end)

class Ladder(start: Int, end: Int) : BoardElement(start, end)

class Board(private val size: Int) {

    private val snakes = mutableListOf<Snake>()
    private val ladders = mutableListOf<Ladder>()

    fun addSnake(snake: Snake) {
        snakes.add(snake)
    }

    fun addLadder(ladder: Ladder) {
        ladders.add(ladder)
    }

    fun getNextPosition(currentPosition: Int): Int {
        var nextPosition = currentPosition

        for (snake in snakes) {
            if (snake.start == currentPosition) {
                nextPosition = snake.end
                break
            }
        }

        for (ladder in ladders) {
            if (ladder.start == currentPosition) {
                nextPosition = ladder.end
                break
            }
        }

        return nextPosition
    }
}

fun main() {
    val game = Game(2, 100)
    game.playGame()
}

//class Player(val name: String) {
//    var currentPosition = 0
//
//    fun rollDice(): Int {
//        return Random.nextInt(1, 7)
//    }
//}
//
//class Snake(val start: Int, val end: Int)
//
//class Ladder(val start: Int, val end: Int)
//
//class Board(val size: Int) {
//    val snakes = mutableListOf<Snake>()
//    val ladders = mutableListOf<Ladder>()
//
//    fun addSnake(snake: Snake) {
//        snakes.add(snake)
//    }
//
//    fun addLadder(ladder: Ladder) {
//        ladders.add(ladder)
//    }
//
//    fun getNextPosition(currentPosition: Int): Int {
//        var nextPosition = currentPosition
//
//        for (snake in snakes) {
//            if (snake.start == currentPosition) {
//                nextPosition = snake.end
//                break
//            }
//        }
//
//        for (ladder in ladders) {
//            if (ladder.start == currentPosition) {
//                nextPosition = ladder.end
//                break
//            }
//        }
//
//        return nextPosition
//    }
//}
//
//class Game(val numPlayers: Int, val boardSize: Int) {
//    val players = mutableListOf<Player>()
//    val board = Board(boardSize)
//
//    init {
//        board.addSnake(Snake(17, 7))
//        board.addSnake(Snake(54, 34))
//        board.addSnake(Snake(62, 19))
//        board.addSnake(Snake(64, 60))
//        board.addSnake(Snake(87, 36))
//        board.addSnake(Snake(93, 73))
//        board.addSnake(Snake(95, 75))
//        board.addSnake(Snake(99, 78))
//
//        board.addLadder(Ladder(4, 14))
//        board.addLadder(Ladder(9, 31))
//        board.addLadder(Ladder(20, 38))
//        board.addLadder(Ladder(28, 84))
//        board.addLadder(Ladder(40, 59))
//        board.addLadder(Ladder(51, 67))
//        board.addLadder(Ladder(63, 81))
//        board.addLadder(Ladder(71, 91))
//
//        for (i in 1..numPlayers) {
//            players.add(Player("Player $i"))
//        }
//    }
//
//    fun playGame() {
//        var currentPlayerIndex = 0
//
//        while (true) {
//            val currentPlayer = players[currentPlayerIndex]
//            val diceValue = currentPlayer.rollDice()
//
//            println("${currentPlayer.name} rolls a $diceValue.")
//
//            currentPlayer.currentPosition += diceValue
//            if (currentPlayer.currentPosition >= boardSize) {
//                println("${currentPlayer.name} wins!")
//                break
//            }
//
//            currentPlayer.currentPosition = board.getNextPosition(currentPlayer.currentPosition)
//
//            println("${currentPlayer.name} is now at position ${currentPlayer.currentPosition}.")
//
//            currentPlayerIndex = (currentPlayerIndex + 1) % numPlayers
//        }
//    }
//}
//

