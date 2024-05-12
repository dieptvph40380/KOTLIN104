//package com.example.lab1_kot104
//
//fun main(){
//    print("Nguyễn Văn Anh - PS123456\n")
//    print("=========================\n")
//    println("Quanh năm buôn bán ở mom sông")
//    println("Nuôi đủ năm con với một chồng")
//    println("\tlặn lội thân cờ khi quãng vắng")
//    println("\teo sèo mặt nước buổi đò đồng")
//    println("Một duyên hai nợ âu đành phận")
//    println("Năm nắng mười mưa há chẳng công")
//    println("\tCha mẹ thói đời \"ăn ở bạc\"")
//    println("\tCó chồng hờ hững cũng như không")
//
//    bai3()
//
//    bai4()
//}
//
//fun bai3(){
//    var a = 0.0
//    var b = 0.0
//    println("Nhập a:")
//    var s = readLine()
//    if (s != null) a = s.toDouble()
//    println("Nhập b:")
//    s = readLine()
//    if (s != null) b = s.toDouble()
//    println("Tổng: " + (a + b))
//    println("Hiệu: " + (a - b))
//    println("Tích: " + (a * b))
//    println("Thương: " + (a / b))
//}
//
//fun bai4(){
//    printMessage("Hello")                                               // 5
//    printMessageWithPrefix("Hello", "Log")                              // 6
//    printMessageWithPrefix("Hello")                                     // 7
//    printMessageWithPrefix(prefix = "Log", message = "Hello")           // 8
//    println(sum(1, 2))                                                  // 9
//    println(multiply(2, 4))
//
//
//    println("function")
//    infix fun Int.times(str: String) = str.repeat(this)        // 1
//    println(2 times "Bye ")                                    // 2
//
//    val pair = "Ferrari" to "Katrina"                          // 3
//    println(pair)
//
//    infix fun String.onto(other: String) = Pair(this, other)   // 4
//    val myPair = "McLaren" onto "Lucas"
//    println(myPair)
//
//    val sophia = Person("Sophia")
//    val claudia = Person("Claudia")
//    sophia likes claudia
//
//    printAll("Hello", "Hallo", "Salut", "Hola", "你好")
//    printAllWithPrefix(
//        "Hello", "Hallo", "Salut", "Hola", "你好",
//        prefix = "Greeting: "                                          // 4
//    )
//    log("Hello", "Hallo", "Salut", "Hola", "你好")
//
//    println("Variables")
//    var a: String = "initial"  // 1
//    println(a)
//    val b: Int = 1             // 2
//    val c = 3                  // 3
//
//    var e: Int  // 1
//    println(e)  // 2
//    ///Variable 'e' must be initialized
//
//    println("Null Safety")
//
//    var neverNull: String = "This can't be null"            // 1
//
//    neverNull = null                                        // 2
//
//    var nullable: String? = "You can keep a null here"      // 3
//
//    nullable = null                                         // 4
//
//    var inferredNonNull = "The compiler assumes non-null"   // 5
//
//    inferredNonNull = null                                  // 6
//
//    fun strLength(notNull: String): Int {                   // 7
//        return notNull.length
//    }
//    strLength(neverNull)                                    // 8
//    strLength(nullable)
////    Null can not be a value of a non-null type String
////    Null can not be a value of a non-null type String
////    Type mismatch: inferred type is Nothing? but String was expected
//
//fun describeString(maybeString: String?): String {              // 1
//    if (maybeString != null && maybeString.length > 0) {        // 2
//        return "String of length ${maybeString.length}"
//    } else {
//        return "Empty or null string"                           // 3
//    }
//}
//}
//fun printMessage(message: String): Unit {                               // 1
//    println(message)
//}
//
//fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // 2
//    println("[$prefix] $message")
//}
//
//fun sum(x: Int, y: Int): Int {                                          // 3
//    return x + y
//}
//
//fun multiply(x: Int, y: Int) = x * y                                    // 4
//
//class Person(val name: String) {
//    val likedPeople = mutableListOf<Person>()
//    infix fun likes(other: Person) { likedPeople.add(other) }  // 6
//}
//fun printAll(vararg messages: String) {                            // 1
//    for (m in messages) println(m)
//}
//
//fun printAllWithPrefix(vararg messages: String, prefix: String) {  // 3
//    for (m in messages) println(prefix + m)
//}
//
//
//fun log(vararg entries: String) {
//    printAll(*entries)                                             // 5
//}
