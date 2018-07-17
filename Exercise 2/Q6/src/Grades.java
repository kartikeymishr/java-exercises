public class Grades {
    private int numberOfStudents;
    private int[] grades;

    public int minimumGrade(int[] array) {
        int minimum = array[0];

        for (int i = 1; i < array.length; i++) {
            if (minimum > array[i]) {
                minimum = array[i];
            }
        }

        return minimum;
    }

    public int maximumGrade(int[] array) {
        int maximum = array[0];

        for (int i = 1; i < array.length; i++) {
            if (maximum < array[i]) {
                maximum = array[i];
            }
        }

        return maximum;
    }

    public double averageGrade(int[] array) {
        double average = 0.0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        average = sum / array.length;

        return average;
    }
}
