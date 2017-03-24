//Write MyBook Class
class MyBook extends Book
    {
    int price;
    MyBook(String title,String Author,int price)
        {
        super(title,Author);
        this.price=price;
        
        
    }
    void display() 
        {
        System.out.println("Title: "+ super.title);
         System.out.println("Author: "+ super.author);
         System.out.println("Price: "+ price);
    }
}