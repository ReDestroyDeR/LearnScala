package ru.red
package function

object CurryingDemo {
  def curryingFunction(a: Int)(b: Int): Int = {
    a + b
  }

  def main(args: Array[String]): Unit = {
    val cf = curryingFunction
    println(s"Currying Function: $cf")
    println(s"Currying Function with one arg: ${cf(7)}")
    println(s"Currying Function with two args: ${cf(7)(8)}")
  }
}
