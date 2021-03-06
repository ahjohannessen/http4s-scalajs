package components.app

import components.{AppLoc, TestLoc}
import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.RouterCtl
import japgolly.scalajs.react.vdom.html_<^._

object HomePage {

  case class Props(rctl: RouterCtl[AppLoc]) {
    @inline def render: VdomElement = Component(this)
  }

  final class Backend($ : BackendScope[Props, Unit]) {
    def render(p: Props): VdomElement =
      p.rctl.link(TestLoc)("test")
  }

  val Component = ScalaComponent
    .builder[Props]("LogInForm")
    .renderBackend[Backend]
    .build
}
