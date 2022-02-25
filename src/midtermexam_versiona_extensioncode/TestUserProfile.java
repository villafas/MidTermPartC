package midtermexam_versiona_extensioncode;

import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("--CREATE A USER PROFILE--");
        System.out.print("Please enter your NAME: ");
        String name = scan.nextLine();
        System.out.println("Please pick your favorite GENRE from the following:");
        System.out.println("-- Comedy - Drama - Action - Mystery --");
        System.out.print("Choice: ");
        String favGenre = scan.nextLine();
        
        UserProfile user1 = new UserProfile(name, favGenre);
        System.out.println("Your user has been created!");
    }
}
