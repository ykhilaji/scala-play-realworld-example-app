package users.test_helpers

import authentication.models.PlainTextPassword
import commons.models.{Email, Username}
import users.models.UserRegistration

object UserRegistrations {
  val petycjaRegistration: UserRegistration =
    UserRegistration(Username("petycja"), PlainTextPassword("a valid password"), Email("petycja@example.com"))

  val kopernikRegistration: UserRegistration =
    UserRegistration(Username("kopernik"), PlainTextPassword("a valid password"), Email("kopernik@example.com"))
}