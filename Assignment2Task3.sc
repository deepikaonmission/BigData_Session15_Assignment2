//<<<<<<<<<<<<<<<<<------------------ TASK 3 ------------------>>>>>>>>>>>>>>>>>>
/*Write a partial function to add three numbers in which one number is constant and two
numbers can be passed as inputs and define another method which can take the partial
function as input and squares the result.

NOTE:
-> Here 10 is taken as constant
-> Two methods of using Partial Function are shown
-> Total Function is created which calls Partial function
-> Since a function can't call another function, but can call partial function so partial function is created here
-> Partial function works as a subset or as a whole of Total function
=>> Since the given code works only for Int type numbers or with Float, Long, Double etc. if Types are specified explicitly,
so PartialFunctionSumSquare.scala is created with an aim of showing
how to work with Partial Function and generics all along


*/

//<<<<<<<<<<<<<<<<<------------------ SOLUTION 3 STARTS ------------------>>>>>>>>>>>>>>>>>>

//first method of using Partial function with case statement
val sum: PartialFunction[(Int, Int), Int] = {   //Partial function takes two arguments (Int, Int) and returns Int
  case (x,y) => 10+x+y
}

//Output:
//sum: PartialFunction[(Int, Int),Int] = <function1>

//second method of using Partial function without case statement
val sum1 = (num1: Int, num2: Int) => { 10+num1+num2 }

//Output:
//sum1: (Int, Int) => Int = $Lambda$4372/1486335658@17438b01


//Below function squares the number received as argument
def squaresum(num:Int):Int = {
  num*num
}

//Output:
//squaresum: squaresum[](val num: Int) => Int


println("************** Using First method of partial function ***********")
println("Sum of two numbers (2,3 with 10 as constant)  is : "+sum(2,3)) //call to Partial Function sum is made
println("Square of Sum of two numbers (2,3 with 10 as constant)  is : "+squaresum(sum(2,3))) //call to Partial Function sqauresum() is made by passing sum as its argument

//Output of above three lines
/******** Using First method of partial function ***********
  res0: Unit = ()
Sum of two numbers (2,3 with 10 as constant)  is : 15
res1: Unit = ()
Square of Sum of two numbers (2,3 with 10 as constant)  is : 225
res2: Unit = ()
  */



println("************** Using Second method of partial function ***********")
println("Sum of two numbers (2,3 with 10 as constant)  is : "+sum1(5,6))  ///call to Partial Function sum1 is made
println("Square of Sum of two numbers (2,3 with 10 as constant)  is : "+squaresum(sum1(5,6)))  //call to Partial Function sqauresum() is made by passing sum1 as its argument

//Output of above three lines
/*
************** Using Second method of partial function ***********
  res3: Unit = ()
Sum of two numbers (2,3 with 10 as constant)  is : 21
res4: Unit = ()
Square of Sum of two numbers (2,3 with 10 as constant)  is : 441
res5: Unit = ()
*/

//<<<<<<<<<<<<<<<<<------------------ SOLUTION 3 ENDS ------------------>>>>>>>>>>>>>>>>>>

