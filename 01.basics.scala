
@main
def values_vs_variables(): Unit =
    val x = 1 + 1
    println(x)
    var y = 1
    println(y)
    y = 10
    println(y)

@main
def println_block(): Unit =
    println({
        val x = 1 + 3
        x * 2
    })

@main
def anon_functions() : Unit =
    val addOne = (x: Int) => x + 1
    println(addOne(10))
    println(addOne)

class Greeter(prefix: String, suffix: String):
    def greet(name: String): Unit =
        println(prefix + name + suffix)

@main
def test_simple_class() : Unit =
    val greeter = Greeter("Hallo ", " !")
    greeter.greet("Gael")

case class PointCase(x: Int, y : Int)

class PointClass(x: Int, y: Int)

def compare_points(point1: Any, point2: Any) : Unit =
    if point1 == point2 then
        println(s"$point1 and $point2 are the same.")
    else
        println(s"$point1 and $point2 are different.")


@main
def test_compare_points() : Unit =
    val point = PointCase(1, 2)
    val anotherPoint = PointCase(1, 2)
    val yetAnotherPoint = PointCase(2, 2)
    println(point)
    println(anotherPoint)
    compare_points(point, anotherPoint)
    compare_points(point, yetAnotherPoint)
    val pointCls = PointClass(1, 2)
    val anotherPointCls = PointClass(1, 2)
    val yetAnotherPointCls = PointClass(2, 2)
    compare_points(pointCls, anotherPointCls)
    compare_points(pointCls, yetAnotherPointCls)
    compare_points(pointCls, pointCls)

object IdFactory:
    private var counter = 0
    def create(): Int =
        counter += 1
        counter

@main
def test_object_class() : Unit =
    val newId = IdFactory.create()
    println(newId)
    var newerId = IdFactory.create()
    println(newerId)
    println({
        IdFactory.create()
        IdFactory.create()
        IdFactory.create()
    })