package ru.red
package collection
import ru.red.Util._

object MapDemo {

  def main(args: Array[String]): Unit = {
    val emptyMap: Map[Char, Int] = Map()
    val studentGradesMap: Map[String, Array[Int]] = Map(
      "John" -> Array(5, 5, 5),
      "Susan" -> Array(4, 3, 3),
      "Margareth" -> Array(5, 2, 4)
    )

    println(studentGradesMap.map((k, v) => (k, v.mkString(", "))).mkString(";\n"))
    val temperatureMeasurements: Map[String, Int] = Map(
      "01.02.1985" -> -15,
      "02.02.1985" -> -18,
      "03.02.1985" -> -9,
      "04.02.1985" -> -13,
      "05.02.1985" -> -16,
      "06.02.1985" -> -14,
    )

    val mkStringTemp = mkStringMap[String, Int](_, "temperatureMeasurements")
    println(mkStringTemp(temperatureMeasurements))
  }

}
