abstract class AbsIterator:
    type T
    def hasNext: Boolean
    def next: T

class StringIterator(s : String) extends AbsIterator:
    type T = Char
    private var i = 0
    def hasNext: Boolean = i < s.length()
    def next: T =
        val ch = s.charAt(i)
        i += 1
        ch

@main
def test_string_iterator: Unit =
    val hello = "Hello Everyone"
    val sit = StringIterator(hello)
    while
        sit.hasNext
    do
        print(sit.next)