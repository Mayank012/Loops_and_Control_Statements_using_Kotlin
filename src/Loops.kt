fun main(args: Array<String>) {
    //LOOPS in Kotlin

    //For loop
    for (i in 1..10) {
        if (i % 2 == 0)
            println("$i is even")
        else
            println("$i is odd")
    }

    //While loop
    var i = 1

    while (i <= 10) {
        if (i % 2 == 0)
            println("$i is even")
        else
            println("$i is odd")
        i++
    }

    //Do while loop
    var j = 1

    do {
        if (j % 2 == 0)
            println("$j is even")
        else
            println("$j is odd")
        j++
    } while (j <= 10)

    //Break Statement in Kotlin
    myLoop@ for (i in 1..3) {
        for (j in 1..3) {
            println("$i $j")
            if (i == 2 && j == 2)
                break@myLoop
        }
    }

//    Continue Statement in Kotlin
    for (i in 1..10) {
        if (i % 2 == 0) {    //output is odd numbers till 10
            continue
        }
        println(i)
    }

    outer@ for (i in 1..3) {
        for (j in 1..3) {

            if (i == 2 && j == 2)
                continue@outer
            println("$i $j")
        }

    }

}