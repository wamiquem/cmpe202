1. I have re-implemented the  observer pattern using Java Lambda.

2. The Interface 'Observer' is a Functional Interface which means that it has a single abstract function. This interface had an implementation in the class 'ConcreteObserver' which was further extended by 2 sub classes 'Optimist' and 'Pessimist'. In the OberverTest class, object of these classes are explicitly instantiated and then passed to the ConcreteSubject's child class(TheEconomy) in order to register these observers for the subject's object s. As soon as the subject's state is changed the update method of the observers are invoked to update the state of the observers which is the core logic behind this observer pattern example. 

3. Although the actual logic of updating the observer's state after the subject's state is our core and single logic, there are additional taks like implementing the functional interface with some classes, overriding the abstract method, instantiating objects for each implementations. Then we invoke invoking the corresponding method on the instance which follows a usual flow. There is a lot of boiler code involved and unnecessary implementations and instantiations for a piece of a logic. What if there are dozens of observers and update logic changes, we need to change all such implementations.

4. To overcome this, we could have used anonymous classes. The anonymous inner class provides the implementation of the method which is an example of behavior parameterization. But, this again leads to bulky. verbose and boiler plate of codes. Also, code is not easy to read.

5. Lambda expression enables key to functional thinking: parameterizing code by behavior. We don’t want to pass in an object; what we really want to do is pass in some behavior.

6. In my implementation, I have removed all the implementations of the functional interface 'Observer' and passed the lambda expression. Instead of passing in an object that implements an interface, we’re
   passing in a block of code—a function without a name. Below is an example of my implementation of lambda:

   s.attach( () -> {
   //Some lines of code       	
           });

   As we can see, there are no implementations and instantiations of the functional interface 'Observer' but lambda expression to associate behavior. Also, unlike anonymous classes, there is no need of providing Interface type explicitly and also no return type(in case the abstract function returns by contract),  yet this example still compiles. This is called as type inference which is taken care by the java compiler. The code is more readable and overall complexity of the code is also reduced. Also, number of classes in our example is reduced.

7. Furthermore, we could have used any existing standard interface that takes argument of same type and has same return type, because compiler does not worry about the name of the interface. We have incorporated some functional programming concept using Lambda along with the object oreinted programming. 
