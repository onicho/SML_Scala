package sml

abstract class Instruction(label: String, opcode: String) { // this is the super class for all instructions. every instruction has a label and assigned operation

  override def toString(): String = label + ": " + opcode // this method should return a string e.g. "L1: add"

  def execute(m: Machine): Unit // abstract method to be overridden by subclasses

  def getLabel(): String = label // added a getter method for the instruction label, so the machine is able to get the label of an instruction (def SeqId)
}