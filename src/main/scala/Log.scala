object Log {
  def main(args: Array[String]): Unit ={

    println("Scala Command Line Argument Example");

    // You pass any thing at runtime
    // that will be print on the console

    val exitCommand = false;

    while(exitCommand == false){

      println("Do you wanna log a workout? Y or N")
      var q1 = scala.io.StdIn.readLine()
      if(q1 == "y" || q1 == "Y"){
        println("Poof")

      }
      else if(q1=="N" || q1 =="n"){
        println("Is your workout lower body o")
      }
      else{println("Invalid command")}


    }

   }


}
