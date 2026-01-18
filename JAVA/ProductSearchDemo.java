import java.util.*;
class Product
{
    private int code;
    private String name;
    private double price;
    private int qty;  
    void setProduct() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter code,name, price and quantity and manufacturing date (dd/mm/yyyy)");
        code=sc.nextInt();
        name=sc.next();
        price=sc.nextDouble();
        qty=sc.nextInt();
    }
    void getProduct()
    {
    System.out.println("Code="+ code);
    System.out.println("Name="+ name);
    System.out.println("Price="+ price);
    System.out.println("Quantity="+ qty);       
    }
    static int search_product(Product p[])
    {
        int i;
        int pcode;
        System.out.println("Enter the code of the product to be searched ");
        Scanner sc=new Scanner(System.in);
        pcode=sc.nextInt();
        // sequential search
        for(i=0;i<p.length;i++)
        {
            if(p[i].code==pcode)
            {
                return i;
            }    

        }  // end of for   
        return -1; // prodiuct not found
    } // end of search_product()
} // end of product class
class ProductSearchDemo
{
    public static void main(String args[]) throws Exception
    {    
        Scanner sc=new Scanner(System.in);
        System.out.println("How many products you want to enter?");
        int n=sc.nextInt();
        Product p[]=new Product[n];
        int i;
        for(i=0;i<n;i++)
        {
            p[i]=new Product();
            p[i].setProduct();    

        }    
        int id =Product.search_product(p);
        if(id==-1)
        {
         System.out.println("Product Not Found");   
        }    
        else
        {
            System.out.println("Product details are as follows:");
            p[id].getProduct();
        }    
     }
}  
          
            
           
                       