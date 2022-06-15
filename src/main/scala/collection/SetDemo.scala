package ru.red
package collection

object SetDemo {
  def main(args: Array[String]): Unit = {
    val fruitSet = Set("apple", "orange", "pear")
    val numSet: Set[Int] = Set()

    println(s"Fruit set : $fruitSet")
    println(s"Fruit set head : ${fruitSet.head}")
    println(s"Fruit set tail : ${fruitSet.tail}")
    println(s"Fruit set empty? : ${fruitSet.isEmpty}")
    println(s"Num set empty? : ${numSet.isEmpty}")

    val exoticFruitSet = Set("mango", "banana")

    println("\nAddition")
    // ++ as operator
    var allFruitSet = fruitSet ++ exoticFruitSet
    println(s"fruitSet ++ exoticFruitSet $allFruitSet")

    // ++ as method
    allFruitSet = fruitSet.++(exoticFruitSet)
    println(s"fruitSet.++(exoticFruitSet) $allFruitSet")


    var firstNumSet = Set(7, 13, 24, 54, 18, 2, 9, 42)
    var secondNumSet = Set(39, 14, 24, 4, 18, 9, 3, 8)
    println(s"DataSet: \n" +
      s"firstNumSet: $firstNumSet\n" +
      s"secondNumSet: $secondNumSet")

    println("\nSubtraction")
    println(s"firstNumSet -- secondNumSet : ${firstNumSet -- secondNumSet}")
    println(s"secondNumSet -- firstNumSet : ${secondNumSet -- firstNumSet}")

    println("\nDifference")
    println(s"firstNumSet &~ secondNumSet : ${firstNumSet &~ secondNumSet}")
    println(s"secondNumSet &~ firstNumSet : ${secondNumSet &~ firstNumSet}")

    println("\nIntersection")
    println(s"firstNumSet & secondNumSet : ${firstNumSet & secondNumSet}")




  }
}
