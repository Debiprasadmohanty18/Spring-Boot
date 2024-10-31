# Spring-Boot

1. Purpose Of Spring Boot

       --> Loose Coupling
       --> Time Saving
       --> Increases Productivity
           etc.

2. Spring Core - 01
 
       --> Inversion Of Control
       --> Dependency Injection with XML

3. Spring Core - 02

       --> Constructor Injection , Setter Injection
       --> Autowiring

4. Spring Core - 03

       --> ApplicationContext (Eager Initialization)
       --> BeanFactory (Lazy Initialization)

5. Spring Core - 04

         Annotation Approach :-                                          

               => Application Layered Approach
                        --> Web Layer
                               * HTTP Request / HTTP Response (Web Related Query)
                                       @Component + WebPage
                                              @Controller 
                                              @RestController
                        --> Service Layer
                               * Business Logic (Actual Purpose Of Application)
                                       @Component + Business Logic      
                                              @Service
                        --> Reository/DAO Layer
                               * Database Connectivity (All Related to DataBase)
                                      @Component + DataBase
                                             @Repository
    

          XML File :- 
              --> context:annotation-config
              --> context:component-scan base-package="Package-Name"

7. Spring Core - 05

       --> Annotation Without XML file
       --> @Component + 
       
   
