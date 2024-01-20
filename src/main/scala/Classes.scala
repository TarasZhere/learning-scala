trait Name(name: String):
    def getName:String
    def printName():Unit=println("Book name not available")

trait Pages(pages:Int):
    def getPages:Int
    def printPages():Unit

    override def toString: String = super.toString

class Book(val name: String = null, val pages: Int = 0) extends Pages(pages:Int), Name(name:String):
    override def getName: String = name

    override def getPages: Int = pages

    override def printName(): Unit = println(name)

    override def printPages(): Unit = println(pages)



@main def classes(): Unit =
//    Book(pages=500).printName()

    val pages: Pages = new Book("title", 400)

    pages match
        case pages: Pages => println("Pages")
        case pages: Book => println("Book")
        case _ => println("ANY")


