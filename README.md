# authservice


Command to start/run the application
1) cd inside authservice
2) type ./mvnw spring-boot:run
3) press enter


Curls for different operations:

**SignUp**
curl --location 'http://localhost:46080/api/auth/signup' \
--header 'Content-Type: application/json' \
--data-raw '{
  "email": "user@example.com",
  "password": "yourPassword123"
}'

**SignIn**
curl --location 'http://localhost:46080/api/auth/signin' \
--header 'Content-Type: application/json' \
--data-raw '{
  "email": "user@example.com",
  "password": "yourPassword123"
}'

**RefreshToken**
curl --location 'http://localhost:46080/api/auth/refreshtoken' \
--header 'Content-Type: application/json' \
--data '{
    "refreshToken": "<refreshToken from signin response>"
}'

**Logout/Revoke**
curl --location 'http://localhost:46080/api/auth/logout' \
--header 'Content-Type: application/json' \
--data-raw '{
    "email":"user@example.com"
}'

**Access protected API to validate if JWT token is working**
curl --location 'http://localhost:46080/api/test/protected' \
--header 'Authorization: Bearer <access_token from signin response>'



**Timeout for Access token is set to 1 minute**

**Timeout for Refresh token is set to 2 minutes**
