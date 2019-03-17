# cmpe202
*******CMPE 202 lab 1 - Part 1**********
I have changed the insertQuarter method to insertCoin method to accept coin value in order to support all the 3 machines.
Also, for the GumballMachine constructor, added 3 more arguments(cost - cost of machine, accepted_coins[] - to specify which all coins are acceptable for this machine and msg_accepted_coins to display proper message in case the coin is not allowed).

Displaying the remaining cents in case user is turning crank before the total amount is inserted. Also, displaying the extra amount in case user inserted more than the required total amount. Also, not returning the coin to user in any case.

If any new type of machine is added, just pass the proper parameter when instantiating the GumballMachine class and the same program will work. Code Maintainability and Reusability is taken into mind when implementing this assignment.

*******CMPE 202 lab 1 - Part 2**********
I have changed the insertQuarter method to insertCoin method to accept coin value as an argument in all classes in order to support all the 3 machines.
Also, changed the name of the classes NoQuarterState and HasQuarterState to NoCoinState and HasRequiredAmountState respectively, as these classes will now support for all kind of machines and not specific Quarter Only machine.
Additionally, I have created 1 more class HasNoRequiredAmountState that implements the same interface 'State'. This class is added in case more than 1 coin is needed in a machine to reach to the required cost of that machine.

This program also displays remaining cents in case of multiple coin scenario.

If any new type of machine is added, just pass the proper parameter when instantiating the GumballMachine class and the same program will work. Code Maintainability and Reusability is taken into mind when implementing this assignment.
