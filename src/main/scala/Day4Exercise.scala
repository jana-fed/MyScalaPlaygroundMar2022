import scala.io.StdIn.readLine

object Day4Exercise extends App {
val Name = readLine("What is Your name?")
val WorkYears = readLine("How many years are you working in your firm?").toInt
  val Wage = readLine("And what is Your monthly wage?").toInt
  if (WorkYears > 2) {
  val Bonus = ((WorkYears - 2) * 0.15 * Wage).toInt
    println(s"Your Christmas bonus is $Bonus")
  }
  else if (WorkYears == 2) {val bb = Wage * 0.15
  println(s"Your Christmas bonus is $bb")}
  else { println("You don't get a bonus!")}
}
