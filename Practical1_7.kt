// 20012011051_Jay Khatri_AB11_C
fun main() {
    print("Enter a number : ")
    var number : Int = Integer.valueOf(readLine())
    val result = Factorial(number)
    println("Factorial of $number = $result")
    val result2 = tailrecFactorial(number)
    println("By Tailrec Keyword, Factorial of $number = $result2")
}

fun Factorial(number: Int):Int{
    val result : Int
    if (number<=1){
        result = number
    }
    else{
        result = number*Factorial(number-1)
    }
    return result
}

tailrec fun tailrecFactorial(number: Int,run:Int=1):Int{
    return if(number==1){
        run
    }else{
        tailrecFactorial(number-1,run*number)
    }
}