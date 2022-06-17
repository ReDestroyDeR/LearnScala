package ru.red
package traits.icecream

object TraitIceCreamDemo {
  def main(args: Array[String]): Unit = {
    val iceCream = new IceCream
      with FlavourStrawberry
      with FlavourCreamBrule
      with Cone
      with Basket
      with Flavour
    println(iceCream.make())
  }
}
