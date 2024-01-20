@main def arraysTest(): Unit =

    val names = Array("Tom", "Jerry", "Dog")
    names(2) = "Tim"
    println(
        names
        .map(i => i.toLowerCase())
        .filter(i => i.startsWith("t"))
        .mkString("Array(", ", ", ")")
    )

    for name <- names do
        print(name + " ")

