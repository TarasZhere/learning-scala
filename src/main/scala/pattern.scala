import scala.annotation.switch


class Book2(title:String, pages:Int):
    override def toString: String = s"Book($title, $pages)"

def types(x: Any): Unit =
    x match
        case int: Int => println("Int")
        case float: Float => println("Float")
        case double: Double => println("Double")
        case string: String => println("String")
        case char: Char => println("Char")
        case a:AnyRef => println(a.getClass.getName)
        case _ => println("Other")

def noPairs[T](in: List[T]): List[T] =
    in match
        case Nil => Nil
        case a :: b :: rest if a == b => noPairs(a :: rest)
        case a :: rest => a :: noPairs(rest)

def remove[T](list:List[T], ignore:T): List[T] =
    (list: @switch) match
        case Nil => Nil
        case a :: rest if a == ignore => remove(rest, ignore)
        case b :: rest => b :: remove(rest, ignore)


@main def pattern():Unit =
    val anyList = List(1, 1, "A", 2, 2.5, 'a', new Book2("48 Laws of Power", 500))

    println(remove(anyList, 2))