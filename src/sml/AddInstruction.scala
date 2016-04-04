package sml

class AddInstruction(label: String, op: String, val result: Int, val op1: Int, val op2: Int)
  extends Instruction(label, op) {

  override def execute(m: Machine) {
    println(this) // added this line, so when the program executes, we can see what exactly has been done ( instruction executed)
    // because it would basically print out the toString method that we specify below
    val value1 = m.regs(op1)
    val value2 = m.regs(op2)
    m.regs(result) = value1 + value2
  }

  override def toString(): String = {
    super.toString + " value in reg " + op1 + " + value in reg " + op2 + " put result in reg " + result
  }
}


object AddInstruction {
  def apply(label: String, result: Int, op1: Int, op2: Int) =
    new AddInstruction(label, "add", result, op1, op2)
}