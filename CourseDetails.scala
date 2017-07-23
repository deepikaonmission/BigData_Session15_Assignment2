//<<<<<<<<<<<<<<<---------- TASK 4 ---------->>>>>>>>>>>>>>

  /*Write a program to print the prices of 4 courses of Acadgild:
  Android-12999,
  Big Data Development-17999,
  Core Java Training-7999,
  Spark-19999
  using match and add a default condition "New courses are yet to be introduced" if the user enters any other course.*/

  //<<<<<<<<<<<<<<<---------- SOLUTION 4 STARTS ---------->>>>>>>>>>>>>>

  //Second method: when course is passed as command line argument

  object CourseDetails extends App{       //Singleton object CourseDetails is created which extends App trait
                                          //so main method of App trait is inherited in this Singleton Object
    var course = args(0)                 //value of command line argument is copied to course variable
    course match {                       //match statement starts
          case "Android" => println(s"Price of Course $course is 12999")    //if any of the case matches with course's value then corresponding
          case "Big Data Development" => println(s"Price of Course $course is 17999")  //print statement of that case gets executed
          case "Core Java Training" => println(s"Price of Course $course is 7999")
          case "Spark" => println(s"Price of Course $course is 19999")
          case _ => println(s"$course Course details are present on www.acadgild.com website...") //matches with any value of course variable which is not matched by any of the above case statements
        }
}



