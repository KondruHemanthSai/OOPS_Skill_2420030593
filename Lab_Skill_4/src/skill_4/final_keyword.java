package skill_4;

class final_keyword
{
    
    final int x;

  
    final_keyword(int value) 
    {
        x = value;
    }

   
    void print() 
    {
        System.out.println("Final x = " + x);
    }

    public static void main(String[] args) 
    {
    	final_keyword obj = new final_keyword(10);
        obj.print();

       
        final int[] arr = {1, 2, 3};  

        arr[0] = 99;   
        System.out.print(arr[0]); 
        System.out.print(" "+ arr[1]); 
        System.out.print(" "+arr[2]); 
        
        

        
    }
}
