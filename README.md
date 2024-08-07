# Grads_assignment_Day8_set2
Day 8 (2nd Aug 2024)

1)	Create a java application to test the following.
   
            a. Create threads by extending Thread class and Runnable interface
            
            b.Use join(),sleep() methods
            
            c.Synchronized method

2)    Create a java application to test the below features of collection framework.
  
            a. Store the objects and retrieve objects in ArrayList, Vector,LinkedList.
  
            b. Write a function which accepts array of objects returns the List object with the same data.

   4)  In the previous question make the below modifications to the Pizza class.
      
           a. add insertion date field of type Date.
        
           b. Override hashCode and equals method.
           
           c. Implement comparable interface. While comparing two objects consider pizza name field.



7) Create different implementation classes to Storage interface as mentioned below.
   
          a. PizzaListStoreImpl : Use Array list for storing the pizza objects
          
          b. PizzaSortedStoreImpl: Use Treeset for storing the pizza objects.
          
          c. PizzaMapStoreImpl: Use HashMap for storing the Pizza objects as values and pizza name as keys.

8) Modify getPizzaStore() as mentioned below. Method should accept integer as a parameter.
   
          a. PizzaStore getPizzaStor(int code) method.
          
          b. if code=1 then return PizzaStoreImpl object.
          
          c. if code=2 then return PizzaListStoreImpl.
          
          d. if code=3 then return PizzaSortedStoreImpl.
          
          e. For any other valu return PizzaMapStoreImpl.
