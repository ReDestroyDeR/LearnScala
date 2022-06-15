package ru.red
import Array._

object General {
  val factor = 3
  val multiplier: Int => Int = (x: Int) => x * factor

  def salam(x: Int): String = {
    "salam" + x
  }

  def main(args: Array[String]): Unit = {
    val name = "James"
    println(s"Hello, $name")
    println(s"3 * 6 = ${multiplier(6)}")
    println(tabulate(10)(salam).mkString("Array(", ", ", ")"))
  }

}
