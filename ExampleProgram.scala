import scala.io.Source

class ExampleProgram{
  def read_file(path_to_file: String, normalize: (String) => String): (String)={
    val data = Source.fromFile(path_to_file).getLines.mkString
    (data: String)
  }
  
  def filter_chars(str_data: String, scan: (String) => String): (String)={
      val pattern = str_data.replaceAll("\\W", "")
      (pattern: String)
  }
  
}
