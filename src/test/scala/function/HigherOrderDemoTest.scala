package ru.red
package function

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions._
import ru.red.function.HigherOrderDemo._

class HigherOrderDemoTest {
  @Test
  def mapReduce_sumSquared_1_to_10_eq_385(): Unit = {
    assertEquals(Some(385), mapReduce(Range(1, 11).toArray, x => x * x, (a, b) => a + b))
  }
}
