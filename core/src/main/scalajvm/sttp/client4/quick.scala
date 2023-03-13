package sttp.client4

object quick extends SttpApi {
  lazy val backend: SyncBackend = HttpClientSyncBackend()

  implicit class RichRequest[T](val request: Request[T]) {
    def send(): Response[T] = backend.send(request)
  }
}
