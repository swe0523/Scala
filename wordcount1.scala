object count{
  def main(args: Array[String]) {
     val fruit = List("apples","apples","apples","orange", "pears","apples","apples","apples","orange","orange","strawberry","apples","apples","orange","orange","apples","strawberry","cherry","cherry","orange","cherry")
     val word = fruit.flatMap(_.split("\n"))                // separate each word in a list
     val counter = word.map(word => (word,1)).groupBy(_._1) // map each word with count1
     val reduce = counter.map( word => (word._1, word._2.foldLeft(0)((sum, c) => sum + c._2))) //Add the 1's associated with each word 
     println(reduce)
  }
}
