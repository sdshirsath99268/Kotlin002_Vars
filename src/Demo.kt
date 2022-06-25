fun main(args:Array<String>) {
    val i = 20          // val is like Constant , Does not change value during program lifetime
    val j = 10

    var lang:String    // variable declaration of type String
    lang = "Kotlin"    // variable initialization and value assignment

    println(lang)

    var sum = i+j      // var is temp variable , value can be assigned when required.
    var sub = i-j
    var mul = i*j
    var div = i/j

    println("Sum is " + sum)
    println("Sub is " + sub)
    println("Mul is " + mul)
    println("Div is " + div)

    println("Second Kotline Prog , By Sanjay DEVIDAS Shirsath")
}