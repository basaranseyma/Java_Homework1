import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // variables created
        int math, physics, chemistry, turkish, history, music;

        // Scanner class defined
        Scanner inp = new Scanner(System.in);

        // Received values from the user
        System.out.print("Enter your Math grade: ");
        math = inp.nextInt();

        System.out.print("Enter your Physics grade: ");
        physics = inp.nextInt();

        System.out.print("Enter your Chemistry grade: ");
        chemistry = inp.nextInt();

        System.out.print("Enter your Turkish grade: ");
        turkish = inp.nextInt();

        System.out.print("Enter your History grade: ");
        history = inp.nextInt();

        System.out.print("Enter your Music grade: ");
        music = inp.nextInt();

        // average calculated
        int total = (math + physics + chemistry + turkish + history + music);
        double average = total / 6.0;
        System.out.println("Your average grade: " + average);

        // passing status checked
        boolean isPassed = average >= 60;

        // class status printed
        System.out.println("Class status: " + (isPassed ? "Passed" : "Failed"));
    }
}