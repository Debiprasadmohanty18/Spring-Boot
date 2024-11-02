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

         ~ XML File :- 
              --> context:annotation-config
              --> context:component-scan base-package="Package-Name"
   
         ~ StereoType Annotation - These Annotations are annotations which all are applied at the time of class level to inform spring framework to manage that particular class object.
              |
              |-->  * @Component - Takes care of creation of "Beans/Objects" & It's LifeCycle.
                    * @Component + WebPage
                          @Controller 
                          @RestController
                    * @Component + Business Logic      
                          @Service
                    * @Component + DataBase
                          @Repository
   

         ~ Annotation Approach :-                                          

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
              

7. Spring Core - 05

       --> Annotation Without XML file
       --> Annotation Approach With Java Config
              * ComponentScan(base-package = {"Package-Name"})

8. Spring Boot - 01

       --> By Default & Custom "Bean/Object" Count.
       
   
