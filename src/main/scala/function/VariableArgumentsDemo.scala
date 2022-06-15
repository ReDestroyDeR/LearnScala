package ru.red
package function

object VariableArgumentsDemo {
  def sumAll(ints: Int*): Int = {
    ints.sum
  }


  def main(args: Array[String]): Unit = {
    println(sumAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
  }

}
