package sml

/*
the Sub instruction is a subclass of superclass Instruction
it is very similar to the AddInstruction class, but we need to do
subtraction instead of addition of values

 */


class SubInstruction(label: String, op: String, val result: Int, val op1: Int, val op2: Int)
  extends Instruction(label, op) {


  override def execute(m: Machine){
    println(this) // added this line, so when the program executes, we can see what exactly has been done ( instruction executed)
    val value1 = m.regs(op1)
    val value2 = m.regs(op2)
    m.regs(result) =  value1 - value2 // we subtract the values
  }

  override def toString(): String = {
    super.toString + " value in reg " + op2 + " - value in reg " + op1 + "  put result in reg " + result
  }
}

object SubInstruction {
  def apply(label: String, result: Int, op1: Int, op2: Int) =
    new SubInstruction(label, "sub", result, op1, op2)
}