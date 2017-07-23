//<<<<<<<<<<<<<<<---------- TASK 4 ---------->>>>>>>>>>>>>>

/*Write a program to print the prices of 4 courses of Acadgild:
Android-12999,
Big Data Development-17999,
Core Java Training-7999,
Spark-19999
using match and add a default condition "New courses are yet to be introduced" if the user enters any other course.*/

//<<<<<<<<<<<<<<<---------- SOLUTION 4 STARTS ---------->>>>>>>>>>>>>>

/*First method:
-> Total function coursePrice is defined which takes one argument i.e. course of String type
-> course is passed as an argument to method here in the scala worksheet itself
-> match case statement is used along with course argument
-> if any of the case matches with the value of course variable, then corresponding print statement of that case is executed
-> if value of course argument doesn't match with any case then default of case catches that value of course argument and c
 corresponding print statement is executed
-> if case _ is specified instead of case default, then value of course is not caught, however print statement of case _ gets executed as
 it works like default statement of switch case statement in c, c++
-> case _ and case default can't be used at the same time, if written at the same time, then error is thrown

=>> In order to work with command line arguments CourseDetails.scala file is created
*/


def coursePrice(course: String) = {
  course match{
      case "Android" => println(s"Price of Course 'Android' is 12999")
      case "Big Data Development" => println(s"Price of Course 'Big Data Development' is 17999")
      case "Core Java Training" => println(s"Price of Course 'Core Java Training' is 7999")
      case "Spark" => println(s"Price of Course 'Spark' is 19999")
      case default => println(default+" Course details are present on www.acadgild.com website...")
      //case _ => println("!!!!!Only Below Course Prices are available here!!!!!!\nAndroid\nBig Data Development\nCore Java Training\nSpark\nPlease visit www.acadgild.com to know more about other courses\n\n")
    }
}



//Output of above function:
//coursePrice: coursePrice[](val course: String) => Unit

coursePrice("Android")                //call to coursePrice() method is made
coursePrice("Big Data Development")
coursePrice("Core Java Training")
coursePrice("Spark")
coursePrice("Hadoop")
coursePrice("Networking")

//Output of above six lines when case default is used
/*Price of Course 'Android' is 12999
res0: Unit = ()
Price of Course 'Big Data Development' is 17999
res1: Unit = ()
Price of Course 'Core Java Training' is 7999
res2: Unit = ()
Price of Course 'Spark' is 19999
res3: Unit = ()
Hadoop Course details are present on www.acadgild.com website...
res4: Unit = ()
Networking Course details are present on www.acadgild.com website...
res5: Unit = ()*/


//Output of above six lines when case _ is used
/*
Price of Course 'Android' is 12999
res0: Unit = ()
Price of Course 'Big Data Development' is 17999
res1: Unit = ()
Price of Course 'Core Java Training' is 7999
res2: Unit = ()
Price of Course 'Spark' is 19999
res3: Unit = ()
!!!!!Only Below Course Prices are available here!!!!!!
Android
Big Data Development
Core Java Training
Spark
Please visit www.acadgild.com to know more about other courses


res4: Unit = ()
!!!!!Only Below Course Prices are available here!!!!!!
Android
Big Data Development
Core Java Training
Spark
Please visit www.acadgild.com to know more about other courses


res5: Unit = ()*/
