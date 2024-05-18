/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    
    val x = 1
    val y = 3
    val z = x+y
    
    
    //val -> constant.    var -> variable
    val name = "Kamarul"
	var fullName = "Kamarul Akmal"
	fullName = "Kamarul Akmal Rosli"
    
    //Data type
    //String -> ayat, perkataaan ""
    //Char -> karakter huruf  ''
    val address:String = "Seri Kembangan"
    val address2:Char = 'S'
    var message = "My name is " + fullName
    
    //String interpolation
    //$ -> akan cari cariable yg ditetapkan
    val anotherMessage:String = "My name is $name and I live in $address"
    
    //number
    var num1:Int = 9
    var num2:Int = 5
    var num3 = 10
    var num4 = 2
    var sum:Int = num1+num2
    
    //operasi. + , - , * , / , %
    var sum2 = num3+num4
    var minus = num1-num2
    var darab = num1 * num2
    var bahagi = num1 / num2
    var modulo = num1 % num2  //baki dari hasil bahagi
    
    //boolean (true or false)
    //Boolean data type is normally use for logic, ex: ehwn usaing if else statement
    //Boolean operation : && (AND), || (OR) , ! (Reverse)
    var eaten = true
    var tired:Boolean = false
    
    // Array
    // is a data type to store a collection or repeated item
    
    var scores = arrayOf(70,90,100,80,85,40)
    println(scores[0])   //first item
    println(scores[1])   // second item
    println(scores.size)   // how many item in the array
    
    //control flow in kotlin
    var myAge = 19
    var childAge = 17
    var parent = true
    //if and else
    if (myAge < 18) {
        println("Your are under age")
        println("The end")
    } else {
        println("You can watch movie")
    }
    
    //if, else if, else
    if (myAge < 13) {
        println("You cannot wanth the movie")
    } else if (myAge <18) {
        println("You can watch with parent")
    } else {
        println("You can watch the movie")
    }
    
    if (childAge < 13 || childAge < 18 && parent == false) {
        println("You cannot watch the movie")
    } else {
        println("You can watch movie")
    }
    
    //when (Switch Case in other language)
    // akan ada dalam android bila buat button
    var size = 1
    var price = 0
    
    when (size) {
        1-> price = 5
        2-> price = 7
        3-> price = 10
        else-> println("We dont support other size")
    }
    println(price)
    
    
    //for loop
    for (i in 0..5) {
        println("i=$i")  //dari 0 sehingga 5, keluarkan nilai i
    }
    
    for (i in 5 downTo 0) {
        println("i=$i")  //dari 5 sehingga 0, keluarkan nilai i
    }
    
    for (i in 1..5 step 2) {
        println("i=$i")   // dari 1 hingga 5, setiap kali naik 2
    }
    
    for (i in 5..1 step 2) {
        println("i=$i")   // dari 1 hingga 5, setiap kali naik 2
    }
    
    for (i in 5 downTo 1 step 2) {
        println("i=$i")   // dari 5 hingga 1, setiap kali turun 2
    }
    
    //for item in array //untuk berekeja dgn index atau collection
    var languages = arrayOf("Ruby", "Kotlin", "Python", "Java")
    
    for (item in languages) {
        println(item)
    }
    
    // ${} -> Interpolation kalau ada function
    for (i in 0..languages.size - 1) {
        println("Item at index $i is ${languages[i]}")
    }
    
    
    //While
    var x1 = 1
    while (x1 < 5) {
        println("x1 = $x1")
        x1++  // Selagi nilai x1 kurang dari 5, keluarkan nilai x1 dan tambah 1 setiap kali
    }
    
    //Do While
    //selagi => But Do While will ensure that the code inside do to be executed at least 1
    var x2 = 1
    do {
        println ("x2 = $x2")  //jeluarkan nimal x2
        x2++ // dan tambahkan kepada 1
       
    }
    while(x2<=5)	//ulang semula selagi x2 kurang sama dengan 5
    
    
    //KELUAR DARI CONTROL FLOW - break
    
    //break statement
    var x3 = 1
    do {
        println("x3=$x3")
        x3++
        if (x3 == 3) break
    } 
    while (x<=5)
    
    //Continue  - (abaikan senario ini)
    var x4 = 0
    do {
        x4++
        if (x4 == 3) {continue} //abaikan senario ini tetapi teruskan
        println("x4=$x4")
    }
    while (x4 <=5)
    
    
    
    
    
    
    
    println("Hello, Android ATC")
    println(address)
    println(address2)
    println(x)
    println(z)
    println(name)
    println(fullName)
    println(message)
    println(anotherMessage)
    println(sum)
    println(sum2)
    println(minus)
    println(darab)
    println(bahagi)
    println(modulo)
    println(eaten && tired) //kedua perlu true untuk true
    println(eaten || tired) //salah satu perlu true untuk true
    println(!eaten)  //reverse. kalau true, akan return false. vv
    
     //Nullable. Null (tiada value) / bayangkan dalam form benda yg tak wajib isi
    var profession = null
    var newProfession:String? = null // Question marks means it can be null or it can be a value
    println(newProfession)
    println(profession)
    newProfession = "Programmer"
    println(newProfession)
    
    sayBye()
    sayGoodbye("Awak")
    sayGoodbye("Kamu")
    println(sum(3,4))
    println(calculateBmi(175.5, 90.5))
    
}

// Function is a group of expression that can be usable in our code
fun sayBye() {
    
    println("Bye-bye")
}

// Function with arguement/parameter
fun sayGoodbye(name:String) {
    println("Goodbye $name")
}

// Function woth return
fun sum(a:Int, b:Int):Int {
    return a+ b
}
fun calculateBmi(height:Double, weight:Double):Double{
    return weight / ((height/100) * (height/100))  //Function ini akan memulangkan firmula ini
}




