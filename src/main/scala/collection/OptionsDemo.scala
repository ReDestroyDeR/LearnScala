package ru.red
package collection

object OptionsDemo {

  def main(args: Array[String]): Unit = {
    val capitals = Map(
      "Russia" -> "Moscow",
      "Belarus" -> "Minsk",
      "Ukraine" -> "Kiyv"
    )

    println(s"Capital of Russia: ${show (capitals get "Russia")}")
    println(s"Capital of Belarus: ${show (capitals get "Belarus")}")
    println(s"Capital of Afghanistan: ${show (capitals get "Afghanistan")}")

    def show(x: Option[String]): String = x match {
      case Some(s) => s
      case None => "?"
    }

    val a:Option[Int] = Some(5)
    val b:Option[Int] = None

    println(s"$a - ${a.getOrElse(10)}")
    println(s"$b - ${b.getOrElse(100)}")
    println(s"Is \"$a\" empty? - ${a.isEmpty}")
    println(s"Is \"$b\" empty? - ${b.isEmpty}")
  }

}
