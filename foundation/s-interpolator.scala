
@main
def s(): Unit = 
   val name = "Victor"
   val age = 29
   
   println(s"$name is $age years old")
   // println("$name is $age years old") -> this wont work as expected
   println(s"2 + 2 = ${2 + 2}") // 2 + 2 = 4
   
   val x = -1
   println(s"x.abs = ${x.abs}") // x.abs = 1

   // Scaping special characters
   println(s"New offers starting at $$146.90")

   // Double quotes needs to be scapped, for that use triple quotes around string
   println("""{"name": "James"}""")


   // Multiline string literals can be interpolated
   println(s"""name: "$name", 
           |age: "$age"""".stripMargin)
