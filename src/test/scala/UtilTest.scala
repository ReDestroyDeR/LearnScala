package ru.red

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._
import Util._

class UtilTest {
  @Test
  def testCoinToss(): Unit = {
    var (heads, tails) = (0, 0)
    for (i <- 0 to 1000)
      if (tossCoin == "Head") heads += 1 else tails += 1
    println(s"heads: $heads tails: $tails delta: ${Math.abs(heads - tails)}")
    assume(Math.abs(heads - tails) < 100)
  }

  @Test
  def gcdTest(): Unit = {
    assertEquals(6, gcd(6, 18))
    assertEquals(3, gcd(21, 18))
  }

  @Test
  def powTest(): Unit = {
    assertEquals(1024, power(2, 10))
    assertEquals(81, power(3, 4))
  }
}
