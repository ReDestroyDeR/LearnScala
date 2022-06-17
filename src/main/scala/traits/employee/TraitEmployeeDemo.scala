package ru.red
package traits.employee

import traits.employee.{Employee, HardWorking}

object TraitEmployeeDemo {
  def main(args: Array[String]): Unit = {
    val employeeA = new Employee(100, "John")
    val employeeB = new Employee(100, "Susan")
    val employeeC = new Employee(100, "Susan") with HardWorking

    def eq(): Unit = {
      println(s"A eq B: ${employeeA.isEqual(employeeB)}")
      println(s"B eq C: ${employeeB.isEqual(employeeC)}")
      println(s"C eq A: ${employeeC.isEqual(employeeA)}")
    }

    def getInterfaces(obj: Any) = obj.getClass.getInterfaces.mkString("Array(", ", ", ")")

    def printAll(): Unit = {
      println(s"A: $employeeA ${getInterfaces(employeeA)}")
      println(s"B: $employeeB ${getInterfaces(employeeB)}")
      println(s"C: $employeeC ${getInterfaces(employeeC)}")
    }


    printAll()
    eq()
    employeeA.work()
    employeeB.work()
    employeeC.work()
    printAll()
    eq()
  }
}
