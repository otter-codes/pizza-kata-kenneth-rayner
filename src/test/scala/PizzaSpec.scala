import org.scalatest.{MustMatchers, WordSpec}


class PizzaSpec extends WordSpec with MustMatchers{


  "PizzaOrder is called" must {

    "return the correct number of pizzas for 1 apprentice" in {

      Pizza.pizzaOrder(1,List("1")) mustEqual "To feed 1 hungry apprentice, I need 1 pizza and will have no left over slices"
    }
    "return the correct number of pizzas for more than 1 apprentices" in {

      Pizza.pizzaOrder(2,List("1","1")) mustEqual "To feed 2 hungry apprentices, I need 2 pizzas and will have no left over slices"
    }
    "return the correct number of pizzas for many apprentices" in {

      Pizza.pizzaOrder(6,List("1","1","1","1","1","1")) mustEqual "To feed 6 hungry apprentices, I need 6 pizzas and will have no left over slices"
    }
    "return the correct number of pizzas for 1 apprentice a have some left over slices" in {

      Pizza.pizzaOrder(1,List("1/2")) mustEqual "To feed 1 hungry apprentice, I need 1 pizza and will have 4 left over slices"
    }
    "return the correct number of pizzas for 2 apprentices a have some left over slices" in {

      Pizza.pizzaOrder(2,List("1/2","1/8")) mustEqual "To feed 2 hungry apprentices, I need 1 pizza and will have 3 left over slices"
    }
    "return the correct number of pizzas for several apprentices a have some left over slices" in {

      Pizza.pizzaOrder(3,List("7/8","1/2","1/8")) mustEqual "To feed 3 hungry apprentices, I need 2 pizzas and will have 4 left over slices"
    }
    "return the correct number of pizzas for many apprentices and show many left over slices there are" in {

      Pizza.pizzaOrder(7,List("1/2","3/4","1/2","1/4","1/4","1/2","3/4")) mustEqual "To feed 7 hungry apprentices, I need 4 pizzas and will have 4 left over slices"
    }

  }

}
