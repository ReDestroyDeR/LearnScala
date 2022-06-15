package ru.red
package function

object ClosureDemo {

  def main(args: Array[String]): Unit = {
    val sum = (a: Int, b: Int) => a + b
    println(sum(2, 5))
  }

}
