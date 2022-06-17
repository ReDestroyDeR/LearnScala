package ru.red
package patternmatching

import patternmatching.PatternMatchingDemo.*

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.{Arguments, ArgumentsProvider, ArgumentsSource, ValueSource}

import java.util.stream.Stream

class PatternMatchingDemoTest {
  def matchTypeTest(x: Any, expected: Any): Unit = {
    assertEquals(expected, matchType(x))
  }

  // Nobody write tests with JUnit
  @Test
  def matchTypeTestParametrized(): Unit = {
    val arguments = Array(
        (0, "zero"),
        (35, "scala.Int"),
        ("one", 1),
        ("two", "other"),
        (None, "other")
    )
    arguments.foreach(arg => matchTypeTest(arg._1, arg._2))
  }

  @Test
  def matchCaseClassTest(): Unit = {
      val arguments = Array(
          (Person("John", 16), "Hi John!"),
          (Person("Susan", 32), "Hello Susan!"),
          (Person("Margareth", 23), "Hello Margareth aged 23"),
      )
      arguments.foreach(arg => assertEquals(arg._2, matchCaseClass(arg._1)))
  }

  @ParameterizedTest
  @ValueSource(Array(0, 1, 2, 3, 4))
  def matchIntTest(x: Int): Unit = {
    println(s"$x ${matchInt(x)}")
  }
}
