import scala.io.Source

class ExampleProgram{
  def read_file(path_to_file: String, fn: (String) => String): (String)={
    val data = Source.fromFile(path_to_file).getLines.mkString
    normalize(data: String)
  }
  
  def filter_chars(str_data: String, fn: (String) => String): (String)={
      val pattern = str_data.replaceAll("\\W", "")
      scan(pattern: String)
  }
  
}
