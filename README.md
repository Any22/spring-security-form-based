## Difference Between Basic Authentication and Fo rm-Based Authentication
1. Basic Authentication uses an HTTP header in order to provide the username and password when making a request to a server:
   Form-based authentication uses standard HTML form (Login Form) fields to pass the username and password values to the server via a POST request. For example:
2. Basic Authentication DO NOT use cookies, hence there is no concept of a session or logging out a user, which means each request has to carry that header in order to be authenticated.
    In Form-based authentication, the server validates the credentials provided and creates a “session” tied to a unique token stored in a cookie and passed between the client and the server on each HTTP request. If the cookie is invalid or the user is logged out, the server then usually redirects to a login page. 
3. In the case of Basic Authentication, a browser popup is used to collect the user's credentials. This appearance and behavior are consistent and browser-specific.
   the Form-Based authentication look and feel of the login form can be customized to fit the design and branding of the application. This allows for a more integrated and user-friendly experience.
