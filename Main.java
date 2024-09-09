//Ai was used to aid in this project
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112!");

        String randomPrompt = "Your random number is: ";

        randomNum();
        promptRandom(randomPrompt);
    }

    public static void promptRandom(String randomPrompt) {

        System.out.println(randomPrompt + randomNum());
    }
    

    public static double randomNum() {
        return Math.round(Math.random() * 10);
        
    }
}
