fun main(args : Array<String>){
 caseExample()
}

fun caseExample(){
    var obj : Any ? = 10.00f
    when(obj){
        "aaaa"  -> {println("문자 : "+obj)}
        is Float    ->{println("숫자 : " +obj)}
    }
}