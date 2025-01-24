@main
def test_any_hierarchy() : Unit =
    val list: List[Any] = List(
        "a string of chars",
        842,
        'c',
        true,
        () => "anon"
    )
    list.foreach(element => println(element))

@main
def test_casting() : Unit =
    val x: Long = 987654321
    val y: Float = x.toFloat
    println(s"$x => $y")
    val face: Char = 'c'
    val number: Int = face
    println(s"$face => $number")
    val face_from_number: Char = 9786.toChar
    println(s"9786 => $face_from_number")