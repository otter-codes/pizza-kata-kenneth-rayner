object Pizza {

  def pizzaOrder(numApprentices: Int, individualOrders: List[String]): String = {

    val numPizzasToOrder = math.ceil(individualOrders.map(fractionToDouble).sum).toInt
    val leftOverSlicesCalc = ((numPizzasToOrder - individualOrders.map(fractionToDouble).sum) * 8).toInt
    val leftOverSlices = if (leftOverSlicesCalc == 0) "no" else leftOverSlicesCalc


    val pluralPizzas = if (numPizzasToOrder > 1) "s" else ""
    val pluralApprentices = if (numApprentices > 1) "s" else ""
    val pluralLeftOverSlices = if (leftOverSlicesCalc !=1) "s" else ""
    val leftOverSlicesString = s" and will have $leftOverSlices left over slice$pluralLeftOverSlices"


    s"To feed $numApprentices hungry apprentice$pluralApprentices, I need $numPizzasToOrder pizza$pluralPizzas$leftOverSlicesString"

  }

  def fractionToDouble(orders: String): Double = {
    orders match {
      case "1/8" => 0.125
      case "1/4" => 0.25
      case "3/8" => 0.375
      case "1/2" => 0.5
      case "5/8" => 0.625
      case "3/4" => 0.75
      case "7/8" => 0.875
      case "1" => 1.0
    }
  }

}

