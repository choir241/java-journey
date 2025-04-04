import java.util.Scanner;

public class main{
    public static void main(String[]args){
        // user needs to select a menu item
        // how much budget do you have
        // how many would you like
        // determine how many the user is actually able to buy

        Scanner scan = new Scanner(System.in);

        System.out.println("What would you like to purchase?");
        System.out.println("Pizza");
        System.out.println("Hamburger");
        System.out.println("Hot Dog");
        String item = scan.nextLine();

        System.out.println("What is your budget?");
        double budget = scan.nextDouble();

        System.out.println("How many " + item + "s would you like?");
        int amount = scan.nextInt();

        if(item.equalsIgnoreCase("Pizza")){
            boolean check = 4.40 * amount > budget;
            if(check){
                System.out.println("You don't have enough money. You are " + ((4.40 * amount) - budget) + " short.");
            }else{
                System.out.println("Enjoy your " + item + "s! Your change is" + (budget - (4.40 * amount)));
            }
        }else if(item.equalsIgnoreCase("Hamburger")){
            boolean check = 6.70 * amount > budget;
            if(check){
                System.out.println("You don't have enough money. You are " + (6.70 * amount - budget) + " short.");
            }else{
                System.out.println("Enjoy your " + item + "s! Your change is" + (budget - (6.70 * amount)));
            }
        }else if(item.equalsIgnoreCase("Hot Dog")){
            boolean check = 3.20 * amount > budget;
            if(check){
                System.out.println("You don't have enough money. You are " + (3.20 * amount - budget) + " short.");
            }else{
                System.out.println("Enjoy your " + item + "s! Your change is  " + (budget - (3.20 * amount)));
            }
        }
    }
}