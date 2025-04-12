class Sum { 
      // Overloaded sum(). This sum takes two int parameters 
    public void sum(int x, int y) 
    { int s;
       s=x+y;  
        System.out.println("addition of "+x+" and "+y+" is "+s); 
    
    }
public void sum(int x, double y) 
    { double s;
       s=x+y;  
        System.out.println("hi addition of "+x+" and "+y+" is "+s); 
    
    }

public void sum(double x, int y) 
    { double s;
       s=x+y;  
        System.out.println("addition of "+x+" and "+y+" is "+s); 
    
    } 
 
    // Overloaded sum(). This sum takes three int parameters 
    public void sum(int x, int y, int z) 
    { 
        int s;
       s=x+y+z;  
        System.out.println("addition of "+x+" and "+y+" and "+z+" is "+s); 
    
    } 
    // Overloaded sum(). This sum takes two double parameters 
    public void sum(double x, double y) 
    { 
       double s;
       s=x+y;  
        System.out.println("addition of "+x+" and "+y+" is "+s); 
    } 
     
    public static void main(String args[]) 
    { 
        Sum s = new Sum(); 
        s.sum(10, 20); 
        s.sum(10.20, 30); 
        s.sum(10, 20.50);
        s.sum(7,8,9);
        s.sum(6.7f,7.8); 
    } 
}
