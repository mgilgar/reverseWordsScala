import scala.collection

object Main extends App {
	val numberOfCases = readInt()
	// [Type] used to specify the type of the elements in the array
	var lines = new Array[String](numberOfCases) // var defines a variable, no need to use ;
	for (i <- 0 to numberOfCases - 1) {
	  lines(i) = Console.readLine // () to access the components of an array.
	}
	
	// Java traditional way
	for(line <- lines) {
	  val words = line.split(" ")
	  for (i <- words.length - 1 to 0) {
	    print(words(i) + " ")
	  }
	  println()
	}
	
	// Scala-Java way
	for (line <- lines) { // for each
	  val words = line.split(" ")
	  // 3 different ways of doing the same

	  
	  words.reverse.map( (m) => {print(m + " ") }) // applying an annonymous function
	  words.reverse.map( (m) => {print(m); print(" ")}) // no need to use () if we are not passing an argument
	  words.reverse.map( print) // easy way to apply a function to the elements of an array without a loop
	  println
	}
	
	// Scala 100%!
	// The same in a more concise and scala and functional programming way of doing things
	lines.map((line) => {
	  line.split(" ").reverse.map( (m) => {print(m + " ")})
	})
}