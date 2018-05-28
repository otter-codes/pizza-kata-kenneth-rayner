import org.scalatest.{MustMatchers, WordSpec}


class PizzaOrderSpec extends WordSpec with MustMatchers{


  "PizzaOrder is called" must {

    "return the correct number of pizzas for 1 apprentice" in {

      Pizza.pizzaOrder(1,List("1/4")) mustEqual "To feed 1 hungry apprentice, I need 1 pizza and will have 6 left over slices"
    }
    "return the correct number of pizzas for 2 apprentices" in {

      Pizza.pizzaOrder(2,List("3/4","3/4")) mustEqual "To feed 2 hungry apprentices, I need 2 pizzas and will have 4 left over slices"
    }
    "return the correct number of pizzas for 3 apprentices" in {

      Pizza.pizzaOrder(3,List("1/2","3/4","3/4")) mustEqual "To feed 3 hungry apprentices, I need 2 pizzas"
    }
    "return the correct number of pizzas for 7 apprentices" in {

      Pizza.pizzaOrder(7,List("1/2","3/4","1/2","1/4","1/4","1/2","3/4")) mustEqual "To feed 7 hungry apprentices, I need 4 pizzas and will have 4 left over slices"
    }

  }

}
