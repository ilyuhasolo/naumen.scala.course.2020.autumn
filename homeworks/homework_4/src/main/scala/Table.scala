import scala.collection.mutable

class Table(width: Int, height: Int){
  private val table = mutable.Map[(Int, Int), Cell]()

  for {x <- 0 to width
       y <- 0 to height}
    table((x, y)) = new EmptyCell

  def setCell(ix: Int, iy: Int, cell: Cell): Unit ={
    if (ix < width && ix >= 0 && iy < height && iy >= 0)
      table((ix, iy)) = cell
  }

  def getCell(ix: Int, iy: Int): Option[Cell] ={
    if (ix < width && ix >= 0 && iy < height && iy >= 0)
      Some(table((ix, iy))
    else
      None
  }
}