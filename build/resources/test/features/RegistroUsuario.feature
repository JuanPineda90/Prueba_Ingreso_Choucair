Feature: Registro de usuario en la tienda virtual

Scenario: Registro de usuario
 Given El usuario ingresa a la pagina de la tienda virtual
 When El usuario pulsa clic en el boton Sign in
 And El usuario diligencia el formulario de la seccion CREATE AN ACCOUNT
 And El usuario pulsa clic en el boton Create an account
 And El usuario diligencia el formulario
 And El usuario pulsa clic en el boton Register
 Then El usuario ha sido registrado de forma correcta
