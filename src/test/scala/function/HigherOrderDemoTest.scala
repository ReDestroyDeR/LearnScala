package ru.red
package function

import function.HigherOrderDemo.*

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class HigherOrderDemoTest {
  @ParameterizedTest
  @CsvSource(Array(
    "385, 1, 11",
    "620, 5, 13"
  ))
  def mapReduce_sumSquared_1_to_10_eq_385(result: Int,
                                          rangeStart: Int,
                                          rangeFinish: Int): Unit = {
    assertEquals(Some(result), mapReduce(Range(rangeStart, rangeFinish).toArray, x => x * x, (a, b) => a + b))
  }
}
