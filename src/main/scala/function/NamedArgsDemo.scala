package ru.red
package function

object NamedArgsDemo {
  def intSum(a: Int, b: Int): Int = a + b

  def main(args: Array[String]): Unit = {
    println(intSum(b = 7, a = 3))
  }
}
