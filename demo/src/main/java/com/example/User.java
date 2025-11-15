package com.example;

import java.util.Scanner; // Importa la clase Scanner para entrada de datos

public class User {

    private Scanner sc = new Scanner(System.in);

    // Credentials default
    private String email = "no-reply@example.com";
    private String password = "12345677";

    public void login() {
        System.out.println("Bienvenido, por favor ingrese sus credenciales.");
        System.out.print("Ingrese su email:" );
        String emailIn = sc.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String passwordIn = sc.nextLine();

        if (this.email.equals(emailIn) && this.password.equals(passwordIn)) {
            System.out.println("Inicio de sesión exitoso. ¡Bienvenido!");
        } else {
            System.out.println("Error: Credenciales incorrectas.");
        }
    }

    public void Profile() {
        System.out.println("Perfil de Usuario");
        System.out.println("Email: " + this.email);
        System.out.println("Password: " + this.password);
    }
}
