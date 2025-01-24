class User

@main
def test_user: Unit =
    val user1 = User()
    println(user1)

class Point(var x: Int = 0, var y: Int = 0):

  def move(dx: Int, dy: Int): Unit =
    x = x + dx
    y = y + dy

  override def toString: String =
    s"($x, $y)"
end Point

@main
def test_point: Unit =
    val point1 = Point(2, 3)
    println(point1.x)  // prints 2
    println(point1)    // prints (2, 3)
    point1.move(10, 20)
    println(point1)
    val point2 = Point()
    println(point2)
    val point3 = Point(20)
    println(point3)
    val point4 = Point(y = 20)
    println(point4)

class PointPlus:
  private var _x = 0
  private var _y = 0
  private val bound = 100

  def x: Int = _x
  def x_=(newValue: Int): Unit =
    if newValue < bound then
      _x = newValue
    else
      printWarning()

  def y: Int = _y
  def y_=(newValue: Int): Unit =
    if newValue < bound then
      _y = newValue
    else
      printWarning()

  private def printWarning(): Unit =
    println("WARNING: Out of bounds")

  override def toString: String = s"($_x, $_y)"
end PointPlus

@main
def test_point_plus: Unit =
    val point = PointPlus()
    point.x = 99
    point.y = 200
    println(point)