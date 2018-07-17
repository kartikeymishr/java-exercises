public class Grades {
    private int numberOfStudents;
    private int[] grades;

    public Grades(int numberOfStudents, int[] grades) {
        this.numberOfStudents = numberOfStudents;
        this.grades = grades;
    }

    public boolean validateArray() {
        boolean flag = false;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 100 && grades[i] > 0) {
                flag = true;
            }
        }
        return flag;
    }

    public int minimumGrade(int[] array) {
        int minimum = 0;

        if (validateArray()) {
            minimum = array[0];

            for (int i = 1; i < array.length; i++) {
                if (minimum > array[i]) {
                    minimum = array[i];
                }
            }
        }

        return minimum;
    }

    public int maximumGrade(int[] array) {
        int maximum = 0;

        if (validateArray()) {
            maximum = array[0];

            for (int i = 1; i < array.length; i++) {
                if (maximum < array[i]) {
                    maximum = array[i];
                }
            }
        }

        return maximum;
    }

    public double averageGrade(int[] array) {
        double average = 0;

        if (validateArray()) {
            average = 0.0;
            int sum = 0;

            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }

            average = sum / array.length;
        }

        return average;
    }
}
