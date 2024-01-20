
@main def collections(): Unit =
    val seq: Iterable[Int] = Seq(1, 2, 3, 4)

    seq match
        case i :: rest => println(i)

    println(seq)
