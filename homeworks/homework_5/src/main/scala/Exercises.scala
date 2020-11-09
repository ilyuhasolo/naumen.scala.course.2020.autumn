object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal



  case class Shelter[+T <: Animal](animals: List[T])
  {
    def +[AT >: T <: Animal](animal: AT) = Shelter[AT](animal :: animals)
    def ++[AT >: T <: Animal](shelter: Shelter[AT]) = Shelter[AT](shelter.animals ++ animals)

    def getNames: List[String] = animals.map(_.name)

    def feed(food: Food[T]) = animals.map(food.feed)
  }



  trait Food[-T<:Animal]{
    val name = ""
    def feed(animal: T) = s"${animal.name} eats ${this.name}"
  }

  case object Meat extends Food[Animal] {
    override val name: String = "meat"
  }

  case object Milk extends Food[Cat] {
    override val name: String = "milk"
  }

  case object Bread extends Food[Dog] {
    override val name: String = "bread"
  }
}
