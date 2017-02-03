import com.typesafe.config.ConfigFactory

trait Config {
  protected case class HttpConfig(interface: String, port: Int)
  private val config = ConfigFactory.load()
  protected val httpConfig = HttpConfig(config.getString("http.interface"), config.getInt("http.port"))
}

object Config extends Config
