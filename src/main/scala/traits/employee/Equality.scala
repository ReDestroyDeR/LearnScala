package ru.red
package traits.employee

trait Equality {
  def isEqual(other: Any): Boolean

  def isNotEqual(other: Any): Boolean = !isEqual(other)
}
