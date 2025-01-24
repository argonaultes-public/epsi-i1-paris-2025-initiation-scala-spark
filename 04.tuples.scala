@main
def test_tuples_01: Unit =
    var ingredient = ("Sugar", 22)
    println(ingredient)
    var (name, quantity) = ingredient
    println(s"$name ($quantity)")

@main
def test_tuples_02: Unit =
    val planets = List(("Mercury", 57.9), ("Venus", 108.2), ("Earth", 149.6),
       ("Mars", 227.9), ("Jupiter", 778.3))
    planets.foreach {
        case ("Earth", distance) => println(s"Our planet is $distance million kilometers from the sun")
        case _ =>
    }
    planets.foreach {
        (planet, distance) => println(s"$planet is $distance million kilometers from the sun")
    }    