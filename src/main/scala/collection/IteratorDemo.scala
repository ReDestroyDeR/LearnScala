package ru.red
package collection

object IteratorDemo {

  def main(args: Array[String]): Unit = {
    val it = Iterator("Hello", "to", "the", "Scala", "Programming", "Language")

    while (it.hasNext)
      println(it.next())

    val ita = Iterator(5, 30, 4, 60, 30, 15, 40, 20, 14, 17, 4)
    val (min, max) = minmax(ita)
    println(s"Maximum : $max")
    println(s"Minimum : $min")

    val itb = Iterator(5, 30, 4, 60, 30, 15, 40, 20, 14, 17, 4)
    println(s"Size : ${itb.size}")
    println(s"Length : ${itb.length}")
  }

  def minmax(x: Iterator[Int]): (Int, Int) = {
    val (a, b) = x.duplicate
    (a.min, b.max)
  }

}
