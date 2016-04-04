package sml

/*
the Div instruction is a subclass of superclass Instruction
it is very similar to other instructions that calculate something, but we need to divide the values in
specified registers and put them in a new specified register

NB: Java integer division ---> for example 	8 / 5 = 1

 */

class DivInstruction (label: String, op: String, val result: Int, val op1: Int, val op2: Int)
  extends Instruction(label, op) {

  override def execute(m: Machine) {
    println(this) // added this line, so when the program executes, we can see what exactly has been done ( instruction executed)
    // because it would basically print out the toString method that we specify below
    val value1 = m.regs(op1)
    val value2 = m.regs(op2)
    m.regs(result) = value1 / value2 // dividing values in the specified registers
  }

  override def toString(): String = {
    super.toString + " value in reg " + op1 + " / by value in reg  " + op2 + "  put result in reg  " + result
  }
}

object DivInstruction {
  def apply(label: String, result: Int, op1: Int, op2: Int) =
    new DivInstruction(label, "div", result, op1, op2)

}
