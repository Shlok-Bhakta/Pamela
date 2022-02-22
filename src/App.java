import java.util.Scanner;
import java.io.File;
import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("pamela.dat"));
        int loop = scanner.nextInt();

        for(int i = 0; i < loop; i++) {
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();

            int[][] table = new int[rows][cols];
            System.out.println("Case: " + (i + 1));
            for(int k = 0; k < table.length; k++) {
                for(int j = 0; j < table[k].length; j++) {
                        table[k][j] = scanner.nextInt();

                }
                System.out.println(rowSum(table[k]));
                //about to implement rowmins from Line 43
            }

            

            System.out.println("====================");

        }


    }
    public static int rowSum(int[] rowNums){
        int sum = 0;
        for(int i = 0; i < rowNums.length; i++){
            sum = sum + rowNums[i];
        }


        return sum;

    }

    public static int rowMin(int[] rowNums){
        int min = 9999;

        Arrays.sort(rowNums);

        min = rowNums[0];


        return min;
    }

}
