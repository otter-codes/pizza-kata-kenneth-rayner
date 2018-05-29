val individualOrders = List("1/2","1/4")

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

individualOrders.map(x => fractionToDouble(x))

individualOrders.map(fractionToDouble)

math.ceil(individualOrders.map(x =>fractionToDouble(x)).sum).toInt