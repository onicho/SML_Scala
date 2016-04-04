package sml

class BnzInstruction(label: String, op: String, val op1: Int, goTolabel: String)
extends Instruction(label, op){
  override def execute(m: Machine) {
    println(this)
    val value1 = m.regs(op1)
    if (value1 != 0) {
      val id = seqId(goTolabel, m)
      m.execute(id,seqId(label, m) )
    }
  }

  override def toString(): String = {
    super.toString + " " + op1 + " moving execution to " + goTolabel
  }



  def seqId(label: String, m: Machine): Int = {
    val filtered = m.prog.filter((p: Instruction) => p.getLabel()==label)
    if (filtered.length > 1)
      throw new Exception("Too many copies of the same label")
    if (filtered.length < 1)
      throw new Exception("No copies of the label found")
    m.prog.indexOf(filtered.last)
  }



}

object BnzInstruction {
  def apply(label: String, op1: Int, goTolabel: String) =
    new BnzInstruction(label, "bnz", op1, goTolabel)
}