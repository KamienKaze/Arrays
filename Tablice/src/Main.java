public class Main {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, -3, -2, -1};

        System.out.println(countNegatives(input));
        System.out.print(sumPositives(input));
    }

    public static int countNegatives(int[] input) {

        int result = 0;

        for(int i = 0; i < input.length; i++) {
            if(input[i] < 0) {
                result++;
            }
        }

        return result;
    }

    public static int sumPositives(int[] input) {

        int result = 0;

        for(int i = 0; i < input.length; i++) {
            if(input[i] > 0) {
                result += input[i];
            }
        }

        return result;
    }
}