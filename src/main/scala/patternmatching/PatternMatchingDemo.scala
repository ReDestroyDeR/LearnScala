package ru.red
package patternmatching

object PatternMatchingDemo {
  def matchType(x: Any): Any = x match {
    case 0 => "zero"
    case y: Int => "scala.Int"
    case "one" => 1
    case _ => "other"
  }

  def matchInt(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
    case _ => "other"
  }

  def matchCaseClass(person: Person): String = person match {
    case Person("John", 16) => "Hi John!"
    case Person("Susan", 32) => "Hello Susan!"
    case Person(name, age) => s"Hello $name aged $age"
  }
  case class Person(name: String, age: Int)
}
