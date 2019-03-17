  

public class Client {

    public static void runTest()
    {
        Component theOrder = BuildOrder.getOrder() ;
        
        //Change Strategy to PrintReceiptStrategy
        theOrder.receipt();
        theOrder.printDescription("Receipt");
        
        System.out.println( "\n"+"***********************************************" );
        
        //Change Strategy to PrintPackingSlipStrategy
        theOrder.packingSlip();
        theOrder.printDescription("Packing Slip");

    }
}
 
