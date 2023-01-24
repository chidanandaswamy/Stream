package Assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	static int i=1;
	 public static void main(String[] args) {  
		
		        List<Product> productList = new ArrayList<Product>();
		        Scanner scan = new Scanner(System.in);
		        while (true) {
		            System.out.println("Enter The Product id: ");
		            int id = scan.nextInt();
		            System.out.println("enter The name: ");
		            String name = scan.next();
		            System.out.println("Enter The Cost");
		            int cost = scan.nextInt();
		            
		            //Adding product details to ArrayList
		            productList.add(new Product(id, name, cost));
		            
		            
		            System.out.println("Do you want to add more product: yes or no");
		            String ans = scan.next();
		            if ("No".equalsIgnoreCase(ans)) {
		                break;
		            }
		        }
//		        Stream<Product> productListStream = productList.stream();
//		        for (Product product : productList) {
//		            System.out.println(product.productId + " " + product.Name + " " + product.cost);
//		        }
 System.out.println("*************************************************************************************************************************************************************   ");
			    
		        Set<Float> productPriceList = productList.stream().filter(a -> a.cost < 100).map(a -> a.cost)
		                .collect(Collectors.toSet());
		        System.out.println("(4) 1. products which are less then the price 100=" + " " + productPriceList);
		        
 System.out.println("************************************************************************************************************************************************************   ");
		        
		        System.out.println("(5) 2. display a list of products newProductStream using the forEach() method");
		        productList.stream().forEach(System.out::println);
		        
 System.out.println("************************************************************************************************************************************************************   ");
        
		        System.out.println("   ");
		        Product productA = productList.stream().max((product1, product2) -> product1.cost > product2.cost ? 1 : -1).get();
		        System.out.println("a. maximum price of the product =" + " " + productA.cost);
		        
 System.out.println("************************************************************************************************************************************************************   ");
	        
		        System.out.println("   ");
		        
		        
		        Product product = productList.stream().min((product1, product2) -> product1.cost > product2.cost ? 1 : -1).get();
		        System.out.println("b. minimum price of the product =" + "  " + product.cost);
		        
		        
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

                            List<Product> ps = new ArrayList<Product>();  


                                     //Adding Products  
                            ps.add(new Product(1,"HP Laptop",25000.0f));  
                            ps.add(new Product(2,"Dell Laptop",30000.0f));  
                           	ps.add(new Product(3,"Lenevo Laptop",28000.0f));  
                           	ps.add(new Product(4,"Sony Laptop",28000.0f));  
                           	ps.add(new Product(5,"Apple Laptop",90000.0f));  
System.out.println("********************************************************************************************************************************************************************");
                           	List<Float> c   =  ps.stream().filter(a -> a.cost < 100).map(a -> a.cost).collect(Collectors.toList());
		                                      System.out.println("Product which cost more than 100" +c);
System.out.println("***********************************************************************************************************************************************************");	        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		    }
}