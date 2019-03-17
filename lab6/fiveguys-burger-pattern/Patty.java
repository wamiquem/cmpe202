public class Patty extends Leaf
{
    private String[] options ;
    
    
    public Patty( String d )
    {
        super(d) ;
    }
    
    public void setOptions( String[] options )
    {
        this.options = options ;
    }
    
    public void printDescription(String tag) {
        System.out.println( "     " + getDescription()) ;
    }
    
    public String getDescription() 
    {
        String desc = "  " ;
        for ( int i = 0; i<options.length; i++ )
        {
            desc += "{{{{ " + options[i] + " }}}}";
        }        
        return desc ;
    }
    
}
