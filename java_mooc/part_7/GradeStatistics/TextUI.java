import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private Grade grades;

    public TextUI(Scanner scanner, Grade grades) {
        this.scanner = scanner;
        this.grades = grades;
    }

    public void start() {
        System.out.println("Enter points totals, -1 stops: ");
        while (true) {
            String input = scanner.nextLine();

            int number = Integer.valueOf(input);

            if (number == -1) {
                break;
            }

            grades.add(number);

        }


        System.out.println("Point average (all): " + grades.getAverageAll());
        System.out.println("Point average (passing): " + grades.getAveragePassing());
        System.out.println("Pass percentage: " + grades.passPercentage());
//        System.out.println("Grade distribution: " + grades.gradeDistribution());

    }

}
