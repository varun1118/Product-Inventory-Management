import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("************");
        System.out.println("Welcome to Varun's Book Store");
        System.out.println("************");
        String[] products = {"Importance Of Hard Work","Rich Dad Poor Dad","11 Habits of Successful People","The Alchemist","The Story of Bill Gates"};
        int[] price = {34,89,56,67,98};
        DisplayPrices dp= new DisplayPrices();
        System.out.println("Please See Below Our Collection");
        dp.display(price,products);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the name of the book you want to search");
        String name = sc.nextLine();
        SearchProduct sp= new SearchProduct();
        sp.searchProduct(name,products,price);
    }
}