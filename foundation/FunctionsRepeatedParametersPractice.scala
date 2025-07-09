@main
def funcitonsRepeatedParametersPractice(): Unit = {
    println(sumOfIntegers(7, 3, 8, 5, 6, 34, 78, 34))
    println(sumOfIntegers(1, 1))
}

def sumOfIntegers(numbers: Int*): Int = 
    var sum = 0
    for(number <- numbers)
        sum += number
    sum