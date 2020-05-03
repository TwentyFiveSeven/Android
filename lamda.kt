fun main(args : Array<String>){
    var myFuncLamda = { n : Int, n2 : Int -> n +n2}

    pureFunctionAdd100{ myFuncLamda(1,2)}.let{println(it)}

    pureFunctionAdd100 { 10*3 }.let{println(it)}
    pureFunctionAdd100 {
        var sum = 0; (0..10).forEach{sum+=it};sum}.let { println(it) }
}

fun pureFunctionAdd100(fn :() -> Int) : Int = fn() + 100