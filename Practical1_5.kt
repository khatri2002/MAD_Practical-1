// 20012011051_Jay Khatri_AB11_C
fun main() {
    print("Enter a month number : ")
    var number : Int = Integer.valueOf(readLine())
    val result = when(number){
        1->"January"
        2->"February"
        3->"March"
        4->"April"
        5->"May"
        6->"June"
        7->"July"
        8->"August"
        9->"September"
        10->"October"
        11->"November"
        12->"December"
        else->"Invalid Number"
    }
    println(result)
}