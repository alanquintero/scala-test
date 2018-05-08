package apple.hello

class Hello {

  def hello() { println("Hello World from Scala") } // [1]

  def helloThere(s : String) {println("Hello " + s)}

  def addInt( a:Int, b:Int ) : Int = {
    var sum:Int = 0
    sum = a + b
    return sum
  }

}