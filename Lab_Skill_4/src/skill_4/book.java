package skill_4;

public class book 
{
	private String title;
    private String author;
    private int price;
  
  
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public void setAuthor(String author) 
    {
        this.author = author;
    }
    
    public void setPrice(int price) 
    {
        this.price = price;
    }
    
    
    
    public String getTitle() 
    {
        return title;
    }
    
    public String getAuthor() 
    {
        return author;
    }
    
    public double getPrice() 
    {
        return price;
    }
    
    
    public String toString() 
    {
        return  title +" " + author +" " + price;
    }


    public static void main(String[] args) 
    {
        
        book myBook = new book();
        
        myBook.setTitle("corn");
        myBook.setAuthor("hemanth");
        myBook.setPrice(10);
        
        System.out.println(myBook);
  
    }

}