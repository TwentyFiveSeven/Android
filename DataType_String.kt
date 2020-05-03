import java.util.*
fun main(args : Array<String>){
    var sName = "문자열 테스트입니다."
    println(sName + " : 문자열 붙이기")

    var sTest = """이건 어떻게
        출력이 되는 부분이지?
    """
    println(sTest)
    var sTest2 = "sName의 값을 가져오는 것 : $sName"
    println(sTest2)

    var sTest3 = "sName의 값을 가져오는 것 : ${sName + "하하하" + Date()}"
    println(sTest3)
}