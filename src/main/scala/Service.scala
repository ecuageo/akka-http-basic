import akka.http.scaladsl.model.{ContentTypes, HttpEntity}
import akka.http.scaladsl.server.Directives._

trait Service {

  val route =
    path("basic") {
      get {
        complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, "<h1>Basic impl of akka-http</h1>"))
      }
    }
}
