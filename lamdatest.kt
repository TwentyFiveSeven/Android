fun main(args : Array<String>){
    println(lambdaReturn())
}

var lambdaReturn = Exit@{
//    if (true)
//        3
    if(false)
        return@Exit 5
    3
}