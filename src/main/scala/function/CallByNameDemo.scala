package ru.red
package function

object CallByNameDemo {
  def byName(t: => Int): Unit = {
    println("Execution in by name")
    println(t)
  }

  def byValue(t: Int): Unit = {
    println("Execution in by value")
    println(t)
  }

  def sum(a: Int, b: Int): Int = {
    println(s"Summing $a + $b")
    a + b
  }

  def main(args: Array[String]): Unit = {
    // You should consider sum invocation as an EXPRESSION, not FUNCTION
    byValue(sum(5, 6))
    byName(sum(3, 4))
  }
}
