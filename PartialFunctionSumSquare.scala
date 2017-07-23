
//<<<<<<<<<<<<<<<<<------------------ TASK 3 ------------------>>>>>>>>>>>>>>>>>>
/*Write a partial function to add three numbers in which one number is constant and two
numbers can be passed as inputs and define another method which can take the partial
function as input and squares the result.

NOTE: Here 10 is taken as constant
*/

//<<<<<<<<<<<<<<<<<------------------ Description of Code ------------------>>>>>>>>>>>>>>>>>>

/*
To make partial function work with generic type, class "class PFwithGenerics[@specialized T] (implicit num:Numeric[T]){" is created
What does @specialized and implicit parameter do??????
1. [@specialized T]:-
@specialized T allows to work on a subset of the primitive types for example [@specialized (Int, Long, Double, Float..) T]
2. (implict num: Numeric[T]):-
When object of this class (PFwithGenerics) is created and if it misses argument for its implicit parameter,
then such argument will automatically be provided.
*/

/*
class PFwithGenerics contains two functions
1. Partial Function (sumofNum)
-> It takes two arguments, adds them and result of addition is further added to constant 10 and final result is returned
-> here plus() method is used to add numbers because numbers are of generic T type, if we try num1+num2, then error is thrown

2. Total Function (squaresumofNum)
-> It takes partial function as it's argument and returns square of the result returned by partial function
-> here times() method is used to multiply numbers because numbers are of generic T type, if we try num1*num2, then error is thrown
*/

/*
object ob is created which extends App trait
-> since object extends App trait so it inherits main() method of App trait and works as singleton object
*/

//<<<<<<<<<<<<<<<<<------------------ SOLUTION 3 STARTS ------------------>>>>>>>>>>>>>>>>>>

class PartialFunctionSumSquare[@specialized T] (implicit num:Numeric[T]){
  val sumofNum = (num1:T,num2:T) => num.plus(num.plus(num1,num2),10.asInstanceOf[T])  //here 10.asInstanceOf[T] is written because 10 is of type Int and num1 and num2 are of type T
  def squaresumofNum(num1:T) = {
    num.times(num1,num1)
  }
}

object obPF extends App{
  var ob1 = new PFwithGenerics[Int]()       //In order to pass integer values to sumofNum() method Int needs to be specified with ClassName PFwithGenerics,
                                            //but there is no need to pass parameter to class PFwithGenerics as during class definition parameter is
                                             //declared as implicit
  //var ob1 = new PFwithGenerics[]()         //throws error as Data Type is not specified
  println("Sum of Int (2,3 with 10 as constant): "+ob1.sumofNum(2,3))     //call to sumofNum()is made with integer values
  println("Square of Sum Result of Int (2,3 with 10 as constant) : "+ob1.squaresumofNum(ob1.sumofNum(2,3)))  //call to squaresumofNum() method is
                                                                                               //made with sumofNum as its argument

  println("*********************************************")

  val ob2 = new PFwithGenerics[Long]()        //In order to pass Long values to sumofNum() method Long needs to be specified with ClassName PFwithGenerics
  println("Sum of Long (2234L, 3456L with 10 as constant) : "+ob2.sumofNum(2234L,3456L))   //call to sumofNum()is made with Long values, suffixed with L or l
  println("Square of Sum Result of Long (2234L, 3456L with 10 as constant) : "+ob2.squaresumofNum(ob2.sumofNum(2234L,3456L)))  //call to squaresumofNum() method is
                                                                                                       //made with sumofNum as its argument

  println("*********************************************")

  val ob3 = new PFwithGenerics[Float]()      //In order to pass Float values to sumofNum() method Float needs to be specified with ClassName PFwithGenerics
  println("Sum of Float (2.6f,3.7f with 10 as constant) : "+ob3.sumofNum(2.6f,3.7f))  //call to sumofNum()is made with Float values, suffixed with F or f
  println("Square of Sum Result of Float (2.6f,3.7f with 10 as constant) : "+ob3.squaresumofNum(ob3.sumofNum(2.6f,3.7f)))  //call to squaresumofNum() method is
                                                                                                        //made with sumofNum as its argument

  println("*********************************************")

  var ob4 = new PFwithGenerics[Double]()   //In order to pass Double values to sumofNum() method Double needs to be specified with ClassName PFwithGenerics
  println("Sum of Double (2.344,3.467 with 10 as constant) : "+ob4.sumofNum(2.344,3.467)) //call to sumofNum()is made with Double values
  println("Square of Sum Result of Double (2.344,3.467 with 10 as constant) : "+ob4.squaresumofNum(ob4.sumofNum(2.344,3.467)))  //call to squaresumofNum() method is
                                                                                                                 //made with sumofNum as its argument

}

//<<<<<<<<<<<<<<<<<------------------ SOLUTION 3 ENDS ------------------>>>>>>>>>>>>>>>>>>