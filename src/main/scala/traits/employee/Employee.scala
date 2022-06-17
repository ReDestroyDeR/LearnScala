package ru.red
package traits.employee

import traits.employee.Equality

class Employee(var salary: Int, val name: String) extends Equality {
  def work(): Unit = {
    println(s"$name working...")
  }

  def isEqual(other: Any): Boolean = {
    if (!other.isInstanceOf[Employee])
      return false
    val that = other.asInstanceOf[Employee]
    if (!that.name.hashCode().equals(this.name.hashCode))
      return false
    salary.equals(that.salary) && name.equals(that.name)
  }


  override def toString = s"Employee($salary, $name)"
}
