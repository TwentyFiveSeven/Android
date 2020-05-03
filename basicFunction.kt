fun main(args : Array<String>){
    funByNoPraram()
    funByParameter(3, "숫자 입니다")
    println(funByReturn("3을 넘기니"))
    println(funByInline(3,10))
    funcVariable("함수형 변수 1")
    println(funVarByType("함수형 변수 2"))
}

fun funByReturn(s : String): Any?{
    return s + "-를 입력 받았습니다."
}

fun funByParameter(i : Int, s: String){
    println(i.toString()+s)
}
fun funByInline(i : Int, i1:Int) = i * i1
fun funByNoPraram(){
    println("매개변수 없어요")
}
val funcVariable = { s : String -> println(s)}
var funVarByType : (String) -> Any? = ::funByReturn