 @main
  def main(): Unit = {
   val str ="11+2"
   println(s"The string:         $str")
   // tokenize the input string
   val tokens=tokenize(str)
   println(s"After Tokenizing:   $tokens")
   //parse
   val parseResult = RDP.parse(tokens)
    println (s"After Parsing:      $parseResult")
   //evaluate the string
    val value = Exp.eval(parseResult )
   println(s"After evaluation:   $value")
  }









