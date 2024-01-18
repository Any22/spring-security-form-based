package net.springform.formbasedauthentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/***********************************************************************************************************
 * Form-based authentication uses standard HTML form (Login Form) fields to pass the username and password 
 * values to the server via a POST request.
 * In Form-based authentication, the server validates the credentials provided and creates a “session” tied 
 * to a unique token stored in a cookie and passed between the client and the server on each HTTP request. 
 * If the cookie is invalid or the user is logged out, the server then usually redirects to a login page.
 * 
 * Basic Authentication 
 *  Basic Authentication DO NOT use cookies, hence there is no concept of a session or logging out a user, 
 *  which means each request has to carry that header in order to be authenticated.

 * @author sakhtar
 *
 **********************************************************************************************************/
@SpringBootApplication
public class FormBasedAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormBasedAuthenticationApplication.class, args);
	}

}
