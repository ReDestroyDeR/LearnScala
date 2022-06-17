package ru.red
package exception

import java.io.{FileNotFoundException, FileReader, IOException}

object ExceptionDemo {
  def main(args: Array[String]): Unit = {
    try {
      val file = FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException =>
        println(s"Missing input file - ${ex.getMessage}")
      case ex: IOException =>
        println(s"IO Exception - ${ex.getMessage}")
    } finally {
      println("Exciting finally")
    }

    throw TestException("Hello, World!")
  }
}
