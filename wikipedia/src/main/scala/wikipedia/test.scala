import java.io.File

object Test {

  def filePath = {
    val resource = this.getClass.getClassLoader.getResource("wikipedia/wikipedia.dat")
    if (resource == null) sys.error("Please download the dataset as explained in the assignment instructions")
    new File(resource.toURI).getPath
  }
  def main(args: Array[String]){
    println(filePath)
  }
}
