1. I have re-implemented the  command pattern using Java Lambda.

2. The Interface 'Receiver' is a Functional Interface as it has a single abstract function(doAction()).

3. There is no concrete class that implements this Interface but in the Client class, there are anonymous classes as follows:

   sayHello.setReceiver(
                   new Receiver() {
                       public void doAction() {
                           System.out.println( helloMessage ); 
                       }
                   }
           );

    This is actually an example of behavior parameterization - we are actually giving the command an object of the type Receiver that represents an action. But, this leads to bulky, verbose and boiler plate of codes which are not so easily readable.

4. Lambda expression enables key to functional thinking: parameterizing code by behavior. We don’t want to pass in an object; what we really want to do is pass in some behavior. Above anonymous class is replaced with lambda expression as shown below in my implementation:

   sayHello.setReceiver(() -> System.out.println( helloMessage ));

   As we can see, there are no implementations and instantiations of the functional interface 'Receiver' but lambda expression to associate behavior. Also, unlike anonymous classes, there is no need of providing Interface type explicitly and also no return type(in case the abstract function returns by contract),  yet this example still compiles. This is called as type inference which is taken care by the java compiler. The code is more readable, concise and has cleaner syntax.

5. Furthermore, we could have used any existing standard functional interface that takes argument of same type and has same return type, because compiler does not worry about the name of the interface.