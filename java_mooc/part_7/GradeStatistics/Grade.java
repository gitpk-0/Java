import java.util.ArrayList;

public class Grade {

    private ArrayList<Integer> grades;


    public Grade() {
        this.grades = new ArrayList<>();
    }

    public void add(int number) {
        if (number >= 0 && number <= 100) {
            this.grades.add(number);
        }
    }

    public double getAverageAll() {
        int sum = 0;
        int count = this.grades.size();
        for (int grade: this.grades) {
            sum += grade;
        }
        return (double) sum / count;
    }

    public double getAveragePassing() {
        int sum = 0;
        int count = 0;
        for (int grade: this.grades) {
            if (grade >= 50) {
                sum += grade;
                count++;
            }
        }
        return (double) sum / count;
    }

    public double passPercentage() {
        int count = this.grades.size();
        int passCount = 0;
        for (int grade: this.grades) {
            if (grade >= 50) {
                passCount++;
            }
        }
        return (double) passCount / count;
    }

    public String printGradeDistribution() {

        ArrayList<Integer> scale = new ArrayList<>();

        for (int grade: this.grades) {
            int points = 0;
            if (grade < 50) {
                points = 0;
            } else if (grade < 60) {
                points = 1;
            } else if (grade < 70) {
                points = 2;
            } else if (grade < 80) {
                points = 3;
            } else if (grade < 90) {
                points = 4;
            } else {
                points = 5;
            }
            scale.add(points);
        }

        int scaleNum = 5;
        int count = 0;
        for (int item: scale) {
            if (item == scaleNum) {
                count++;
            }
            System.out.println(scaleNum + ": " + );
        }




    }
}
