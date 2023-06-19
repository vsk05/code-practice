package main

class NumberPalindrome(givenNumber: Int) {


  var temp = givenNumber
  var rev = 0
  var rem = 0

  def checkPalindrome() = {
    while (temp != 0) {
      rem = temp % 10
      rev = rev * 10 + rem
      temp = temp / 10
    }
    if (rev == givenNumber)
      println("The given number is a Palindrome")
    else
      println("The given number is not a Palindrome")


  }
}
