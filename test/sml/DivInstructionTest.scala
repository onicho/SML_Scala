package sml

import org.scalatest.FunSuite

/**
  * Created by ONicholls on 20/02/2016.
  */


class DivInstructionTest extends FunSuite {

  test("testOp2") {

    val DivInstruction = new DivInstruction("F1", "div", 2, 5, 1000000)
    assert(DivInstruction.op2 == 1000000)

  }

  test("testToString") {

    val DivInstruction = new DivInstruction("L1", "div", 2, 5, 1000000)

    assert(DivInstruction.toString() == "L1: div value in reg " + 5.toString
      + " / by value in reg  " + 1000000.toString + "  put result in reg  " + 2.toString)

  }

  test("testOp1") {

    val DivInstruction = new DivInstruction("F1", "div", 2, 5, 1000000)
    assert(DivInstruction.op1 == 5)

  }

}
