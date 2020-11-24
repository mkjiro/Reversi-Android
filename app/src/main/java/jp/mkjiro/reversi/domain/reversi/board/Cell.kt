package jp.mkjiro.reversi.reversi.board

data class Cell(
    var color: CellColor,
    var piece: Piece
)

enum class CellColor {
    NONE,
    GREEN,
    RED
}