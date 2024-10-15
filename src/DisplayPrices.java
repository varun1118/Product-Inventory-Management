public class DisplayPrices {
    public void display(int price[], String products[]){
        for (int i = 0; i < price.length; i++) {
            System.out.print("Price of "+products[i]+" is : $");
            System.out.println(price[i]);
        }
    }
}
