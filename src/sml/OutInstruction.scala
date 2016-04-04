package sml

case class OutInstruction (label: String, opcode: String, register: Int)
  extends Instruction(label, opcode){


  override def execute(m: Machine) = {
    println(this) // added this line, so when the program executes, we can see what exactly has been done
    println("The value is " + m.regs(register))
  }

  override def toString(): String = {
    super.toString + " printing out the value in the register No " + register
  }
}

object OutInstruction {
  def apply(label: String, register: Int) =
    new OutInstruction(label, "out", register)
}







