package activity05_d

// Parent class for all game pieces (snakes, ladders, players)
abstract class GamePiece(var position: Int) {
    abstract fun move(distance: Int)
}

// Snake class inherits from GamePiece and represents a snake on the board
class Snake(position: Int, val endPosition: Int): GamePiece(position) {
    override fun move(distance: Int) {
        position = endPosition
    }
}

// Ladder class inherits from GamePiece and represents a ladder on the board
class Ladder(position: Int, var endPosition: Int): GamePiece(position) {
    override fun move(distance: Int) {
        position = endPosition
    }
}

// Player class inherits from GamePiece and represents a player on the board
class Player(position: Int, val name: String): GamePiece(position) {
    override fun move(distance: Int) {
        position += distance
    }
}

// Board class represents the game board and contains a list of game pieces (snakes, ladders, players)
class Board {
    private val gamePieces = mutableListOf<GamePiece>()

    fun addGamePiece(gamePiece: GamePiece) {
        gamePieces.add(gamePiece)
    }

    fun removeGamePiece(gamePiece: GamePiece) {
        gamePieces.remove(gamePiece)
    }

    fun moveGamePiece(gamePiece: GamePiece, distance: Int) {
        gamePiece.move(distance)
    }
}

// Game class represents the Snake and Ladders game and contains a Board object
class Game {
    val board = Board()

    fun addGamePiece(gamePiece: GamePiece) {
        board.addGamePiece(gamePiece)
    }

    fun removeGamePiece(gamePiece: GamePiece) {
        board.removeGamePiece(gamePiece)
    }

    fun moveGamePiece(gamePiece: GamePiece, distance: Int) {
        board.moveGamePiece(gamePiece, distance)
    }
}
