call student service individually to get student name using below url port 6603
http://localhost:6603/getStudentName

call student service through college service using feign client (add pom.xml dependency, add @EnableFeignClients in main method, create one interface which service you want to call)
call using port 6602 
http://localhost:6602/college/getStudentName

