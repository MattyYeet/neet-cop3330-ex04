package example4;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = input.nextLine();

        System.out.print("Enter a verb: ");
        String verb = input.nextLine();

        System.out.print("Enter an adjective: ");
        String adj = input.nextLine();

        System.out.print("Enter an adverb: ");
        String adv = input.nextLine();

        System.out.println(String.format("Do you %s your %s %s %s? That's hilarious!", verb, adj, noun, adv));
    }
}
