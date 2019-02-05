# cmpe202
CMPE 202 lab 1 - Part 1

I have changed the insertQuarter function to insertCoin function in order to support all the 3 machines.
Also, for the GumballMachine constructor, added 2 more arguments(cost - cost of machine, accepted_coins[] - to specify which all coins are acceptable for this machine and msg_accepted_coins to display proper message in case the coin is not allowed).

Displaying the remaining cents in case user is turning crank before the total amount is inserted. Also, displaying the extra amount in case user inserted more than the required total amount. Also, not returning the coin to user in any case.

If any new machine needs to be implemented, just pass the proper parameter. Code Maintainability and Reusability is taken into mind when impelementing this assignment.
