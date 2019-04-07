# CMPE202 Personal Project

## For Add Card, I have used below design patterns:
1. Composite Pattern - The Add Card screen has 4 components - CardNumber(New Class), CardPin(New Class), Spacer(Reused) and Keypad(Reused).
2. Chain of Responsibility Pattern - Same as was done for pinScreen components. The chain begins from CardNumber, then CardPin, Spacer and Keypad in this order.
3. State Pattern - A card can be in one of two states at a time - InvalidState or ValidState. 
4. Observer Pattern -
  * Subject Keypad has 2 observers - CardNumber and CardPin, but at a time only one observer is attached to the subject. This is done so that CardNumber and CardPin cannot be in focus simultaneously. subscribe() and unsubscribe() method is implemented to take care of this using which an observer can request the subject to attach/remove itself on run time.
  * Subject CardPin has 1 observer - CardStateMachine. On every CardPin digit count update, the observer is notified.
  * Subject CardNumber has 1 observer - CardStateMachine. On every CardNumber digit count update, the observer is notified.
  * Subject CardStateMachine has 1 observer - AddCard. As soon as the card state is changed, CardStateMachine notifies the observer to update the boolean flag validCard.
  5. Singleton pattern -
    * AppController class is singleton. In order to tackle the unit test failure, I am setting the instance to null on every App object creation.
    * Card class is singleton. Only one card instance is used to update and get the card number and amount.

## Add Card Flow:

1. As soon as we are on add card screen, keypad has only 1 observer(CardNumber).
2. As soon as the CardPin is touched, CardNumber unsubscribes itself and CardPin subscribes itself. I am handling this by maintaining the boolean flag IskeyPadActiveObserver in both CardNumber and CardPin. Every time CardNumber is touched, it tries to subscriber itself, if IskeyPadActiveObserver is already true no need to subscribe again. Also, nexthandler in chain of responsibility is CardPin, so everytimes CardNumber subscribes itself, it calls touch method of CardPin and CardPin unsubscriber itself if IskeyPadActiveObserver is true.
3. On even digit entry, CardNumber and CardPin notifies CardStateMachine . On notification from CardNumber and CardPin, numberCountUpdate and pinCountUpdate methods of CardStateMachine are called respectively. The CardStateMachine class changes the state of the card(that is being added on the Add Card Screen) based on CardNumber and CardPin digit count update. If the CardNumber digit count is greater than or equal to 9 and CardPin digit count is greater than or equal to 3, the CardState Machine changes the card state ValidState else it is InvalidState.
4. When the card state is changed, CardMachine notifies the observer(AddCard). Accordingly, AddClass updates its attribute validCard(true if card ValidState else false) via the method valEvent.
5. If next is pressed, if validCard flag is true, card number and card amount for the singleton card class instance are updated. Also, screen is changed to MyCards. If validCard is false, card number and card amount are not updated and still current screen is Add Card.

## UML Class diagram for Add Card:

I have considered all the related classes and interfaces for AddCard class, hence the diagram is little noisy as below:

![alt text](https://github.com/nguyensjsu/cmpe202-wamiquem/blob/master/starbucks-class_diagram.png "Starbucks Project UML class diagram")

## UML Sequence diagram  for Add Card:

* For this sequence diagram, I have considered the positive case of adding the card. First enter 9 digits of Card Number, then focus on Card Pin and enter 3 digits. On Next successful card addition and screen changes to MyCards.
* For Card Number and Card Pin entries, I have shown only single touch event - For Card Number, first digit entry touch is shown as for all 9 digit entries, same message flow happens. For Card Pin, I have shown the last digit entry touch flow, for digit 1 and digit 2 entries the flow will be similar to Card Number digit touch flow, except that CardPin notifies CardStateMachine instead of CardNumber.

![alt text](https://github.com/nguyensjsu/cmpe202-wamiquem/blob/master/starbucks-sequence_diagram.png "Starbucks Project UML sequence diagram")
