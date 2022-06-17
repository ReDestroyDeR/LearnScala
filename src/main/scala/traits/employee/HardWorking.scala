package ru.red
package traits.employee

import traits.employee.Employee

trait HardWorking extends Employee {
  override def work(): Unit = {
    super.work()
    salary += 100
  }
}
