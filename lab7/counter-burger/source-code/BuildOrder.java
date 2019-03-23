public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;

        CustomBurger customBurger1 = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/2 lb and Organic Bison*
        Burger b1 = new Burger( "Burger Options" ) ;
        String[] bo1 = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
        b1.setOptions( bo1 ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c1 = new Cheese( "Cheese Options" ) ;
        String[] co1 = { "Yellow American", "Spicy Jalapeno Jack" } ;
        c1.setOptions( co1 ) ;
        c1.wrapDecorator( b1 ) ;
        // premium cheese +1.50
        PremiumCheese pc1 = new PremiumCheese( "Premium Cheese Options" ) ;
        String[] pco1 = { "Danish Blue Cheese"} ;
        pc1.setOptions( pco1 ) ;
        pc1.wrapDecorator( c1 ) ;
        // 1 sauce free, extra +.50
        Sauce s1 = new Sauce( "Sauce Options" ) ;
        String[] so1 = { "Mayonnaise", "Thai Peanut Sauce" } ;
        s1.setOptions( so1 ) ;
        s1.wrapDecorator( pc1 ) ;
        // unlimited toppings free
        Toppings t1 = new Toppings( "Toppings Options" ) ;
        String[] to1 = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles" } ;
        t1.setOptions( to1 ) ;
        t1.wrapDecorator( s1 ) ;
        // premium topping, price based on selection
        PremiumToppings pt1 = new PremiumToppings( "Premium Toppings Options" ) ;
        String[] pto1 = { "Marinated Tomatoes" } ;
        pt1.setOptions( pto1 ) ;
        pt1.wrapDecorator( t1 ) ;
        // bun, price based on selection
        Bun bun1 = new Bun( "Bun Options" ) ;
        String[] buno1 = { "Ciabatta (Vegan)" } ;
        bun1.setOptions( buno1 ) ;
        bun1.wrapDecorator( pt1 ) ;
        //Side +3.00
        Side side1 = new Side( "Side Options" ) ;
        String[] sideo1 = { "Shoestring Fries" } ;
        side1.setOptions( sideo1 ) ;
        side1.wrapDecorator( bun1 ) ;

        // Setup Custom Burger Ingredients
        customBurger1.setDecorator( side1 ) ;
        customBurger1.addChild( b1 ) ;
        customBurger1.addChild( c1 ) ;
        customBurger1.addChild( pc1 ) ;
        customBurger1.addChild( s1 ) ;
        customBurger1.addChild( t1 ) ;
        customBurger1.addChild( pt1 ) ;
        customBurger1.addChild( bun1 ) ;
        customBurger1.addChild( side1 ) ;

        CustomBurger customBurger2 = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/2 lb and Organic Bison*
        Burger b2 = new Burger( "Burger Options" ) ;
        String[] bo2 = { "Hormone & Antibiotic Free Beef*", "1/3lb.", "On A Bun" } ;
        b2.setOptions( bo2 ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c2 = new Cheese( "Cheese Options" ) ;
        String[] co2 = { "Smoked Gauda", "Greek Feta" } ;
        c2.setOptions( co2 ) ;
        c2.wrapDecorator( b2 ) ;
        // premium cheese +1.50
        PremiumCheese pc2 = new PremiumCheese( "Premium Cheese Options" ) ;
        String[] pco2 = { "Fresh Mozzarella"} ;
        pc2.setOptions( pco2 ) ;
        pc2.wrapDecorator( c2 ) ;
        // 1 sauce free, extra +.50
        Sauce s2 = new Sauce( "Sauce Options" ) ;
        String[] so2 = { "Habanero Salsa" } ;
        s2.setOptions( so2 ) ;
        s2.wrapDecorator( pc2 ) ;
        // unlimited toppings free
        Toppings t2 = new Toppings( "Toppings Options" ) ;
        String[] to2 = { "Crushed Peanuts" } ;
        t2.setOptions( to2 ) ;
        t2.wrapDecorator( s2 ) ;
        // premium topping, price based on selection
        PremiumToppings pt2 = new PremiumToppings( "Premium Toppings Options" ) ;
        String[] pto2 = { "Sunny Side Up Egg*", "Marinated Tomatoes" } ;
        pt2.setOptions( pto2 ) ;
        pt2.wrapDecorator( t2 ) ;
        // bun, price based on selection
        Bun bun2 = new Bun( "Bun Options" ) ;
        String[] buno2 = { "Gluten-Free Bun" } ;
        bun2.setOptions( buno2 ) ;
        bun2.wrapDecorator( pt2 ) ;
        //Side +3.00
        Side side2 = new Side( "Side Options" ) ;
        String[] sideo2 = { "Shoestring Fries" } ;
        side2.setOptions( sideo2 ) ;
        side2.wrapDecorator( bun2 ) ;

        // Setup Custom Burger Ingredients
        customBurger2.setDecorator( side2 ) ;
        customBurger2.addChild( b2 ) ;
        customBurger2.addChild( c2 ) ;
        customBurger2.addChild( pc2 ) ;
        customBurger2.addChild( s2 ) ;
        customBurger2.addChild( t2 ) ;
        customBurger2.addChild( pt2 ) ;
        customBurger2.addChild( bun2 ) ;
        customBurger2.addChild( side2 ) ;

        // Add Custom Burger to the ORder
        order.addChild( customBurger1 );
        order.addChild( customBurger2 );
        return order ;
    }

}

/*
Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

 */