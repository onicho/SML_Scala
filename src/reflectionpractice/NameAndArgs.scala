package reflectionpractice

/**
  * Created by ONicholls on 21/02/2016.
  */


class NameAndArgs extends Name

class NameAndArgs2(val size: Int) extends Name {

  override def toString =
    s"${super.toString}($size)"

}
object MyMain extends App{

  val n = new NameAndArgs
  val n2 = new NameAndArgs2(10)

  println(n)
  println(n2)

  class AddInstruction (val op :String) extends Name {
    override def toString =

      s"${super.toString}($op)"

  }

val instruction = new AddInstruction("add")
  println(instruction)



//    println(className(db))
//    println(className(bool))
//    println(className(m))






}