object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = seq.reverse

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */
  def fibonacci4Index(idx: Int): Int = {
    if (idx == 0) return 0
    if (idx <= 2) return 1
    var x = 1
    var y = 1
    var ans = 0
    for (counter <- 2 to idx-1)
    {
      ans = x + y
      x = y
      y = ans
    }
    ans
  }

  def fibonacci(idx: Int): Seq[Int] = {
    var res = Seq()
    for(counter <- 0 to idx)
      res :+= fibonacci4Index(counter)
    res
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String = {
    text.toUpperCase.split("").map(symbol =>
      if (MORSE.contains(symbol))
        MORSE(symbol)
      else symbol).mkString(" ")
  }


  def wordReverse(text: String): String = {
    text.split("(?=[!. ,?])|(?<=[!. ,?])").map(word => if (word.charAt(0).isUpper) {
      word.toLowerCase.reverse.capitalize
    } else word.reverse).mkString("")
  }
}
