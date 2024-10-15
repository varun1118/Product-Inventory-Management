public class SearchProduct {
    public void searchProduct(String name, String[] products, int price[]){
        int check=0;
        for(int i=0;i<products.length;i++){
            if(name.equals(products[i])){
                System.out.print("Price of "+name+" is : $");
                System.out.println(price[i]);
                check=1;
            }
        }
        if(check==0){
            System.out.println("Enter a valid input");
        }
    }
}
