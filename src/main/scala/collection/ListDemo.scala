package ru.red
package collection

import scala.collection.immutable.List

object ListDemo {
  def main(args: Array[String]): Unit = {
    val fruitList: List[String] = List("apple", "orange", "pear")
    val countryList: List[String] = "Russia" :: ("Moldova" :: ("Netherlands" :: Nil))
    val emptyList: List[Nothing] = List()
    val twoDimensionalList: List[List[Int]] = List(
      List(1, 2, 3),
      List(2, 4, 5),
      List(3, 5, 6)
    )

    val alternative2DList = (1 :: (2 :: (3 :: Nil))) ::
                            (2 :: (4 :: (5 :: Nil))) ::
                            (3 :: (5 :: (6 :: Nil))) :: Nil

    println(s"County list : $countryList")
    println(s"Head of country : ${countryList.head}")
    println(s"Tail of country : ${countryList.tail}")
    println(s"Is country list empty : ${countryList.isEmpty}")
    println(s"Is empty list empty : ${emptyList.isEmpty}")

    println("\nConcatenation:")
    println(s"fruitList ::: countryList} ${fruitList ::: countryList}")
    println(s"fruitList.:::(countryList) : ${fruitList.:::(countryList)}")
    println(s"List.concat(fruitList, countryList) : ${List.concat(fruitList, countryList)}")

    println("\nGenerating a list:")
    println(s"List.fill(5)(\"banana\") : ${List.fill(5)("banana")}")
    println(s"List.tabulate(5)(square) : ${List.tabulate(5)(square)}")


    def square(x: Int): Int = {
      x * x
    }

  }
}
