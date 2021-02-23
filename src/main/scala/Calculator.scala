//SBT ASSIGNMENT 2
//Calculator in Scala using sbt

class Calculator {
  def ADD(num1: Int, num2: Int): Int = num1 + num2

  def SUB(num1: Int, num2: Int): Int = num1 - num2

  def MULTIPLY(num1: Int, num2: Int): Int = num1 * num2

  def DIVIDE(dividend: Int, divisor: Int): Int = dividend / divisor

  def POWER(num1: Double, num2: Double): Double = scala.math.pow(num1, num2)

  def ABSOLUTE(number: Double): Double = Math.abs(number)    //Returns the distance from zero

  def MODULUS(num1: Int, num2: Int): Int = num1 % num2

  //Checks for Maximum number and stores it in MAX variable
  def MAX_OF_2(num1: Int, num2: Int): Unit = {   //Used Unit instead of Int because function has no return type
    var MAX = 0
    if (num1 > num2) MAX = num1
    else MAX = num2
  }

  //Checks for the minimum number and stores it in MIN variable
  def MIN_OF_2(num1: Int, num2: Int): Unit = {   //Used Unit instead of Int because function has no return type
    var MIN = 0
    if(num1 < num2)  MIN = num1
    else MIN = num2
  }

}
