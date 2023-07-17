import java.util.Arrays;

public class Main {
    public static int[] columnSum(int[][] array){
        int columnSum[] = new int[array[0].length];
        int sum;
        for (int iterator1 = 0 ; iterator1 < array[0].length ; iterator1++){
            sum = 0;
            for (int iterator2 = 0 ; iterator2 < array.length ; iterator2++){
                sum += array[iterator2][iterator1];
            }
            columnSum[iterator1] = sum;
        }
        return columnSum;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(columnSum(new int[][] {{1,2,3,4}, {5,6,7,8}, {9,2,3,4}})));
    }
}