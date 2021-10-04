package main.java;

import java.util.Scanner;

public class UserInformation {
    public static void main(String[] args) {
        Scanner newUser = new Scanner(System.in);
        System.out.println("Please type your name here: " );
        u1 = newUser.next();
        System.out.println("How old are you? : ");
        age = newUser.nextInt();
        System.out.println("what is your gender?: ");
        u3 = newUser.next();
        System.out.println("Where did you study?: ");
        u4 = newUser.next();
        System.out.println("Whats is your email?: ");
        u5 = newUser.next();
        System.out.println("What is your profession?: ");
        u6 = newUser.next();
        System.out.println("Where do you work?: ");
        u7 = newUser.next()

    }
    public static String newCV (String u1, int age, String u3, String u4, String u5, String u6, String u7){
        return "My name is" + u1 + "I am" + age + "years old and I identify as" + u3 + ". I studied at " + u4 + ". My email adress is: " + u5 + ". I currently work as " + u6 + " in " + u7 + ".";
    }
}
