package ru.red

import scala.annotation.tailrec

object Util {
  def tossCoin: String = if (Math.random > 0.5) "Head" else "Tails"

  def gcd(x: Int, y: Int): Int = {
    var a = x
    var b = y
    while (b > 0) {
      a = a % b
      val t = a
      a = b
      b = t
    }
    a
  }

  def power(x: Int, d: Int): Int = {
    def recursivePower(p: Int, accumulator: Int): Int = {
      if (p <= 0) return accumulator
      recursivePower(p - 1, accumulator * x)
    }
    recursivePower(d, 1)
  }

  def mkStringMap[A, B](map: Map[A, B], name: String = "Map"): String =
    map.mkString(s"$name: {\n\t", ";\n\t", "\n}")
}
