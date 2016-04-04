package sml

case class LinInstruction(label: String, opcode: String, register: Int, value: Int)
  extends Instruction(label, opcode) {

  override def execute(m: Machine) = {
    println(this) // added this line, so when the program executes, we can see what exactly has been done
    m.regs(register) = value
  }

  override def toString(): String = {
    super.toString + " register " + register + " value is " + value
  }
}

object LinInstruction {
  def apply(label: String, register: Int, value: Int) =
    new LinInstruction(label, "lin", register, value)
}