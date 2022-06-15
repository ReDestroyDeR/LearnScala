package ru.red
package collection

object TupleDemo {

  def main(args: Array[String]): Unit = {
    val tuple3 = (1, "Hello", 3.145)
    tuple3.productIterator.foreach(println)
    println(tuple3.toString())

    val tuple2 = Tuple2("Obama", "Barack")
    println(s"Swapped tuple: ${tuple2.swap}")
  }

}
