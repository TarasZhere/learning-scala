


def fib(n:Int): Int = n match
    case 0 => 0
    case 1 => 1
    case _ => fib(n-1) + fib(n-2)

def fibFast(n:Int):Int =
    var one = 0
    var two = 1
    var three = 2

    for _ <- 1 until n do
        three = one + two
        one = two
        two = three

    three



@main def fibonacci():Unit =
    println(fibFast(10))