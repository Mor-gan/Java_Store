// // Class Instances
// public class Store {
//     // instance fields
//     String productType;
//     int inventoryCount;
//     double inventoryPrice;
    
//     // constructor method
//     public Store(String product, int count, double price) {
//       productType = product;
//       inventoryCount = count;
//       inventoryPrice = price;
//     }
    
//     // main method
//     public static void main(String[] args) {
//       Store lemonadeStand = new Store("lemonade", 42, .99);
//       Store cookieShop = new Store("cookies", 12, 3.75);
      
//       System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");
      
//       System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");
//     }
//   }

public class Store {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
   double newPrice = price + priceToAdd;
   price = newPrice;
  }
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
lemonadeStand.increasePrice(1.5);
System.out.println(lemonadeStand.price);    
  }
}