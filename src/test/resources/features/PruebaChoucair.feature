# Autor : Jesus Alberto Leudo Maturana

  @stories

  Feature: Utest registration
    As a user, I want to enter Utest to register a new user
  @scenario
  Scenario: New user registration in Utest
    Given than Ibra wants to open the Utest page
    When register the data in the form
    | strfirstName | strlastName | strEmail | strlanguage |
    | tuNombre     |  TuApellido | TuCorreo | TuIdioma    |
    Then valid that the user has been created
    | strUser     | strPassword   |
    | TuUsuario   | TuContraseña  |