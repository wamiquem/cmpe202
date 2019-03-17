  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
        

        CustomBurger customBurger = new CustomBurger( "LBB",5.59 ) ;
      
        Patty p = new Patty( "Patty Option" ) ;
        String[] po = { "BACON" } ;
        p.setOptions( po ) ;
        
        OnBunToppings obt = new OnBunToppings( "On Bun Toppings Options" ) ;
        String[] obto = { "LETTUCE", "TOMATO" } ;
        obt.setOptions( obto ) ;
        //obt.wrapDecorator( p ) ;

        OnMeatToppings omt = new OnMeatToppings( "On Meat Toppings Options" ) ;
        String[] omto = { "G ONION", "JALA Grilled"} ;
        omt.setOptions( omto ) ;
        //omt.wrapDecorator( obt ) ;
        
        //customBurger.setDecorator( omt ) ;
        customBurger.addChild( p ) ;
        customBurger.addChild( obt ) ;
        customBurger.addChild( omt ) ;
        
        order.addChild( customBurger ) ;
        order.addChild(new Leaf("LTJ CAJ", 2.79 ));
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/