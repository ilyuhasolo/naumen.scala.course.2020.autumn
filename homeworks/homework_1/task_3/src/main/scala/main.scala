object Main extends App {
  def printScala(name : String, language: String)={
    language match{
      case "English" => println("Hello, Scala! This is " + name)
      case "German" => println("Guten Tag, Scala! This is " + name)
      case "Japanese" => println("Konnichiwa, Scala! This is " + name)
      case _ => throw new IllegalArgumentException
    }
  }

  val name = "Ilya Solodov"
  val reversedName = name.reverse
  val languages = List("English", "German", "Japanese")
  for {i <- 0 to 1
       language <- languages}
    if (i == 0) printScala(name, language)
    else printScala(reversedName, language)
}