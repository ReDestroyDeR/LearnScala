package ru.red
package regex

object RegexDemo {
  def main(args: Array[String]): Unit = {
    val pattern = "(S|s)cala[^ ]*".r
    val str = "Scala is scalable and Cool"
    println(pattern findAllIn str mkString ",")
  }
}
