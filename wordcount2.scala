object count{
  def main(args: Array[String]) {
     val fruit = List("apples","apples","apples","orange", "pears","apples","apples","apples","orange","orange","strawberry","apples","apples","orange","orange","apples","strawberry","cherry","cherry","orange","cherry")
     val word = fruit.flatMap(_.split("\n"))
     val counter = word.map(word => (word,1)).groupBy(_._1)
     val reduce = counter.mapValues(_.length)
     println(reduce)
  }
}
