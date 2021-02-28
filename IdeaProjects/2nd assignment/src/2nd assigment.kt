fun main() {
    var name="Hello Gerardine"
    println(name)
    var sum=addition(2,3,4,5)
    println(sum)
    var modulus=modulus(32,10)
    println(modulus)
    Interestingfact()
}
fun modulus(num1:Int,num2:Int):Int{
    var modulus=num1%num2
    return(modulus)

}
fun addition(a:Int,b:Int,c:Int,d:Int):Int{
    var sum=a+b+c+d
    return(sum )
}
fun Interestingfact(){
    var InterestingFact=("curiosity")
    print(InterestingFact)
}