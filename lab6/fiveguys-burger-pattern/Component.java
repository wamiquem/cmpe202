  

public interface Component {

     void printDescription(String tag) ;
     void addChild(Component c);
     void removeChild(Component c);
     Component getChild(int i);
     void receipt();
     void packingSlip();
     
}
 
