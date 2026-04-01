import java.util.Scanner;
public class fitnessC {
    public static double calculateBMI (double BMI)
    {
        return BMI = (weight * 703) / (height * height);
    }
    public static int maxHeartRate (int MHR)
    {
        return MHR = (220 - age);
    }
    public static double caloriesBurned (double cal)
    {
        return cal = minutes * weight * 0.063;
    }
    public static double dailyWaterIntake (double oz)
    {
        return oz = weight * 0.5;
    }
    public static double running (double pace)
    {
        return pace = minutes / distance;
    }
    public static double lbsToKg (double kg)
    {
        return kg = pounds * 0.4536;
    }



public static void main(String[] args) 
{
    

       Scanner scanner = new Scanner(System.in);

       int choice = 0;

 

       while (choice != 7) {

           // Display the menu

           System.out.println("\n===== Fitness Calculator =====");

           System.out.println("1. Calculate BMI");

           System.out.println("2. Maximum Heart Rate");

           System.out.println("3. Calories Burned (Running)");

           System.out.println("4. Daily Water Intake (oz)");

           System.out.println("5. Running Pace (min/mile)");

           System.out.println("6. Convert Pounds to Kilograms");

           System.out.println("7. Exit");

           System.out.print("Enter your choice (1-7): ");

           choice = scanner.nextInt();

 

           switch (choice) {

               case 1:

                   System.out.print("Enter weight (lbs): ");

                   double w1 = scanner.nextDouble();

                   System.out.print("Enter height (inches): ");

                   double h1 = scanner.nextDouble();

                   // TODO: Call calculateBMI and print the result

                   // Example output: "BMI = 24.96"

 

                   break;

               case 2:

                   System.out.print("Enter your age: ");

                   int age = scanner.nextInt();

                   // TODO: Call maxHeartRate and print the result

                   // Example output: "Max Heart Rate = 195 bpm"

 

                   break;

               case 3:

                   System.out.print("Enter minutes of running: ");

                   double min3 = scanner.nextDouble();

                   System.out.print("Enter your weight (lbs): ");

                   double w3 = scanner.nextDouble();

                   // TODO: Call caloriesBurned and print the result

                   // Example output: "Calories Burned = 283.50"

 

                   break;

               case 4:

                   System.out.print("Enter your weight (lbs): ");

                   double w4 = scanner.nextDouble();

                   // TODO: Call dailyWaterIntake and print the result

                   // Example output: "Water Intake = 75.00 oz"

 

                   break;

               case 5:

                   System.out.print("Enter distance (miles): ");

                   double d5 = scanner.nextDouble();

                   System.out.print("Enter total minutes: ");

                   double min5 = scanner.nextDouble();

                   // TODO: Call runningPace and print the result

                   // Example output: "Pace = 8.33 min/mile"

 

                   break;

               case 6:

                   System.out.print("Enter weight (lbs): ");

                   double lbs6 = scanner.nextDouble();

                   // TODO: Call lbsToKg and print the result

                   // Example output: "Weight = 68.04 kg"

 

                   break;

               case 7:

                   System.out.println("Stay healthy! Goodbye!");

                   break;

               default:

                   System.out.println("Invalid choice. Please try again.");

           }

       }

 

       scanner.close();

   }

}